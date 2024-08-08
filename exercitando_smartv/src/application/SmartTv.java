package application;

public class SmartTv {

    boolean ligada = false;
    int canal = 9;
    int volume = 25;

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Trocando para o canal: " + canal);
    }

    public void aumentarCanal() {
        canal++;
        System.out.println("\nAumentando um canal: ");
        System.out.println("Canal atual: " + canal);
    }

    public void diminuirCanal() {
        canal--;
        System.out.println("\nDiminuindo um canal: ");
        System.out.println("Canal atual: " + canal);
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("\nAumentando o volume para: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("\nDiminuindo o volume para: " + volume);
    }

    public void mudarVolume(int novoVolume) {
        volume = novoVolume;
        System.out.println("Definindo o volume para: " + volume);
    }

    public void ligar() {
        ligada = true;
        System.out.println("Ligando Smart TV");
    }

    public void desligar() {
        ligada = false;
        System.out.println("Desligando Smart TV");
    }


}
