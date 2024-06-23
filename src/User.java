public class User {
    private String nome;
    private Integer eta;

    public User() {
        this.nome = nome;
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getEta(Integer i) {
        return eta;
    }

    public void setEta(Integer eta) {
        this.eta = eta;
    }
    // creo un metodo per stampare i dettagli dell'utente
    public void stampaDettagliUser(){
        System.out.println("Nome : " + nome);
        System.out.println("Età : " + eta);
    }
    //creo una nuova variabile temporanea privata
    private static User utente;
    //creo un metodo dove restituisco una nuova istanza
    public static User getUtente(){
        if (utente == null){
            utente = new User();// <-- il new User() restituirà una nuova instanza ogni volta che verrà richiamato getUtente()
        }
        return utente;
    }
}
