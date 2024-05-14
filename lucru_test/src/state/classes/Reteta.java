package state.classes;

public class Reteta {
    private int nrMedicamente;
    private State state;

    public Reteta(int nrMedicamente) {
        this.nrMedicamente = nrMedicamente;
        state = new Emisa();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void solicitaReteta() {
        if (state instanceof Emisa) {
            setState(new Solicitata());
            System.out.println("solicitata");
        } else {
            System.out.println("eroare solicitare");
        }
    }

    public void cumparaReteta() {
        if (state instanceof Solicitata) {
            setState(new Achizitionata());
            System.out.println("cumparata");
        } else {
            System.out.println("eroare cumparare");
        }
    }
}
