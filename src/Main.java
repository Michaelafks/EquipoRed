void main(String[] args) {

    EquipoRed equipored1 = new EquipoRed();
    EquipoRed equipored2 = new EquipoRed();
    EquipoRed equipored3 = new EquipoRed();

    equipored1.nombre = "Router";
    equipored1.direccionIP = "192.168.1.1";
    equipored1.tipo = "Internet";
    equipored1.conectado = false;

    equipored2.nombre = "Switch";
    equipored2.direccionIP = "192.168.1.2";
    equipored2.tipo = "Red";
    equipored2.conectado = false;

    equipored1.nombre = "Access Point";
    equipored1.direccionIP = "192.168.1.3";
    equipored1.tipo = "WiFi";
    equipored1.conectado = false;

    equipored1.conectar();
    equipored1.mostrarInformacion();

    System.out.println();

    equipored2.conectar();
    equipored2.mostrarInformacion();

    System.out.println();

    equipored3.conectar();
    equipored3.mostrarInformacion();

    
}