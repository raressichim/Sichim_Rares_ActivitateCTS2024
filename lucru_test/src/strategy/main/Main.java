package strategy.main;


import strategy.classes.PlataCard;
import strategy.classes.PlataSms;
import strategy.classes.Validator;

public class Main {
    public static void main(String[] args) {
        Validator validator = new Validator();
        validator.valideaza(new PlataCard());
        validator.valideaza(new PlataSms());
    }
}
