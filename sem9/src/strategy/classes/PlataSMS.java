package strategy.classes;

public class PlataSMS implements ModDePlata {
    @Override
    public void plateste(double pret) {
        System.out.println("S-a efectuat plata pentru calatoria in valoare de " +
                pret + " prin sms");
    }
}
