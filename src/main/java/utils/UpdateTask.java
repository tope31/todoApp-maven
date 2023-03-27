package utils;

import model.TodoList;
import todoEnums.Status;

import java.util.List;
import java.util.Scanner;

public class UpdateTask {
    public static void updateTask(String updateTask, List<TodoList> listOfTasks) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter TODO to update to DONE");
        updateTask = scanner.nextLine();

        for (int i = 0; i < listOfTasks.size(); i++) {
            if (listOfTasks.get(i).getTask().equals(updateTask)) {
                listOfTasks.get(i).setStatus(Status.DONE.getMessage());
            }
        }
    }
}
