package fatec.maua.tpi.atividade1;

public class Pessoa {
    private String nome;
    private int idade;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void ajustaDataDeNascimento(int dia, int mes, int ano) {
        this.diaNascimento = dia;
        this.mesNascimento = mes;
        this.anoNascimento = ano;
    }

    public void calculaIdade(int diaAtual, int mesAtual, int anoAtual) {
        int idadeCalculada = anoAtual - this.anoNascimento;

        if (mesAtual < this.mesNascimento ||
            (mesAtual == this.mesNascimento && diaAtual < this.diaNascimento)) {
            idadeCalculada--;
        }

        this.idade = idadeCalculada;
    }

    public int informaIdade() {
        return idade;
    }

    public String informaNome() {
        return nome;
    }
}
