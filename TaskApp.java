import java.lang.*;
import java.util.ArrayList;
import java.util.Scanner;

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