package com.company;
import java.util.Scanner;

public class ToDoListDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();
        ListItemCreator toDoItemCreator = new ListItemCreator();
        UserMenu userMenu = new UserMenu();

        boolean shouldContinue = true;
        String userInput;

        do{
            userMenu.displayMenu();
            userInput = scanner.nextLine();

            if(userInput.equals("1")){
                // display all items

            } else if (userInput.equals("2")){
                // display items by state
            } else if (userInput.equals("3")){
                // add item
                ToDoListItem itemToAdd = toDoItemCreator.createNewItem();
                toDoList.addItem(itemToAdd);
            } else if (userInput.equals("4")){
                // edit existing item
            } else if (userInput.equals("5")){
                // delete an item
            } else if (userInput.equals("6")){
                //exit program
                shouldContinue = false;
                System.out.println("Thank you! Goodbye");
            } else {
                System.out.println("Please enter one of the below options by number");
            }

        } while (shouldContinue);
    }
}
