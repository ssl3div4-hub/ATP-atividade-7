package fatec.maua.tpi.atividade1;

public class Tecnico extends Superior {
    @Override
    public double calculaMedia() {
        return (getN1() + (getN2() * 2) + (getN3() * 2)) / 5;
    }
}
