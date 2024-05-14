package adapter.classes;

public class BiletStb extends CardStb{
    private int nrCalatorii;
    public BiletStb(String nume, int cnp,int nrCalatorii) {
        super(nume, cnp);
        this.nrCalatorii = nrCalatorii;
    }

    @Override
    public void valideazaAcces() {
        if(nrCalatorii>0){
            nrCalatorii--;
            System.out.println("acces permis");
        } else{
            System.out.println("accesul nu e permis");
        }
    }
}
