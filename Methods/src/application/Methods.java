package application;

import java.util.Locale;

public class Methods {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        System.out.println(somar(5, 8));
        System.out.println("IMC: " + String.format("%.2f", calcularIMC(110, 1.7)));

    }

    public static double somar(double n1, double n2) {
        return n1 + n2;
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / Math.pow(altura, 2);
    }
}
