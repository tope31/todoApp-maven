package utils;

import model.TodoList;

import java.util.List;

public class PrintTask {
    public static void printTasks(int taskCount, List<TodoList> listOfTasks) {
        System.out.println("You have " + taskCount + " TODOs");
        for (TodoList show : listOfTasks) {
            System.out.println(show.getStatus() + ": " + show.getTask() + " (priority " + show.getPriority() + ", due " + show.getDate() + ")");
            System.out.println();
        }
    }
}
