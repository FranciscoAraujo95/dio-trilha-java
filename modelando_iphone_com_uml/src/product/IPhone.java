package product;

import funcionalities.browser.InternetBrowser;
import funcionalities.musicplayer.MusicPlayer;
import funcionalities.phone.Phone;

public class IPhone implements InternetBrowser, Phone, MusicPlayer {


    @Override
    public void showPage(String url) {
        System.out.println("Showing page to the user, url: " + url);
    }

    @Override
    public void refreshPage() {
        System.out.println("Refreshing page");
    }

    @Override
    public void addTab() {
        System.out.println("Adding a new tab");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Music paused");
    }

    @Override
    public void selectMusic(String music) {
        System.out.println("Selecting music");
    }

    @Override
    public void call(String number) {
        System.out.println("Calling to " + number);
    }

    @Override
    public void answer() {
        System.out.println("Answering the phone");
    }

    @Override
    public void initiateVoicemail() {
        System.out.println("Opening voicemail");
    }
}
