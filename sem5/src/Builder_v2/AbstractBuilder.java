package Builder_v2;

import Builder_v2.Rezervare;

public interface AbstractBuilder {
   Rezervare build();

    AbstractBuilder adaugaScaunErgonomic();

    AbstractBuilder adaugaMancare();

    AbstractBuilder adaugaBautura();

    AbstractBuilder adaugaMuzica();
    AbstractBuilder adaugaGenMuzical(String genMuzical);
}
