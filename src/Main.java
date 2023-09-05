import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu(new Scanner(System.in));
        Phone phone = new PhoneApp();
        MusicPlayer musicPlayer = new IPod();
        InternetBrowser internetBrowser = new Safari();

        Iphone iphone = new Iphone(phone, musicPlayer, internetBrowser);
        menu.execute(iphone);
    }
}