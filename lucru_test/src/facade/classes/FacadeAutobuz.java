package facade.classes;

public class FacadeAutobuz {
    private Autobuz autobuz;

    public FacadeAutobuz(Autobuz autobuz) {
        this.autobuz = autobuz;
    }

    public void punePeLiberToateUsile(){
        autobuz.punePeLiberPrimaUsa();
        autobuz.punePeLiberADouaUsa();
        autobuz.punePeLiberATreiaUsa();
    }

    public void deschideToateUsile(){
        autobuz.deschidePrimaUsa();
        autobuz.deschideADouaUsa();
        autobuz.deschideATreiaUsa();
    }
}
