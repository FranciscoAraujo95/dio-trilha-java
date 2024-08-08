package application;

public class Usuario {

    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println("A Smart TV está ligada? -> " + smartTv.ligada);
        smartTv.ligar();
        System.out.println("A Smart TV está ligada? -> " + smartTv.ligada);

        System.out.println("\nVolume e canal atuais: ");
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.mudarCanal(17);

        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.mudarVolume(30);

        System.out.println("\nVolume e canal atuais: ");
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        System.out.println();

        System.out.println("A Smart TV está ligada? -> " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("A Smart TV está ligada? -> " + smartTv.ligada);


    }
}
