package chainOfResponsability.classes;

public class Validator {
    private int nrAutobuz;
    private ModDePlata modDePlata;

    public Validator(int nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
        this.modDePlata = new PlataCardCalatorii(1);
        ModDePlata cardBancar = new PlataCardBancar(4);
        modDePlata.setSuccesor(cardBancar);
        ModDePlata sms = new PlataSMS(10);
        cardBancar.setSuccesor(sms);
        ModDePlata controlor = new Controlor();
        sms.setSuccesor(controlor);
    }


    public ModDePlata getModDePlata() {
        return modDePlata;
    }

    public void setModDePlata(ModDePlata modDePlata) {
        this.modDePlata = modDePlata;
    }

    public void efectueazaPlata(double pret) {
        modDePlata.plateste(pret);
    }
}
