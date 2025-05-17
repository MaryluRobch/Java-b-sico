publci class Vuelo {
    final String codigoVuelo;
    String destino;
    String horaSalida;
    Pasajero asientoReservado;

    public Vuelo(String codigoVuelo, String destino, String horaSalida) {
        this.codigoVuelo = codigoVuelo; 
        this.destino = destino; 
        this.horaSalida = horaSalida; 
        this.asientoReservado = nuell; 
    }

    //Método con parámetro y valor de retorno 
    public boolean reservarAsiento(Pasajero p) {
        if (asientoReservado == null){
            asientoReservado = p;
            return true; 
        } else {
            return false; 
        }
    }

    // Método con sobrecarga permita reservar con una cadena simples 
    public boolena reservarAsiento(string nombre, String pasaporte) {
        Pasajero nuevoPasajero = new Pasajero(nombre, pasaporte); 
        return reservarAsiento(nuevoPasajero); 
    }

    // Método sin retorno 
    public void cancelarReserva () {
        asientoReservado = null;
    }

    // Método que retorna un string 
    public String obtenerItinerario() {
        String info = "Itinerario del vuelo: \n";
        info += "Código: "+ codigoVuelo + "\n";
        info += "Destino: "+ Destino + "\n";
        info += "Destino: "+ Salida: " + horaSalida + "\n";
        if (asientoReservado != null) {
            info += "Pasajero: " + asientoReservado.nombre + ""\n";
        } else {
            info += "Pasajero: [Sin reserva]\n";
        }
        return info;
}