// Classe intangibile (astratta): rappresenta un concetto, non un oggetto fisico
public abstract class EssereMagico {
    protected String nome;
    protected String potere;

    public EssereMagico(String nome, String potere) {
        this.nome = nome;
        this.potere = potere;
    }

    public void presenta() {
        System.out.println("✨ Io sono " + nome + ", un essere magico con il potere di " + potere + ".");
    }

    // Metodo astratto: ogni sottoclasse deve definire il proprio modo di usare il potere
    public abstract void usaPotere();
}
