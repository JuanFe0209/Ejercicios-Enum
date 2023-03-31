package Ejercicio7;
import java.util.List;
import java.util.LinkedList;
public class Lista {
        public static void main(String[] args) {
            List<String> nombres = new LinkedList<>();
            nombres.add("Juan");
            nombres.add("María");
            nombres.add("Pedro");

            System.out.println("Lista: " + nombres);
            String nombre = nombres.get(1);
            System.out.println("Elemento accedido: " + nombre);
            int index = nombres.indexOf("Pedro");
            System.out.println("Posición de Pedro es " + index);
            String nombreEliminado = nombres.remove(0);
            System.out.println("Elemento eliminado: " + nombreEliminado);
            System.out.println("Lista actualizada: " + nombres);
        }
}

