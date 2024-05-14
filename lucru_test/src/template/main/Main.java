package template.main;

import template.classes.AchizitieMedicamente;
import template.classes.AchiztieMedicamentePeBazaRetetei;
import template.classes.Reteta;

public class Main {
    public static void main(String[] args) {
        Reteta reteta = new Reteta(3);
        AchizitieMedicamente achizitieMedicamente = new AchiztieMedicamentePeBazaRetetei(reteta);
        achizitieMedicamente.cumpara();
    }
}
