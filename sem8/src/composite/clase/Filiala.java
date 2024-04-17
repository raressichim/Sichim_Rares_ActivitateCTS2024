package composite.clase;

public class Filiala implements Sediu {
    private String nume;
    private int nrAngajati;

    public Filiala(String nume, int nrAngajati) {
        this.nume = nume;
        this.nrAngajati = nrAngajati;
    }

    @Override
    public void adaugaSediu(Sediu sediu) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergeSediu(Sediu sediu) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Sediu getSediu(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int calculeazaNrAngajati() {
        return nrAngajati;
    }

    @Override
    public void afiseaza(String indentare) {
        System.out.println("Filiala " + nume + " are " + nrAngajati + " angajati");
    }
}
