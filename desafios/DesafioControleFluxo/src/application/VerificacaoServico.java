package application;

import java.util.Scanner;

public class VerificacaoServico {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Entrada do serviço a ser verificado
        String servico = scanner.nextLine().trim();

        // Entrada do nome do cliente e os serviços contratados
        String entradaCliente = scanner.nextLine().trim();

        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;

        // TODO: Verifique se o serviço está na lista de serviços contratados

        for (int i = 0; i < partes.length; i++) {
            if (servico.equals(partes[i])) {
                contratado = true;
            }
        }

        if (contratado) {
            System.out.println("\nSim");
        } else {
            System.out.println("\nNão");
        }

        scanner.close();
    }
}
