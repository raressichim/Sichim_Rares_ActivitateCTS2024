package composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Agentie implements Sediu {
    private List<Sediu> sedii;
    private String nume;
    private int nrOperatori;

    public Agentie(String nume, int nrOperatori) {
        this.nume = nume;
        this.nrOperatori = nrOperatori;
        sedii = new ArrayList<>();
    }

    @Override
    public void adaugaSediu(Sediu sediu) {
        sedii.add(sediu);
    }

    @Override
    public void stergeSediu(Sediu sediu) {
        sedii.remove(sediu);
    }

    @Override
    public Sediu getSediu(int index) {
        return sedii.get(index);
    }

    @Override
    public int calculeazaNrAngajati() {
        int suma = nrOperatori;
        for (Sediu sediu : sedii) {
            suma += sediu.calculeazaNrAngajati();
        }
        return suma;
    }

    @Override
    public void afiseaza(String indentare) {
        System.out.println(indentare + " Agentia cu numele " + nume + " are " + nrOperatori + " operatori si contine sediile: ");
        for (Sediu sediu : sedii) {
            sediu.afiseaza(indentare + " ");
        }
    }
}
