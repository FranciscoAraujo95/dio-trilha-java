package application;

public class ResultadoEscolar {

    public static void main(String[] args) {

        //if sel encadeado
        double nota = 6;

        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        //operador ternário
        String resultado = (nota >= 7) ? "Aprovado" : "Reprovado";
        System.out.println("aprovacao = " + resultado);

        //operador ternário encadeado
        resultado = (nota >= 7) ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println("resultado = " + resultado);

    }
}
