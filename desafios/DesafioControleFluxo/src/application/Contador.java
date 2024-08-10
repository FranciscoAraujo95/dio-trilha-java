package application;

import java.util.Locale;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        //Scanner para ler o input do usuário
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        char escolha = 's';

        do {

            //Input do usuário
            System.out.print("N1: ");
            int n1 = scanner.nextInt();

            System.out.print("N2: ");
            int n2 = scanner.nextInt();

            try {

                //Chamando o método que contém a lógica do programa passando as variáveis com os inputs do usuário
                contar(n1, n2);

            } catch (ParametrosInvalidosException e) {

                //Imprime a mensagem "O segundo parâmetro deve ser maior que o primeiro"
                System.out.println(e.msg);

            }

            System.out.print("\nDeseja reiniciar o programa? (s/n) ");
            escolha = scanner.next().charAt(0);
            System.out.println();

        } while (escolha == 'S' || escolha == 's');

        System.out.println("Programa encerrado. Até mais! ☕");

        scanner.close();

    }

    /**
     * <h4>Contagem</h4>
     * <p>Método contendo a lógica de verificação, realização e impressão da contagem no console</p>
     *
     * @param n1 primeiro número informado pelo usuário
     * @param n2 segundo número informado pelo usuário
     * @throws ParametrosInvalidosException Exceção customizada que será lançada caso a condição apresentada seja falsa
     */
    public static void contar(int n1, int n2) throws ParametrosInvalidosException {

        //Verificação se o segundo parâmetro é maior que o primeiro, caso seja, vai lançar a exceção, que foi previamente tratada no método main
        if (n1 > n2) {
            throw new ParametrosInvalidosException("\nO segundo parâmetro deve ser maior que o primeiro");
        }

        //Verificação se os parâmetros possuem o mesmo valor, caso sim, lança uma exceção que será tratada no método main
        if (n1 == n2) {
            throw new ParametrosInvalidosException("\nParâmetros com valor igual, impossível realizar a contagem.");
        }

        //A variável contador vai receber o valor da subtração do segundo número pelo primeiro
        int contador = n2 - n1;

        System.out.printf("\nA diferença entre %d e %d é %d.", n1, n2, contador);
        System.out.println();

        //Laço de repetição imprimindo os números no console, baseando-se na variavel contador
        for (int i = 1; i <= contador; i++) {
            System.out.println("Número " + i);
        }

    }


}
