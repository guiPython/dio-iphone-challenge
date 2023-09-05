import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Menu menu = new Menu(scanner);
        Phone phone = new PhoneApp();
        MusicPlayer musicPlayer = new IPod();
        InternetBrowser internetBrowser = new Safari();

        Iphone iphone = new Iphone(phone, musicPlayer, internetBrowser);
        menu.execute(iphone);

        scanner.close();
    }
}