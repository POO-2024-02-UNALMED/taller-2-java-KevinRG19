package test;

public class Asiento {
    String color;
    int precio;
    int registro;

    void cambiarColor(String colorNuevo) {
        if (colorNuevo == "rojo" || colorNuevo == "verde" || colorNuevo == "amarillo" || colorNuevo == "negro" || colorNuevo == "blanco") {
            this.color = colorNuevo;
        }
    }
}



