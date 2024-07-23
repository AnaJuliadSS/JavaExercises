import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Biblioteca {

    private List<Livro> livros;
    int idCount = 0;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void cadastraLivro() {

        try {
            String titulo = JOptionPane.showInputDialog("Digite o titulo do livro:");
            if (titulo == null || titulo.trim().isEmpty())
                throw new IllegalArgumentException();

            String autor = JOptionPane.showInputDialog("Digite o autor do livro:");
            if (autor == null || autor.trim().isEmpty())
                throw new IllegalArgumentException();

            String anoDePublicacaoStr = JOptionPane.showInputDialog("Digite o ano de publicação:");
            if (anoDePublicacaoStr == null || anoDePublicacaoStr.trim().isEmpty())
                throw new IllegalArgumentException();
            int anoDePublicacao = Integer.parseInt(anoDePublicacaoStr);

            Livro livro = new Livro(titulo, autor, anoDePublicacao, idCount);

            this.livros.add(livro);

            this.idCount++;

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ano de publicação inválido. Por favor, insira um número inteiro.",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Este campo é obrigatório.", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o livro.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void listarLivros() {
        if (livros.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum livro cadastrado.");
        } else {
            StringBuilder listaDeLivros = new StringBuilder();
            for (Livro livro : livros) {
                listaDeLivros.append(livro.toString()).append("\n");
            }
            JOptionPane.showMessageDialog(null, listaDeLivros.toString());
        }
    }
}
