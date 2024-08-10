package application;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) {

        System.out.println("Processo Seletivo");
        selecionarCandidatos();

    }

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
