import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculoMediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> notas = new ArrayList<>();

        try {
            while (true) {
                System.out.print("Insira uma nota (ou digite 'fim' para terminar): ");
                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("fim")) {
                    break;
                }

                try {
                    double nota = Double.parseDouble(input);
                    
                    if (nota < 0 || nota > 10) {
                        throw new IllegalArgumentException("Nota fora do intervalo permitido (0 a 10).");
                    }
                    
                    notas.add(nota);
                } catch (NumberFormatException e) {
                    System.err.println("Erro: Entrada inválida. Insira um número válido.");
                } catch (IllegalArgumentException e) {
                    System.err.println("Erro: " + e.getMessage());
                }
            }

            if (notas.isEmpty()) {
                throw new IllegalArgumentException("Nenhuma nota foi inserida.");
            }

            double soma = 0;
            for (double nota : notas) {
                soma += nota;
            }
            double media = soma / notas.size();

            System.out.println("Média das notas: " + media);

        } catch (IllegalArgumentException e) {
            System.err.println("Erro ao calcular média: " + e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
