package hospital; 

import java.util.Scanner;

public class Principal {
    public static void main(String)[] args) {
        Scanner input = new Scanner(System.in);
        Paciente p1 = new Paciente ();

        System.out.println("Ingresa el nombre del paciente:");
        p1.nombre = input.nextline();

        System.out.println("Ingresa la edad:");
        p1.edad = input.nextlnt();
        input.nextline();

        System.out.print("Ingresa el número de expediente:");
        p1.numeroExpediente = input.nextline();

        input.close();

        p1.mostrarInformacion();

        
    }
}