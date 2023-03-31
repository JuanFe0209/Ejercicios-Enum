package Ejercicio9;
import java.util.ArrayList;
import java.util.List;

public class Lista {
        public static void main(String[] args) {
            List<String> miLista = new ArrayList<>();
            miLista.add("Manzana");
            miLista.add("Banana");
            miLista.add("Naranja");

            int tamano = miLista.size();
            System.out.println("El tamaño de la lista es: " + tamano);
            String fruta = miLista.get(1);
            System.out.println("La segunda fruta en la lista es: " + fruta);
            System.out.println("Elementos de la lista:");
            for (String elemento : miLista) {
                System.out.println(elemento);
            }
            miLista.remove(0);
            System.out.println("La lista después de remover el primer elemento: " + miLista);
            boolean contieneBanana = miLista.contains("Banana");
            System.out.println("La lista contiene la fruta 'Banana': " + contieneBanana);
            miLista.clear();
            System.out.println("La lista después de limpiarla: " + miLista);
        }
}


