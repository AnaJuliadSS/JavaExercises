import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String[] options = { "Adicionar livro", "Listar livros", "Sair" };
        Biblioteca biblioteca = new Biblioteca();

        while (true) {
            int choice = JOptionPane.showOptionDialog(null,
                    "Escolha uma opção", "Menu", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            switch (choice) {
                case 0:
                    biblioteca.cadastraLivro();
                    break;
                case 1:
                    biblioteca.listarLivros();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
