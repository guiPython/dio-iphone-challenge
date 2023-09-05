
public class Iphone {
    public final Phone phone;
    public final MusicPlayer musicPlayer;
    public final InternetBrowser internetBrowser;
    private boolean on;

    public Iphone(Phone phone, MusicPlayer musicPlayer, InternetBrowser internetBrowser) {
        this.phone = phone;
        this.musicPlayer = musicPlayer;
        this.internetBrowser = internetBrowser;
        this.on = true;
        System.out.println("\nIphone ligado");
    }

    public boolean isOn() {
        return this.on;
    }

    public void turnOff() {
        this.on = false;
        System.out.println("\nIphone desligado.");
    }
}
