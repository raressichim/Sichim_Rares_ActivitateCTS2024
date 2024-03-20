package Builder_v2;

public class Rezervare {
    private boolean areMancare;
    private boolean areScaunErgonomic;
    private boolean areBautura;
    private boolean areMuzica;
    private String genMuzical;

    protected Rezervare(boolean areMancare, boolean areScaunErgonomic, boolean areBautura, boolean areMuzica, String genMuzical) {
        this.areMancare = areMancare;
        this.areScaunErgonomic = areScaunErgonomic;
        this.areBautura = areBautura;
        this.areMuzica = areMuzica;
        this.genMuzical = genMuzical;
    }

    protected Rezervare() {
    }

    public boolean isAreMancare() {
        return areMancare;
    }

    protected void setAreMancare(boolean areMancare) {
        this.areMancare = areMancare;
    }

    public boolean isAreScaunErgonomic() {
        return areScaunErgonomic;
    }

    protected void setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.areScaunErgonomic = areScaunErgonomic;
    }

    public boolean isAreBautura() {
        return areBautura;
    }

    protected void setAreBautura(boolean areBautura) {
        this.areBautura = areBautura;
    }

    public boolean isAreMuzica() {
        return areMuzica;
    }

    protected void setAreMuzica(boolean areMuzica) {
        this.areMuzica = areMuzica;
    }

    public String getGenMuzical() {
        return genMuzical;
    }

    protected void setGenMuzical(String genMuzical) {
        this.genMuzical = genMuzical;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("areMancare=").append(areMancare);
        sb.append(", areScaunErgonomic=").append(areScaunErgonomic);
        sb.append(", areBautura=").append(areBautura);
        sb.append(", areMuzica=").append(areMuzica);
        sb.append(", genMuzical='").append(genMuzical).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static class RezervareBuilder implements Builder_v2.AbstractBuilder {
        private boolean areMancare;
        private boolean areScaunErgonomic;
        private boolean areBautura;
        private boolean areMuzica;
        private String genMuzical;

        public RezervareBuilder() {
        }


        @Override
        public Rezervare build() {
            return new Rezervare(areMancare, areScaunErgonomic, areBautura, areMuzica, genMuzical);
        }

        @Override
        public AbstractBuilder adaugaScaunErgonomic() {
            this.areScaunErgonomic = true;
            return this;
        }

        @Override
        public AbstractBuilder adaugaMancare() {
            this.areMancare = true;
            return this;
        }

        @Override
        public AbstractBuilder adaugaBautura() {
            this.areBautura = true;
            return this;
        }

        @Override
        public AbstractBuilder adaugaMuzica() {
            this.areMuzica = true;
            return this;
        }

        @Override
        public AbstractBuilder adaugaGenMuzical(String genMuzical) {
            this.genMuzical = genMuzical;
            return this;
        }
    }
}
