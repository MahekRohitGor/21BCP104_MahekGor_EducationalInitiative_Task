// AstronautScheduleOrganizer.java
package organizer;
import java.util.Scanner;

public class AstronautScheduleOrganizer {
    public static void main(String[] args) {
        ScheduleManager scheduleManager = ScheduleManager.getInstance();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Astronaut Daily Schedule Organizer ---");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. View Tasks");
            System.out.println("4. View Tasks by Priority");
            System.out.println("5. Mark Task as Completed");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            try {
                switch (option) {
                    case 1:
                        System.out.print("Enter task description: ");
                        String description = scanner.nextLine();
                        System.out.print("Enter start time (HH:mm): ");
                        String startTime = scanner.nextLine();
                        System.out.print("Enter end time (HH:mm): ");
                        String endTime = scanner.nextLine();
                        System.out.print("Enter priority (High/Medium/Low): ");
                        String priority = scanner.nextLine();
                        Task task = TaskFactory.createTask(description, startTime, endTime, priority);
                        scheduleManager.addTask(task);
                        break;
                    case 2:
                        System.out.print("Enter task description to remove: ");
                        String descToRemove = scanner.nextLine();
                        scheduleManager.removeTask(descToRemove);
                        break;
                    case 3:
                        scheduleManager.viewTasks();
                        break;
                    case 4:
                        System.out.print("Enter priority level to filter (High/Medium/Low): ");
                        String priorityLevel = scanner.nextLine();
                        scheduleManager.viewTasksByPriority(priorityLevel);
                        break;
                    case 5:
                        System.out.print("Enter task description to mark as completed: ");
                        String descToComplete = scanner.nextLine();
                        scheduleManager.markTaskCompleted(descToComplete);
                        break;
                    case 6:
                        System.out.println("Exiting...");
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Invalid option. Please choose again.");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}