package flyweight.clase;

public class Cont {
    private int nrCont;
    private float suma;

    public Cont(int nrCont, float suma) {
        this.nrCont = nrCont;
        this.suma = suma;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cont{");
        sb.append("nrCont=").append(nrCont);
        sb.append(", suma=").append(suma);
        sb.append('}');
        return sb.toString();
    }
}
