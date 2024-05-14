package strategy.classes;

public class Validator {
    private ModDePlata modDePlata;

    public Validator() {
        this.modDePlata = new PlataCard();
    }

    public void valideaza(ModDePlata modDePlata) {
        this.modDePlata = modDePlata;
        modDePlata.plateste();
    }
}
