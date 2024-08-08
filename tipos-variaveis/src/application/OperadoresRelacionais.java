package application;

public class OperadoresRelacionais {

    public static void main(String[] args) {

        String nomeUm = "Francisco";
        String nomeDois = new String("Francisco");

        System.out.println(nomeUm.equals(nomeDois));

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if (numero1 < numero2) { //true
            System.out.println("A nossa condição é verdadeira");
        } else { //false
            System.out.println("A nossa condição é falsa");
        }

        System.out.println(numero1 + " é igual a " + numero2 + "? " + simNao);

        simNao = numero1 != numero2;

        System.out.println(numero1 + " é diferente de " + numero2 + "? " + simNao);

        simNao = numero1 > numero2;

        System.out.println(numero1 + " é maior que " + numero2 + "? " + simNao);

        simNao = numero1 < numero2;

        System.out.println(numero1 + " é menor que " + numero2 + "? " + simNao);

    }
}
