package utils;

import model.TodoList;

import java.util.List;
import java.util.Scanner;

public class ChangePriority {
    public static void changePriority(String updateTask, List<TodoList> listOfTasks, String updatePriority, String updateDate) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter TODO to be changed");
        updateTask = scanner.nextLine();

        for (int i = 0; i < listOfTasks.size(); i++) {
            if (listOfTasks.get(i).getTask().equals(updateTask)) {
                System.out.println("Enter New Priority Number");
                updatePriority = scanner.nextLine();
                System.out.println("Enter new Date");
                updateDate = scanner.nextLine();
                listOfTasks.get(i).setPriority(updatePriority);
                listOfTasks.get(i).setDate(updateDate);
            } else {
                System.out.println("there is no task like this");
            }
        }
    }
}
