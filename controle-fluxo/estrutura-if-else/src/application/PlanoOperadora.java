package application;

import java.util.Scanner;

public class PlanoOperadora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o seu plano (B/M/T): ");
        String plano = sc.next();

//        if (plano.equals("B") || plano.equals("b")) {
//            System.out.println("BASIC - 100 minutos de ligação");
//        } else if (plano.equals("M") || plano.equals("m")) {
//            System.out.println("MIDIA - 100 minutos de ligação");
//            System.out.println("Whats e Instagram ilimitados");
//        } else if (plano.equals("T") || plano.equals("t")) {
//            System.out.println("MIDIA - 100 minutos de ligação");
//            System.out.println("Whats e Instagram ilimitados");
//            System.out.println("5GB para YouTube");
//        }

        switch (plano) {
            case "T": {
                System.out.println("5GB Youtube");
            }
            case "M": {
                System.out.println("Whats e Instagram grátis");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            }
            default: {
                System.out.println("Indefinido");
            }
        }

        sc.close();


    }
}
