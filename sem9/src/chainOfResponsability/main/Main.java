package chainOfResponsability.main;


import chainOfResponsability.classes.Validator;

public class Main {
    public static void main(String[] args) {
        Validator validator = new Validator(123);
        validator.efectueazaPlata(3);
        validator.efectueazaPlata(3);
        validator.efectueazaPlata(3);
        validator.efectueazaPlata(3);
        validator.efectueazaPlata(3);
        validator.efectueazaPlata(3);
        validator.efectueazaPlata(3);
        validator.efectueazaPlata(3);
    }
}
