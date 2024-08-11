package escola;

public class Escola {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.setNome("Francisco");
        aluno.setIdade(28);

        System.out.printf("O aluno %s tem %d anos", aluno.getNome(), aluno.getIdade());


    }
}
