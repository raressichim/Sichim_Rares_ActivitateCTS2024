package proxy.classes;

public class AutobuzDeNoapte implements AutobuzAbstract {
    private AutobuzAbstract autobuzAbstract;

    public AutobuzDeNoapte(AutobuzAbstract autobuzAbstract) {
        this.autobuzAbstract = autobuzAbstract;
    }

    @Override
    public void pleacaDinStatie() {
        Autobuz autobuz = (Autobuz) (autobuzAbstract);
        if (autobuz.getNrLocuri() > 0) {
            autobuz.pleacaDinStatie();
        } else {
            System.out.println("nu pleaca");
        }
    }
}
