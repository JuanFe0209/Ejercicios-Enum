package Ejercicio1;

public class MainClima {
    enum Clima {
    INVIERNO(5), PRIMAVERA(10), VERANO(15), OTOÑO(20);

    private int valor;

    private Clima(int valor) {
        this.valor = valor;
    }
}
    public static void main(String args[]) {
        for (Clima c: Clima.values())
            System.out.println(c + " " + c.valor);

    }
}
