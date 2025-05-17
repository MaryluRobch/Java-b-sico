public class CentralEmergencias{
    public static void main (String[] args) {
        Ambulancia ambulancia = new Ambulancia(nombre: "Ambulancia", nombreOperador: "Juan");
        Patrulla patrulla = new Patrulla (nombre: "Patrulla", nombreOperador: "Laura");
        UnidadBomberos bomberos = new Unidadbomberos (nombre: "UnidadBomberos", nombreOperador:"Marco");

        ambulancia.iniciarOperacion();
        System.out.println();

        patrulla.inicarOperaciones();
        System.out.println();

        bomberos.iniciarOperacion();
    }
}