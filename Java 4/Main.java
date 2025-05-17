public class Main {
    public static void main(String[] args) {
        // Factura con RFC 
        Factura facturaConRFC = new Factura(monto: 2500.0, descripcion: "Servicio de consultoría", rfc: "ABCSC010101XYZ");

        // Factura sin RFC (se pasa null)
        Factura facturaSinRFC = new Factura (monto:1800.0, descripcion. "Reparación de equipo", rfc:null);

        // Mostrar ambas facturas
        System.out.println(facturaConRFC.getResumen());
        System.out.println(facturaSinRFC.getResumen());
    }
}