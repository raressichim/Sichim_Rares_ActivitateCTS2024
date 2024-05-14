package adapter.classes;

public abstract class CardStb {
    private String nume;
    private int cnp;

    public CardStb(String nume, int cnp) {
        this.nume = nume;
        this.cnp = cnp;
    }

    public abstract void valideazaAcces();
}
