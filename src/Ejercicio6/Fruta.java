package Ejercicio6;
import java.util.ArrayList;
import java.util.List;
public class Fruta {
        public static void main(String[] args) {
            List<String> lista = new ArrayList<>();
            lista.add("Manzana");
            lista.add("Banana");
            lista.add("Naranja");

            System.out.println("Lista completa: " + lista);
            System.out.println("Elemento en la posición 1: " + lista.get(1));
            lista.remove(0);
            System.out.println("Lista actualizada: " + lista);
            if (lista.contains("Banana")) {
                System.out.println("La lista contiene Banana");
            } else {
                System.out.println("La lista no contiene Banana");
            }
            lista.clear();
            if (lista.isEmpty()) {
                System.out.println("La lista está vacía");
            } else {
                System.out.println("La lista no está vacía");
            }
        }
}
