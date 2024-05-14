package chainOfResponsability.classes;

public abstract class ModDePlata {
    private ModDePlata succesor;

    public ModDePlata getSuccesor() {
        return succesor;
    }

    public void setSuccesor(ModDePlata succesor) {
        this.succesor = succesor;
    }

    public abstract void plateste(int suma);
}
