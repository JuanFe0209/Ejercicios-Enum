package Ejercicio5;

public class Camiseta {
        enum ShirtSize {
            SMALL("El tamaño es pequeño."),
            MEDIUM("El tamaño es mediano."),
            LARGE("El tamaño es grande."),
            XLARGE("El tamaño es extra grande.");

            private final String size;
            private ShirtSize(String size) {
                this.size = size;
            }
            public String getSize() {
                return size;
            }
        }
        public static void main(String[] args) {
            ShirtSize size = ShirtSize.SMALL;
            System.out.println(size.getSize());
        }
}
