package chainOfResponsability.classes;

public class PlataCardCalatorii extends ModDePlata {
    private int nrCalatorii;

    public PlataCardCalatorii(int nrCalatorii) {
        this.nrCalatorii = nrCalatorii;
    }

    @Override
    public void plateste(double pret) {
        if (nrCalatorii > 0) {

            System.out.println("S-a efectuat plata pentru calatoria in valoare de "
                    + pret + " cu cardul de calatorii");
            nrCalatorii--;
        } else {
            getSuccesor().plateste(pret);
        }
    }
}
