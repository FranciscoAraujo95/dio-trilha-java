package application;

public class Program {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Francisco", "603.855.383-59");

        pessoa.setEndereco("Rua das Marias");

        System.out.println(pessoa.getNome() + "-" + pessoa.getCpf());

    }
}
