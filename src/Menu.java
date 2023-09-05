import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class Menu {
    private final List<MenuItem<Iphone>> main = List.of(
            new MenuItem<>("1- Acessar o IPod (Reprodutor Musical)",
                    i -> show(musicPlayer, i, i.musicPlayer)),
            new MenuItem<>("2- Acessar o Safari (Navegador de Internet)",
                    i -> show(internetBrowser, i, i.internetBrowser)),
            new MenuItem<>("3- Acessar o Telefone",
                    i -> show(phone, i, i.phone)),
            new MenuItem<>("4- Desligar o Iphone (default)", Iphone::turnOff)
    );

    private static final List<MenuItem<MusicPlayer>> musicPlayer = List.of(
            new MenuItem<>("1- Tocar musica", MusicPlayer::play),
            new MenuItem<>("2- Pausar musica", MusicPlayer::pause),
            new MenuItem<>("3- Selecionar musica", MusicPlayer::select),
            new MenuItem<>("4- Sair do IPod (default)", (m) -> {})
    );

    private static final  List<MenuItem<InternetBrowser>> internetBrowser = List.of(
            new MenuItem<>("1- Mostrar pagina", InternetBrowser::show),
            new MenuItem<>("2- Abrir nova aba", InternetBrowser::newTab),
            new MenuItem<>("3- Recarregar pagina", InternetBrowser::refresh),
            new MenuItem<>("4- Sair do Safari (default)", (i) -> {})
    );

    private static final  List<MenuItem<Phone>> phone = List.of(
            new MenuItem<>("1- Ligar para um contato", Phone::call),
            new MenuItem<>("2- Atender chamada", Phone::answer),
            new MenuItem<>("3- Abrir caixa postal", Phone::voiceMail),
            new MenuItem<>("4- Sair do Telefone (default)", (p) -> {})
    );

    private final Scanner scanner;

    public Menu(Scanner scanner) {
         this.scanner = scanner;
    }

    public void execute(Iphone iphone) {
        show(main, iphone, iphone);
    }

    private <T> void show(List<MenuItem<T>> items, Iphone iphone, T executor) {
        int option = 0;
        while(iphone.isOn() && option < 3 && option >= 0) {
            items.forEach(System.out::println);
            System.out.print("Escolha um item: ");
            option = scanner.nextInt() - 1;
            var handler = (option >= 0 && option < items.size() ? items.get(option) : items.get(3)).handler();
            handler.accept(executor);
        }
    }

    private record MenuItem<T> (String item, Consumer<T> handler){
        @Override
        public String toString() {
            return item;
        }
    }

}
