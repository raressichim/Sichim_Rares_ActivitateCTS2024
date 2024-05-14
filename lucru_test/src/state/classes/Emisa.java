package state.classes;

public class Emisa implements State {
    @Override
    public void setState(Reteta reteta) {
        reteta.setState(this);
    }
}
