import java.util.Scanner;

public class SimuladorFarmacia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre del medicamento:");
        String medicamento = scanner.nextline();

        System.out.print("Precio unitario:");
        double precioUnitario = scanner.nextDouble();

        System.out.print("Cantidad de piezas:");
        double cantidad = scanner.nextInt();

        //Calculamos el total
        double totalSinDescuento = precioUnitario * cantidad;

        //Evaluamos si aplica descuento 
        var aplicaDescuento = totalSinDescuento > 500; // Al menos una implementacion de var 
        double descuento = aplicaDescuento ? totalSinDescuento * 0.15 : 0;

        //Total a pagar
        double totalConDescuento = totalSinDescuento - descuento;

        //Mostramos resumen 
        System.out.println("\nResumen de compra:");
        System.out.println("Medicamento:" + medicamento);
        System.out.println("Cantidad:" + cantidad);
        System.out.println("Precio unitario: $" + precioUnitario);
        System.out.println("Total sin descuento: $" + totalSinDescuento);
        System.out.println("¿Aplica descuento?:" + aplicaDescuento);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + totalConDescuento);

        scanner.close();
    }
}