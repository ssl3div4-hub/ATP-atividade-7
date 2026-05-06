package fatec.maua.tpi.atividade1;

public class Superior {
    private double n1;
    private double n2;
    private double n3;

    public void setNotas(double n1, double n2, double n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    protected double getN1() {
        return n1;
    }

    protected double getN2() {
        return n2;
    }

    protected double getN3() {
        return n3;
    }

    public double calculaMedia() {
        return (n1 * 0.35) + (n2 * 0.50) + (n3 * 0.15);
    }
}
