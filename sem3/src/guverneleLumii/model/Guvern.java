package guverneleLumii.model;

public class Guvern {
    private String tara;
    private String primMinistru;
    private int nrGuvernatori;

    protected Guvern(String tara, String primMinistru, int nrGuvernatori) {
        this.tara = tara;
        this.primMinistru = primMinistru;
        this.nrGuvernatori = nrGuvernatori;
    }

    public void setTara(String tara) {
        this.tara = tara;
    }

    public void setPrimMinistru(String primMinistru) {
        this.primMinistru = primMinistru;
    }

    public void setNrGuvernatori(int nrGuvernatori) {
        this.nrGuvernatori = nrGuvernatori;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Guvern{");
        sb.append("tara='").append(tara).append('\'');
        sb.append(", primMinistru='").append(primMinistru).append('\'');
        sb.append(", nrGuvernatori=").append(nrGuvernatori);
        sb.append('}');
        return sb.toString();
    }
}
