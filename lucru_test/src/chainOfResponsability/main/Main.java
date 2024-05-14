package chainOfResponsability.main;


import chainOfResponsability.classes.Validator;

public class Main {
    public static void main(String[] args) {
        Validator validator = new Validator();
        validator.valideaza(10);
        validator.valideaza(10);
        validator.valideaza(10);
        validator.valideaza(9);
        validator.valideaza(10);

    }
}
