# Astronaut Daily Schedule Organizer and Design Pattern Demonstration

## Project Overview

This project is divided into two main exercises:

1. **Exercise 1:** Demonstrates the implementation of various software design patterns using Java code examples.
2. **Exercise 2:** Implements a console-based application, "Astronaut Daily Schedule Organizer," to manage astronauts' daily tasks using specific design patterns and adhering to coding best practices.

---

## Exercise 1: Design Pattern Demonstration

This exercise includes different use cases demonstrating various design patterns:

### Behavioral Design Patterns
1. **Observer Pattern:** Implemented a weather station that notifies multiple display units (e.g., phone display, desktop display) whenever there is a change in weather data.
2. **Strategy Pattern:** Implement a simple payment processing system that can switch between different payment methods like CreditCard, PayPal, and Bitcoin.
   
### Creational Design Patterns
1. **Singleton Pattern:** Implement a Database connection manager to ensure only one instance of the connection is created throughout the application.
2. **Factory Pattern:** Create a factory to produce different types of vehicles (e.g., Car, Bike) without specifying the exact class of object that will be created.
   
### Structural Design Patterns
1. **Adapter Pattern:** Adapt a legacy audio player to a modern audio interface to play multiple formats (e.g., MP3, WAV).
2. **Decorator Pattern:** Dynamically add features to a simple coffee order (e.g., adding milk, sugar, whipped cream) without altering the base Coffee class.

Each pattern is implemented in a separate Java file with clear naming conventions.

### Running the Code
To run these code examples:

1. Navigate to the directory containing the `.java` files.
2. Compile the code using:
    ```bash
    javac ClassName.java
    ```
3. Run the compiled class using:
    ```bash
    java ClassName
    ```

Ensure that your file structure and package declarations match as needed.

---

## Exercise 2: Astronaut Daily Schedule Organizer

This is a console-based application to help astronauts organize their daily schedules. It uses the following design patterns:

1. **Singleton Pattern**: Ensures there is only one instance of the `ScheduleManager` class.
2. **Factory Pattern**: Creates task objects in the `TaskFactory` class.
3. **Observer Pattern**: Notifies users of task conflicts or updates.

### Functional Requirements
1. **Add Task**: Add a new task with a description, start time, end time, and priority level.
2. **Remove Task**: Remove an existing task.
3. **View Tasks**: View all tasks sorted by start time.
4. **Validation**: Ensure no task overlaps with existing tasks.
5. **Error Handling**: Display appropriate error messages for invalid operations.

### Optional Features
1. **Edit Task**: Modify an existing task's details.
2. **Mark as Completed**: Mark tasks as completed.
3. **View by Priority**: View tasks based on their priority level.

### Non-functional Requirements
1. **Exception Handling**: Handle exceptions gracefully.
2. **Performance Optimization**: Ensure optimized performance.
3. **Logging**: Implement a logging mechanism to track application usage and errors.

### Project Structure
- **`ScheduleManager.java`**: Manages all tasks using the Singleton pattern.
- **`Task.java`**: Represents a task with attributes like description, start time, end time, and priority.
- **`TaskFactory.java`**: Creates different task objects using the Factory pattern.
- **`TaskObserver.java`**: Observes task changes and conflicts using the Observer pattern.
- **`AstronautDailyScheduleOrganizer.java`**: The main class containing the menu and user interface logic.

### How to Run the Application

1. Navigate to the directory containing the `.java` files.
2. Compile the application using:
   ```bash
   javac AstronautDailyScheduleOrganizer.java
    ```
3. Run the compiled class:
    ```bash
      java AstronautDailyScheduleOrganizer
    ```

Conclusion
This project showcases the application of design patterns in various scenarios and builds a functional schedule management system using best practices in Java. The focus is on clean, maintainable code and demonstrating understanding through practical implementations.
