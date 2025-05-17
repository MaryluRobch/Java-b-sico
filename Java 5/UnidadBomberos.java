public calss UnidadBomberos extends UnidadEmergencia {
    private SistemaGPS gps;
    private Sirena sirena;
    private Operador operador;

    public unidadBomberos(string nombre, String nombreOperador) {
        super(nombre);
        this.gps = new SistemaGPS();
        this.sirena = new Sirena ();
        this.operador = nw Operador (nombreOperador);
    }

    public void iniciarOperacion () {
        activarUnidad();
        gps.localizar();
        sirena.activarSirena();
        operador.reportarse();
        responder();
    }

    @Override
    public voic responder() { System.out.println("Unidad de bomberos respondiendo a incendio estructural.");}

}