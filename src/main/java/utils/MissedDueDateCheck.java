package utils;

import model.TodoList;
import todoEnums.Status;

import java.time.LocalDate;
import java.util.ArrayList;

public class MissedDueDateCheck {
    public static void missedDueDateCheck(ArrayList<TodoList> listOfTasks) {
        LocalDate dateToday = LocalDate.now();
        for (int i = 0; i < listOfTasks.size(); i++) {
            String userDate = listOfTasks.get(i).getDate();
            LocalDate strToDate = LocalDate.parse(userDate);
            if (strToDate.isBefore(dateToday) && listOfTasks.get(i).getStatus().equals(Status.OPEN.getMessage())) {
                System.out.println();
                System.out.println("You have an OPEN task that is past the due date");
                System.out.println();
            }
        }
    }
}
