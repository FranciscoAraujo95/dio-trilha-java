package application;

public class OperadorTernario {

    public static void main(String[] args) {

        int a, b;

        a = 5;
        b = 5;

        String resultado = "";

        //Condicional usando If/else
//        if (a == b) {
//            resultado = "Verdadeiro";
//        } else {
//            resultado = "Falso";
//        }
//
//        System.out.println(resultado);

        //Condicional usando operador ternário
        resultado = (a == b) ? "Verdadeiro" : "Falso";

        System.out.println(resultado);

    }
}
