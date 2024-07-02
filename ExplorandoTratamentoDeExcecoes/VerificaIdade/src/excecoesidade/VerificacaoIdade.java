package excecoesidade;
import java.util.Scanner;

public class VerificacaoIdade {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite sua idade: ");
            String input = scanner.nextLine();

            int idade = Integer.parseInt(input);

            if (idade < 0 || idade > 120) {
                throw new IllegalArgumentException("Idade fora do intervalo permitido (0 a 120 anos).");
            }

            System.out.println("Idade válida: " + idade);
        } catch (NumberFormatException e) {
            System.err.println("Erro: A entrada não é um número inteiro.");
        } catch (IllegalArgumentException e) {
            System.err.println("Erro: " + e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
