package observer_dp.observer;

public class Client implements Observer {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void primesteMesaj(String mesaj) {
        System.out.println(name + " : " + mesaj);
    }
}
