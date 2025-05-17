public class main {
    public state void main(String[] args) {

        // Creamos una declaración de impuestos
        DeclaracionImpuestos declaracion = new DeclaracionImpuestos (rfcContribuyente: "XAXX010101000", montoDeclarado: 8700.0);

        // Creamos una cuenta fiscal 
        CuentaFiscal cuenta = new CuentaFiscal (rfc: "XAXX010101000", saldoDisponible: 9500.0); 

        // Mostramos la información 
        Sytem.out.println("Declaración enviada por RFC: " + declaracion.rfcContribuyente() + 
        " por $" + declaracion.montoDeclarado());
        cuenta.mostrarCuenta();

        //Validamos si el RFC de la declaración es válido 
        boolean rfcValido = cuenta.validarRFC(declaracion);
        System.out.println("¿RFC válido para esta cuenta?: " + rfcVAlido); 
    }
}