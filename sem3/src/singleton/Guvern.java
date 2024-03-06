package singleton;

public class Guvern {
    private int nrGuvernatori;
    private String numePriministru;
    private int nrLuni;
    private static Guvern instance;

    private Guvern(int nrGuvernatori, String numePriministru, int nrLuni) {
        this.nrGuvernatori = nrGuvernatori;
        this.numePriministru = numePriministru;
        this.nrLuni = nrLuni;
    }

    public synchronized static Guvern getInstance(int nrGuvernatori, String numePriministru, int nrLuni) {
        if (instance == null) {
            instance = new Guvern(nrGuvernatori, numePriministru, nrLuni);
        }
        return instance;
    }

    public void setNrGuvernatori(int nrGuvernatori) {
        this.nrGuvernatori = nrGuvernatori;
    }

    public void setNumePriministru(String numePriministru) {
        this.numePriministru = numePriministru;
    }

    public void setNrLuni(int nrLuni) {
        this.nrLuni = nrLuni;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Guvern{");
        sb.append("nrGuvernatori=").append(nrGuvernatori);
        sb.append(", numePriministru='").append(numePriministru).append('\'');
        sb.append(", nrLuni=").append(nrLuni);
        sb.append('}');
        return sb.toString();
    }
}
