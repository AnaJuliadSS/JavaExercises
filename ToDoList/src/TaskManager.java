import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    private List<String> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Tarefa adicionada: " + task);
    }

    public void removeTask(String task) {
        if (tasks.remove(task)) {
            System.out.println("Tarefa removida: " + task);
        } else {
            System.out.println("Tarefa não encontrada: " + task);
        }
    }

    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Nenhuma tarefa encontrada.");
        } else {
            System.out.println("Lista de Tarefas:");
            for (String task : tasks) {
                System.out.println("- " + task);
            }
        }
    }
}