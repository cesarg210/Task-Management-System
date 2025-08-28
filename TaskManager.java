
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