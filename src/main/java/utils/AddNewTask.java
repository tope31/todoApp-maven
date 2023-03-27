package utils;

import model.TodoList;
import todoEnums.Status;

import java.util.List;
import java.util.Scanner;

public class AddNewTask {
    public static void addNewTask(List<TodoList> listOfTasks) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your new TODO");
        TodoList toDoList = new TodoList();
        toDoList.setTask(scanner.nextLine());
        System.out.println("Enter priority");
        toDoList.setPriority(scanner.nextLine());
        System.out.println("Enter due date (yyyy-mm-dd format)");
        toDoList.setDate(scanner.nextLine());
        toDoList.setStatus(Status.OPEN.getMessage());
        listOfTasks.add(toDoList);
    }

}
