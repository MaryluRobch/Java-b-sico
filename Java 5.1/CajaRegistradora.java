public class CajaRegistradora {
    public static void main(String[] args) {
        MetodoPago[] pagos = {
            new PagoEfectivo (monto: 150.00),
            new PagoTarjeta (monto: 320.0, saldoDisponible: 500.0),
            new PagoTransferencia(monto:250.0, validadoExternamente: false) // esta dallará en autenticación
        };

        for (MetodoPago pago : pagos) {
            if (pago.autenticar()) {
                System.out.println("Autenticación exitosa.");
                pago.procesarPago();
                pago.mostrarResumen();
            } else{
                System.out.println("Fallo de autenticación. " + pago.getClass().getSimpleName() + " no válido.");
        }
        System.out.println();
        }
    } 
}