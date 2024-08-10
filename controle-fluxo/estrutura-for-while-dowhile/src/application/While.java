package application;

import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;

public class While {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double mesada = 50.0;

        while (mesada > 0) {
            Double valorDoce = valorAleatorio();

            if (valorDoce > mesada) {
                valorDoce = mesada;
            }

            System.out.println("Valor do doce: " + String.format("%.2f", valorDoce) + " adicionado no carrinho");

            mesada -= valorDoce;

        }

        System.out.println("\nMesada: " + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");

    }

    public static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 15);
    }
}
