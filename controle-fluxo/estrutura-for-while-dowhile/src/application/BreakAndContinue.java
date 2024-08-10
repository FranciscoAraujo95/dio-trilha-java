package application;

public class BreakAndContinue {

    public static void main(String[] args) {

        System.out.println("Vamos contar até 10");

        for (int i = 1; i <= 10; i++) {

            //Se o numero for igual a 5, vai parar o programa
            if (i == 5) {
                break;
            }

            System.out.println("Número " + i);

        }

        for (int i = 1; i <= 10; i++) {

            //Se o numero for igual a 5, vai desconsiderar a iteração sobre o mesmo
            if (i == 5) {
                continue;
            }

            System.out.println("Número " + i);

        }

    }
}
