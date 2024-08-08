package application;

public class Program {

    public static void main(String[] args) {

        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.parseInt(args[2]);
        double altura = Double.parseDouble(args[3]);

        System.out.printf("Olá, me chamo %s %s\n", nome, sobrenome);
        System.out.printf("Tenho %d anos\n", idade);
        System.out.printf("Minha altura é de %.2f m", altura);

    }
}
