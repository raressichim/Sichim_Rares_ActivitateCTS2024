package strategy.classes;

public class Validator {
    private int nrAutobuz;
    private ModDePlata modDePlata;

    public Validator(int nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
        this.modDePlata = new PlataCardCalatorii();
    }

    public ModDePlata getModDePlata(){
        return modDePlata;
    }

    public void setModDePlata(ModDePlata modDePlata) {
        this.modDePlata = modDePlata;
    }

    public void efectueazaPlata(double pret){
        modDePlata.plateste(pret);
    }
}
