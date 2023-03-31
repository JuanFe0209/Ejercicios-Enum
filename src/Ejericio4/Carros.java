package Ejericio4;
public class Carros {
    enum TipoVehiculo {
        CARRO, CAMION, MOTO
    }

    static class Vehiculo {
        private String hacer;
        private String modelo;
        private TipoVehiculo tipo;

        public Vehiculo(String hacer, String modelo, TipoVehiculo tipoVehiculo) {
            this.hacer = hacer;
            this.modelo = modelo;
            this.tipo = tipo;
        }

        public String getHacer() {
            return hacer;
        }

        public String getModelo() {
            return modelo;
        }

        public TipoVehiculo getTipo() {
            return tipo;
        }

        public static void main(String[] args) {

            Vehiculo carro = new Vehiculo("Toyota", "Corolla", TipoVehiculo.CARRO);
            Vehiculo camion = new Vehiculo("Ford", "F-150", TipoVehiculo.CAMION);
            Vehiculo moto = new Vehiculo("Harley-Davidson", "Sportster", TipoVehiculo.MOTO);
            System.out.println("El " + carro.getHacer() + " " + carro.getModelo() + " es un " + carro.getTipo().toString());
            System.out.println("El " + camion.getHacer() + " " + camion.getModelo() + " es un " + camion.getTipo().toString());
            System.out.println("La " + moto.getHacer() + " " + moto.getModelo() + " es una " + moto.getTipo().toString());
        }
    }
}
