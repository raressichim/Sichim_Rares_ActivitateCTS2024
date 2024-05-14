package state.classes;

public class Solicitata implements State{
    @Override
    public void setState(Reteta reteta) {
        reteta.setState(this);
    }
}
