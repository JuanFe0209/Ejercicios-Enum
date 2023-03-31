package Ejercicio8;
import java.util.ArrayList;
import java.util.List;
public class Numeros {
        public static void main(String[] args) {
            List<Integer> numeros = new ArrayList<>();
            numeros.add(10);
            numeros.add(20);
            numeros.add(30);


            int primerNumero = numeros.get(0);
            System.out.println("El primer número de la lista es: " + primerNumero);
            numeros.set(0, 15);
            System.out.println("La lista después de modificar el primer elemento: " + numeros);
            int cantidadElementos = numeros.size();
            System.out.println("La cantidad de elementos en la lista es: " + cantidadElementos);
            boolean contieneNumero = numeros.contains(20);
            System.out.println("La lista contiene el número 20: " + contieneNumero);
            numeros.remove(1);
            System.out.println("La lista después de eliminar el segundo elemento: " + numeros);
            numeros.clear();
            System.out.println("La lista después de vaciarla: " + numeros);
        }
}


