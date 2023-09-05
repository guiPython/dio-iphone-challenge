import java.util.List;
import java.util.Random;

public class IPod implements MusicPlayer {
    private static final List<String> musics = List.of("Rufus Du Sol Innerbloom", "Rufus Du Sol You Make Me");
    private static final Random random = new Random();
    private String selected = musics.get(0);

    @Override
    public void play() {
        System.out.println("\nTocando " + selected + " no Ipod.\n");
    }

    @Override
    public void pause() {
        System.out.println("\nPausando " + selected + " no Ipod.\n");
    }

    @Override
    public void select() {
        String selected = randomMusic();
        System.out.println("\nSelecionada " + selected + " no Ipod.\n");
        this.selected = selected;
    }

    private String randomMusic() {
        int randomIndex = random.ints(0, musics.size()).findFirst().orElse(0);
        return musics.get(randomIndex);
    }
}
