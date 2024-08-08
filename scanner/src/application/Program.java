package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = sc.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();

        System.out.println();
        System.out.printf("Olá, me chamo %s %s\n", nome, sobrenome);
        System.out.printf("Tenho %d anos\n", idade);
        System.out.printf("Minha altura é de %.2f m", altura);

        sc.close();

    }
}
