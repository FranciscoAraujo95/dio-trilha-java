package application;

public class ForEmArray {

    public static void main(String[] args) {

        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        //for padrão
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Aluno no índice i = " + i + " é " + alunos[i]);
        }

        System.out.println();

        //for each
        for (String aluno : alunos) {
            System.out.println("Nome do aluno é: " + aluno);
        }

    }
}
