package chainOfResponsability.classes;

public class PlataCard extends ModDePlata {
    private int sold;

    public PlataCard(int sold) {
        this.sold = sold;
    }

    @Override
    public void plateste(int suma) {
        if (suma > sold) {
            getSuccesor().plateste(suma);
        } else {
            sold -= suma;
            System.out.println("plata card");
        }
    }
}
