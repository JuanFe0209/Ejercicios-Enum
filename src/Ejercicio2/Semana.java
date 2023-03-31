package Ejercicio2;

public class Semana {
        public enum Dia {
            LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
        }
        public static void printDay(Dia dia) {
            System.out.println("Hoy es " + dia.toString());
        }
        public static void main(String[] args) {
            printDay(Dia.LUNES);
        }
    }
