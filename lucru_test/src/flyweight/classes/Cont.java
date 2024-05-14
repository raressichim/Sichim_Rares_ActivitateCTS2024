package flyweight.classes;

public class Cont {
    private int sold;

    public Cont(int sold) {
        this.sold = sold;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cont{");
        sb.append("sold=").append(sold);
        sb.append('}');
        return sb.toString();
    }
}
