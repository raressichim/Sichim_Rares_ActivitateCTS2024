package composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Sucursala implements Sediu {
    private List<Sediu> sedii;
    private String nume;
    private int nrProgramatori;

    public Sucursala(String nume, int nrProgramatori) {
        this.nume = nume;
        this.nrProgramatori = nrProgramatori;
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
        int suma = nrProgramatori;
        for (Sediu sediu : sedii) {
            suma += sediu.calculeazaNrAngajati();
        }
        return suma;
    }

    @Override
    public void afiseaza(String indentare) {
        System.out.println(indentare + " Sucursala cu numele " + nume + " are " + nrProgramatori + " programatori si contine sediile: ");
        for (Sediu sediu : sedii) {
            sediu.afiseaza(indentare + " ");
        }
    }
}
