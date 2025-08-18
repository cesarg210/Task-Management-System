import java.lang.*;
import java.util.ArrayList;
import java.util.Scanner;

// Task class to represent a task
class Task {
    private int id;
    private String description;

    public Task(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Task ID: " + id + ", Description: " + description;
    }
}

// TaskManager class to handle task operations
class TaskManager {
    private ArrayList<Task> tasks;
    private int nextId;

    public TaskManager() {
        tasks = new ArrayList<>();
        nextId = 1; // Auto-increment IDs
    }

    public void addTask(String description) {
        tasks.add(new Task(nextId++, description));
        System.out.println("Task added successfully!");
    }

    public void removeTask(int id) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == id) {
                tasks.remove(i);
                System.out.println("Task removed successfully!");
                return;
            }
        }
        System.out.println("Error: Task with ID " + id + " not found.");
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }
}

// Main class for console interface
public class TaskApp {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nTask Management App");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. View Tasks");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            // Validate input
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter task description: ");
                        String description = scanner.nextLine();
                        manager.addTask(description);
                        break;
                    case 2:
                        System.out.print("Enter task ID to remove: ");
                        if (scanner.hasNextInt()) {
                            int id = scanner.nextInt();
                            manager.removeTask(id);
                        } else {
                            System.out.println("Error: Invalid ID.");
                            scanner.nextLine();
                        }
                        break;
                    case 3:
                        manager.viewTasks();
                        break;
                    case 4:
                        running = false;
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Error: Invalid option. Choose 1-4.");
                }
            } else {
                System.out.println("Error: Please enter a number.");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}