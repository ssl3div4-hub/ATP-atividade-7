package fatec.maua.tpi.atividade1;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Superior superior = new Superior();
        Tecnico tecnico = new Tecnico();

        System.out.println("=== Curso Superior ===");
        System.out.print("Digite a nota da P1 (N1): ");
        double n1Superior = scanner.nextDouble();
        System.out.print("Digite a nota da P2 (N2): ");
        double n2Superior = scanner.nextDouble();
        System.out.print("Digite a nota de trabalhos (N3): ");
        double n3Superior = scanner.nextDouble();
        superior.setNotas(n1Superior, n2Superior, n3Superior);

        System.out.println("\n=== Curso Técnico ===");
        System.out.print("Digite a nota do 1º trimestre (N1): ");
        double n1Tecnico = scanner.nextDouble();
        System.out.print("Digite a nota do 2º trimestre (N2): ");
        double n2Tecnico = scanner.nextDouble();
        System.out.print("Digite a nota do 3º trimestre (N3): ");
        double n3Tecnico = scanner.nextDouble();
        tecnico.setNotas(n1Tecnico, n2Tecnico, n3Tecnico);

        System.out.printf("\nMédia (Superior): %.2f%n", superior.calculaMedia());
        System.out.printf("Média (Técnico): %.2f%n", tecnico.calculaMedia());

        scanner.close();
    }
}
