import model.TodoList;
import utils.AddNewTask;

import java.util.ArrayList;
import java.util.Scanner;

import static utils.ChangePriority.changePriority;
import static utils.MissedDueDateCheck.missedDueDateCheck;
import static utils.MostUrgentTaskCheck.mostUrgentTaskCheck;
import static utils.PrintTask.printTasks;
import static utils.UpdateTask.updateTask;

public class Main {
    public static void main(String[] args) {
        ArrayList<TodoList> listOfTasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        int taskCount = 0;
        String updateTask = "";
        String updatePriority = "";
        String updateDate = "";
        int flag = 5;


        System.out.println("-----------------------");
        System.out.println("Manage your TODOs");

        while (choice < flag) {

            mostUrgentTaskCheck(listOfTasks);
            missedDueDateCheck(listOfTasks);

            System.out.println("-----------------------");
            System.out.println("Type");
            System.out.println("1 to print all your TODOs\n2 to add new TODO");
            System.out.println("3 to mark a TODO as DONE");
            System.out.println("4 to change priority and due date of a TODO");
            System.out.println("5 to quit");
            System.out.println("Your choice? ");

            try {
                choice = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e) {
                throw new NumberFormatException("Please input a number");
            }

            if (choice <= 0) {
                System.out.println("Please input valid numbers");
            }

            switch (choice) {
                case 1:
                    printTasks(taskCount, listOfTasks);
                    break;
                case 2:
                    AddNewTask.addNewTask(listOfTasks);
                    taskCount++;
                    break;
                case 3:
                    updateTask(updateTask, listOfTasks);
                    break;
                case 4:
                    changePriority(updateTask, listOfTasks, updatePriority, updateDate);
                    break;
            }
        }
    }
}
