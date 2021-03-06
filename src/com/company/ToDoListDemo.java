package com.company;
import java.util.Scanner;

public class ToDoListDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();
        ListItemCreator toDoItemCreator = new ListItemCreator();
        UserMenu userMenu = new UserMenu();
        EditListItemHandler editListItemHandler = new EditListItemHandler();

        boolean shouldContinue = true;
        String userInput;

        final String displayAllItems = "1";
        final String displayItemsByState = "2";
        final String addToDoListItem = "3";
        final String editExistingItem = "4";
        final String deleteItem = "5";
        final String exitProgram = "6";

        do{
            userMenu.displayMenu();
            userInput = scanner.nextLine();

            if(userInput.equals(displayAllItems)){
                toDoList.displayExistingItems();

            } else if (userInput.equals(displayItemsByState)){
                boolean invalidStateGiven = true;
                String stateInput;
                do {
                    System.out.println("How would you like to sort? [to do], [in progress], [complete]");
                    stateInput = scanner.nextLine();

                    if(stateInput.equals("to do") || stateInput.equals("in progress") || stateInput.equals("complete")){
                        invalidStateGiven = false;
                    } else {
                        System.out.println("Please input a valid state from the choices below");
                    }

                    }while(invalidStateGiven);

                toDoList.displayItemsByState(stateInput);

            } else if (userInput.equals(addToDoListItem)){
                // add item
                ToDoListItem listItemToAdd = toDoItemCreator.createNewItem();
                toDoList.addItem(listItemToAdd);

            } else if (userInput.equals(editExistingItem)){
                editListItemHandler.handleEdit();

            } else if (userInput.equals(deleteItem)){
                System.out.println("What is the description of the task you would like to delete?");
                String listItemDescription = scanner.nextLine();
                toDoList.deleteItemByDescription(listItemDescription);

            } else if (userInput.equals(exitProgram)){
                shouldContinue = false;
                System.out.println("Thank you! Goodbye");

            } else {
                System.out.println("Please enter one of the below options by number");
            }

        } while (shouldContinue);
    }
}
