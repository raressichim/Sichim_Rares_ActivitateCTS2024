package proxy.classes;

public class Autobuz implements AutobuzAbstract{
    private int nrAutobuz;
    private int nrLocuri;

    public Autobuz(int nrAutobuz, int nrLocuri) {
        this.nrAutobuz = nrAutobuz;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public void pleacaDinStatie() {
        System.out.println(nrAutobuz+" a plecat");
    }

    public int getNrAutobuz() {
        return nrAutobuz;
    }

    public int getNrLocuri() {
        return nrLocuri;
    }
}
