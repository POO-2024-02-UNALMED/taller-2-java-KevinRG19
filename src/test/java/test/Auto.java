package test;

public class Auto {
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static String cantidadCreados;

    int cantidadAsientos(Integer numeroAsientos) {
        int contador = 0;
        for (int i = 0; i < asientos.length; i++) {
            if (asientos[i] instanceof Asiento) {                  //instanceof chequea que sea de tipo Asiento
                contador++;
            }
        }
        return contador;
    }

    String verificarIntegridad() {
        if (this.motor.registro == this.registro) {
            for (Asiento asiento : this.asientos) {           //forma de recorrer la lista
                if (this.registro != asiento.registro) {
                    return "Las piezas no son originales";
                }
            }
            return "Auto original";
        }
        else {
            return "Las piezas no son originales";
        }
    }
}
