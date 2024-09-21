// TaskFactory.java
package organizer;
import java.time.LocalTime;

public class TaskFactory {
    public static Task createTask(String description, String startTime, String endTime, String priority) throws Exception {
        try {
            LocalTime start = LocalTime.parse(startTime);
            LocalTime end = LocalTime.parse(endTime);

            if (start.isAfter(end)) {
                throw new Exception("Error: Start time must be before end time.");
            }

            return new Task(description, start, end, priority);
        } catch (Exception e) {
            throw new Exception("Error: Invalid time format.");
        }
    }
}