package application;

public class TiposVariaveis {

    public static void main(String[] args) {

        //Alguns tipos primitivos

        String meuNome = "Francisco Araujo";

        double minimumWage = 2500;

        short shortNumber = 1;
        int ordinaryNumber = shortNumber;
        short shortNumber2 = (short) ordinaryNumber;

        int numero = 5;
        numero = 10;

        System.out.println("numero = " + numero);

        final double VALOR_DE_PI = 3.14;

    }
}
