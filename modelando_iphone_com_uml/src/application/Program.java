package application;

import funcionalities.browser.InternetBrowser;
import funcionalities.musicplayer.MusicPlayer;
import funcionalities.phone.Phone;
import product.IPhone;

public class Program {

    public static void main(String[] args) {

        IPhone iPhone = new IPhone();

        InternetBrowser ib = iPhone;
        ib.showPage("https://github.com/FranciscoAraujo95");
        ib.refreshPage();
        ib.addTab();

        System.out.println();

        Phone ph = iPhone;
        ph.call("+55 85 99123-0021");
        ph.answer();
        ph.initiateVoicemail();

        System.out.println();

        MusicPlayer mp = iPhone;
        mp.selectMusic("Be Yourself - Audioslave");
        mp.playMusic();
        mp.pauseMusic();


    }
}
