public class Main {
    public static void main(String[] args) {
        User utente = User.getUtente();
        utente.setNome("Riccardo");
        utente.setEta(30);
        utente.stampaDettagliUser();

        User utente1 = User.getUtente();
        utente1.setNome("Giovanni");
        utente1.setEta(56);

        utente1.stampaDettagliUser();

    }
}