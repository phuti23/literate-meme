// File: TodoApp.java

import java.util.ArrayList;
import java.util.Scanner;

public class TodoApp {

    // List to store tasks
    private static ArrayList<String> todoList = new ArrayList<>();

    // Method to add a task
    public static void addTask(String task) {
        todoList.add(task);
        System.out.println("Task added: " + task);
    }

    // Method to display all tasks
    public static void displayTasks() {
        if (todoList.isEmpty()) {
            System.out.println("No tasks in the list.");
        } else {
            System.out.println("To-Do List:");
            for (int i = 0; i < todoList.size(); i++) {
                System.out.println((i + 1) + ". " + todoList.get(i));
            }
        }
    }

    // Method to remove a task
    public static void removeTask(int index) {
        if (index > 0 && index <= todoList.size()) {
            String removedTask = todoList.remove(index - 1);
            System.out.println("Task removed: " + removedTask);
        } else {
            System.out.println("Invalid task number.");
        }
    }

    // Main method for interaction
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to the To-Do List Application");

        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Add task");
            System.out.println("2. Display tasks");
            System.out.println("3. Remove task");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter a task: ");
                    String task = scanner.nextLine();
                    addTask(task);
                    break;

                case 2:
                    displayTasks();
                    break;

                case 3:
                    displayTasks();
                    System.out.print("Enter task number to remove: ");
                    int taskNumber = scanner.nextInt();
                    removeTask(taskNumber);
                    break;

                case 4:
                    running = false;
                    System.out.println("Exiting application.");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}
