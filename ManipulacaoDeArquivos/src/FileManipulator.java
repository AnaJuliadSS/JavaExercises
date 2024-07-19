import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileManipulator {

    public static void main(String[] args) {
        while (true) {
            String[] options = {"Escrever no Arquivo", "Consultar Arquivo", "Sair"};
            int choice = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            switch (choice) {
                case 0:
                    writeFile();
                    break;
                case 1:
                    readFile();
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

    private static void writeFile() {
        String fileName = JOptionPane.showInputDialog("Digite o nome do arquivo:");
        if (fileName == null || fileName.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nome do arquivo inválido.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String content = JOptionPane.showInputDialog("Digite o conteúdo a ser escrito no arquivo:");
        if (content == null || content.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Conteúdo inválido.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(content);
            writer.newLine();
            JOptionPane.showMessageDialog(null, "Conteúdo escrito no arquivo com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao escrever no arquivo: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void readFile() {
        String fileName = JOptionPane.showInputDialog("Digite o nome do arquivo:");
        if (fileName == null || fileName.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nome do arquivo inválido.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!Files.exists(Paths.get(fileName))) {
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            JOptionPane.showMessageDialog(null, content.length() > 0 ? content.toString() : "Arquivo vazio.", "Conteúdo do Arquivo", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao ler o arquivo: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
