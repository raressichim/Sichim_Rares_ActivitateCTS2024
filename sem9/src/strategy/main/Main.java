package strategy.main;

import strategy.classes.PlataCardBancar;
import strategy.classes.PlataSMS;
import strategy.classes.Validator;

public class Main {
    public static void main(String[] args) {
        Validator validator = new Validator(23);
        validator.efectueazaPlata(20);
        validator.setModDePlata(new PlataCardBancar());
        validator.efectueazaPlata(30);
        validator.setModDePlata(new PlataSMS());
        validator.efectueazaPlata(50);
    }
}
