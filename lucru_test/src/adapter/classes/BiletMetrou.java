package adapter.classes;

public class BiletMetrou extends CardMetrorex {
    private int nrCalatorii;

    public BiletMetrou(String nume, int nrCalatorii) {
        super(nume);
        this.nrCalatorii = nrCalatorii;
    }

    @Override
    public boolean accesMetrou() {
        if (nrCalatorii > 0) {
            System.out.println("ai acces");
            nrCalatorii--;
            return true;
        }
        return false;
    }


}
