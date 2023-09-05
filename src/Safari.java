public class Safari implements InternetBrowser {
    @Override
    public void show() {
        System.out.println("\nApresentando pagina no Safari.\n");
    }

    @Override
    public void newTab() {
        System.out.println("\nAbrindo uma nova aba no Safari.\n");
    }

    @Override
    public void refresh() {
        System.out.println("\nRecarregando a pagina no Safari.\n");
    }
}
