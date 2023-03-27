package utils;

import model.TodoList;
import todoEnums.Status;

import java.time.LocalDate;
import java.util.ArrayList;

public class MostUrgentTaskCheck {
    public static void mostUrgentTaskCheck(ArrayList<TodoList> listOfTasks) {
        LocalDate dateToday = LocalDate.now();
        LocalDate dateAfterThreeDays = dateToday.plusDays(3);
        for (int i = 0; i < listOfTasks.size(); i++) {
            String str = listOfTasks.get(i).getDate();
            LocalDate mostUrgentTask = LocalDate.parse(str);
            boolean equals = listOfTasks.get(i).getStatus().equals(Status.OPEN.getMessage());
            boolean before = mostUrgentTask.isBefore(dateAfterThreeDays);
            if (before && equals) {
                System.out.println("The most urgent task that you need to do is: \nTask:" + listOfTasks.get(i).getTask() + "\nDue date: " + listOfTasks.get(i).getDate());
                System.out.println();
            }
        }
    }
}
