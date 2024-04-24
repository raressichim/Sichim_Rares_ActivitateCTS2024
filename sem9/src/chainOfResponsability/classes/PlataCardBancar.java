package chainOfResponsability.classes;

public class PlataCardBancar extends ModDePlata {
    private double sold;

    public PlataCardBancar(double sold) {
        this.sold = sold;
    }

    @Override
    public void plateste(double pret) {
        if (sold >= pret) {
            System.out.println("S-a efectuat plata calatoriei in valoare de " + pret + " cu cardul bancar");
            sold -= pret;
        } else {
            super.getSuccesor().plateste(pret);
        }
    }
}
