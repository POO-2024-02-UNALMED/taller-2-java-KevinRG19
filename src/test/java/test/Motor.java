package test;

public class Motor {
    int numeroCilindros;
    String tipo;
    int registro;

    void cambiarRegistro (int nuevoRegistro) {
        this.registro = nuevoRegistro;
    }
    void asignarTipo (String nuevoMotor) {
         String motores[] = new String[2];
         motores[0] = "electrico";
         motores[1] = "gasolina";
         for (String motor : motores) {
             if (nuevoMotor == motores[0] || nuevoMotor == motores[1]) {
                 this.tipo = nuevoMotor;
             }
         }
        }
    }

