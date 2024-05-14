package observer_dp.subject;

public class Tramvai extends Subject{
    private int nr;

    public Tramvai(int nr) {
        this.nr = nr;
    }

    @Override
    public void anunta() {
        super.notificaObservers("pleaca tramvaiul"+ nr);
    }
}
