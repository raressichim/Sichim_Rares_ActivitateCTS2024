package state.classes;

public class Achizitionata implements State{
    @Override
    public void setState(Reteta reteta) {
        reteta.setState(this);
    }
}
