package application;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) {

        System.out.println("Processo Seletivo\n");
        String[] candidatos = {"Felipe", "Márcia", "Julia", "Paulo", "Augusto"};

        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }

    }

    /**
     * <h5>Método para entrar em contato com o candidato</h5>
     * <p>Esse método utiliza de variaveis booleanas para indicar se algo é verdadeiro o falso, e dessa forma, guiar o fluxo do programa para continuar ou não tentando ligar para a pessoa</p>
     *
     * @param candidato
     */
    public static void entrandoEmContato(String candidato) {

        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {

            atendeu = atender();
            continuarTentando = !atendeu;

            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }

        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa.");
        } else {
            System.out.println("Não conseguimos contato com " + candidato + ", número máximo de " + tentativasRealizadas + " tentativas realizadas.");
        }

    }

    /**
     * <h5>Método auxiliar</h5>
     * <p>Esse método gera um número randômico entre 1 e 3, e se for 1, a expressão passa a ser true, significando que o candidato atendeu a ligação</p>
     */
    public static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    /**
     * <h5>Método para imprimir os candidatos selecionados</h5>
     */
    public static void imprimirSelecionados() {
        String[] candidatos = {"Felipe", "Márcia", "Julia", "Paulo", "Augusto"};

        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");
        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("O candidato de número " + (i + 1) + " é " + candidatos[i]);
        }

        System.out.println();

        System.out.println("Forma abreviada de interação For Each");
        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi: " + candidato);
        }


    }

    /**
     * <h5>Método para selecionar os candidatos</h5>
     * <p>Seleciona os candidatos baseado no valor de salário pretendido</p>
     */
    public static void selecionarCandidatos() {

        String[] candidatos = {"Felipe", "Márcia", "Julia", "Paulo", "Augusto", "Monia", "Fabricio", "Mirela", "Daniela", "Joana"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {

            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário: R$ " + String.format("%.2f", salarioPretendido));

            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                candidatosSelecionados++;
            }

            candidatoAtual++;

        }

        System.out.println("\nCandidatos selecionados: " + candidatosSelecionados);

    }

    /**
     * <h5>Método para gerar um valor aleatório de salario pretendido</h5>
     *
     * @return O valor aleatório entre 1880 e 2200
     */
    public static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1880, 2200);
    }

    public static void analisarCandidato(double salarioPretendido) {

        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }

    }
}
