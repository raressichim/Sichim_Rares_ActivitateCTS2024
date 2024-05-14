package adapter.classes;

public abstract class CardMetrorex {
    private String nume;

    public CardMetrorex(String nume) {
        this.nume = nume;
    }

    public abstract boolean accesMetrou();

    public String getNume() {
        return nume;
    }
}
