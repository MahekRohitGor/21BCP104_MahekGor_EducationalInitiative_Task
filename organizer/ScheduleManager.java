// ScheduleManager.java
package organizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ScheduleManager {
    private List<Task> tasks;
    private static ScheduleManager instance;

    private ScheduleManager() {
        tasks = new ArrayList<>();
    }

    public static ScheduleManager getInstance() {
        if (instance == null) {
            instance = new ScheduleManager();
        }
        return instance;
    }

    public void addTask(Task task) throws Exception {
        for (Task existingTask : tasks) {
            if (isConflict(existingTask, task)) {
                throw new Exception("Error: Task conflicts with existing task \"" + existingTask.getDescription() + "\".");
            }
        }
        tasks.add(task);
        notifyUsers("Task added successfully. No conflicts.");
    }

    public void removeTask(String description) throws Exception {
        Task taskToRemove = findTask(description);
        if (taskToRemove == null) {
            throw new Exception("Error: Task not found.");
        }
        tasks.remove(taskToRemove);
        notifyUsers("Task removed successfully.");
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks scheduled for the day.");
            return;
        }

        // Sort tasks by start time
        Collections.sort(tasks, Comparator.comparing(Task::getStartTime));

        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public void viewTasksByPriority(String priority) {
        boolean found = false;
        for (Task task : tasks) {
            if (task.getPriority().equalsIgnoreCase(priority)) {
                System.out.println(task);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No tasks found for the given priority level.");
        }
    }

    public void markTaskCompleted(String description) throws Exception {
        Task task = findTask(description);
        if (task == null) {
            throw new Exception("Error: Task not found.");
        }
        task.markCompleted();
        notifyUsers("Task marked as completed.");
    }

    private Task findTask(String description) {
        for (Task task : tasks) {
            if (task.getDescription().equalsIgnoreCase(description)) {
                return task;
            }
        }
        return null;
    }

    private boolean isConflict(Task existingTask, Task newTask) {
        return newTask.getStartTime().isBefore(existingTask.getEndTime()) && newTask.getEndTime().isAfter(existingTask.getStartTime());
    }

    private void notifyUsers(String message) {
        System.out.println(message);
    }
}