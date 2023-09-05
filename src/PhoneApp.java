public class PhoneApp implements Phone {
    @Override
    public void call() {
        System.out.println("\nLigando para um contato no Telefone.\n");
    }

    @Override
    public void answer() {
        System.out.println("\nAtendendo chamada de voz no Telefone.\n");
    }

    @Override
    public void voiceMail() {
        System.out.println("\nEntrando a no correio de voz do Telefone.\n");
    }

}
