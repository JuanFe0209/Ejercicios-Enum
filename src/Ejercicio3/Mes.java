package Ejercicio3;

public class Mes {
        enum Meses {
            JANUARY("Enero", 31),
            FEBRUARY("Febrero", 28),
            MARCH("Marzo", 31),
            APRIL("Abril", 30),
            MAY("Mayo", 31),
            JUNE("Junio", 30),
            JULY("Julio", 31),
            AUGUST("Agosto", 31),
            SEPTEMBER("Septiembre", 30),
            OCTOBER("Octubre", 31),
            NOVEMBER("Noviembre", 30),
            DECEMBER("Diciembre", 31);

            private String nombreEspañol;
            private int dias;

            Meses(String nombreEspañol, int dias) {
                this.nombreEspañol = nombreEspañol;
                this.dias = dias;
            }

            public String getNombreEspañol() {
                return nombreEspañol;
            }

            public int getDias() {
                return dias;
            }

            public static void main(String[] args) {
                for (Meses mes : Meses.values()) {
                    System.out.println(mes.toString() + " en español es " + mes.getNombreEspañol() +
                            " y tiene " + mes.getDias() + " días.");
                }
            }
        }
}
