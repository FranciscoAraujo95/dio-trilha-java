package application;

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraDeMedias {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};

        double media = calcularMediaDaTurma(alunos, scanner);

        System.out.printf("\nMédia da turma %.2f", media);

        scanner.close();

    }

    public static double calcularMediaDaTurma(String[] alunos, Scanner scanner) {

        Locale.setDefault(Locale.US);

        double soma = 0;
        for (String aluno : alunos) {
            System.out.printf("Nota do aluno %s: ", aluno);
            double nota = scanner.nextDouble();
            soma += nota;
        }

        return soma / alunos.length;
    }

}
