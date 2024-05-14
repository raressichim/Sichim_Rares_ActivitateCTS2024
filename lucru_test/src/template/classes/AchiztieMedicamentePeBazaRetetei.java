package template.classes;

public class AchiztieMedicamentePeBazaRetetei extends AchizitieMedicamente {
    private Reteta reteta;

    public AchiztieMedicamentePeBazaRetetei(Reteta reteta) {
        this.reteta = reteta;
    }

    @Override
    public boolean pas1() {
        return reteta.getNrMedicamente() < 5;
    }

    @Override
    public void pas2() {
        System.out.println("pas2");
    }

    @Override
    public void pas3() {
        System.out.println("pas3");
    }

    @Override
    public void pas4() {
        System.out.println("pas4");
    }
}
