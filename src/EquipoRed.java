import javax.swing.*;

public class EquipoRed {

    public String nombre;
    public String direccionIP;

    String tipo;
    boolean conectado;

    public void conectar(){

        if (conectado = true) {

            System.out.println("Equipo esta conectado");

        }
    }

    public void mostrarInformacion(){

        System.out.println("Nombre de la Red: " + nombre);
        System.out.println("Direccion IP: " + direccionIP);
        System.out.println("Tipo de Red: " + tipo);
        System.out.println("Conectado: " + conectado);

    }

    void desconectar() {
        conectado = false;
        System.out.println("Equipo desconectado.");
    }

    void mostrarEstado(){
        System.out.println("Estado: " + conectado);
    }





}
