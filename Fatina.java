// "Fatina" estende "EssereMagico" e rende concreto il comportamento
public class Fatina extends EssereMagico {
    private String coloreAli;

    public Fatina(String nome, String potere, String coloreAli) {
        super(nome, potere);
        this.coloreAli = coloreAli;
    }

    @Override
    public void usaPotere() {
        System.out.println("🧚‍♀️ La fatina " + nome + " agita le sue ali " + coloreAli +
                           " e spruzza una polvere magica che " + potere + "!");
    }
}
