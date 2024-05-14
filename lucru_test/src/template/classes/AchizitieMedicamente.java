package template.classes;

public abstract class AchizitieMedicamente {
    public abstract boolean pas1();

    public abstract void pas2();

    public abstract void pas3();

    public abstract void pas4();

    public void cumpara() {
        if (pas1()) {
            pas2();
            pas3();
        } else {
            pas4();
        }
    }
}
