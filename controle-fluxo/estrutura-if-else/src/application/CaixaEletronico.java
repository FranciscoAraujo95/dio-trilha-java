package application;

public class CaixaEletronico {

    public static void main(String[] args) {

        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if (valorSolicitado < saldo) {
            saldo -= valorSolicitado;
            System.out.println("saldo = " + saldo);
        } else {
            System.out.println("Valor solicitado é maior do que o disponível");
        }

    }
}
