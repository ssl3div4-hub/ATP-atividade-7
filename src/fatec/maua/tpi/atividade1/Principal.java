package fatec.maua.tpi.atividade1;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();

        Pessoa einstein = new Pessoa("Albert Einstein");
        einstein.ajustaDataDeNascimento(14, 3, 1879);
        einstein.calculaIdade(hoje.getDayOfMonth(), hoje.getMonthValue(), hoje.getYear());

        Pessoa newton = new Pessoa("Isaac Newton");
        newton.ajustaDataDeNascimento(4, 1, 1643);
        newton.calculaIdade(hoje.getDayOfMonth(), hoje.getMonthValue(), hoje.getYear());

        System.out.println("Se estivessem vivos hoje (" + hoje + "):");
        System.out.println(einstein.informaNome() + " teria " + einstein.informaIdade() + " anos.");
        System.out.println(newton.informaNome() + " teria " + newton.informaIdade() + " anos.");
    }
}
