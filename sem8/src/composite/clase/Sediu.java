package composite.clase;

public interface Sediu {
    void adaugaSediu(Sediu sediu);

    void stergeSediu(Sediu sediu);

    Sediu getSediu(int index);
    int calculeazaNrAngajati();
    void afiseaza(String indentare);
}
