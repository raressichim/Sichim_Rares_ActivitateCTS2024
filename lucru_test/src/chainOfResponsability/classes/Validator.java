package chainOfResponsability.classes;

public class Validator {
    private ModDePlata modDePlata;

    public Validator() {
        this.modDePlata = new PlataAbonament(10);
        ModDePlata plataSms = new PlataSms(10);
        modDePlata.setSuccesor(plataSms);
        ModDePlata plataCard = new PlataCard(10);
        plataSms.setSuccesor(plataCard);
        Controlor controlor = new Controlor();
        plataCard.setSuccesor(controlor);
    }

    public void valideaza(int plata) {
        modDePlata.plateste(plata);
    }
}
