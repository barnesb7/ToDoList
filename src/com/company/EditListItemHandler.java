package com.company;

import java.util.Scanner;

public class EditListItemHandler {

    Scanner scanner = new Scanner(System.in);

    public void handleEdit(){

        System.out.println("What is the description of the item you would like to edit?");
        String listItemDescription = scanner.nextLine();

        System.out.println("Got HERE");

        boolean descriptionFound = checkIfDescriptionWasFound(listItemDescription);

        if(descriptionFound){

            String userChoice;
            boolean invalidOptionChosen = true;

           do {
               System.out.println("The list item was found. \n Would you like to edit the [1] - description or [2] - state ");
               userChoice = scanner.nextLine();

               if(userChoice.equals("1") || userChoice.equals("2")){
                   invalidOptionChosen = false;
               } else {
                   System.out.println("Please choose a valid option from below");
               }

           }while(invalidOptionChosen);

            if(userChoice.equals("1")){
                System.out.println("What should the updated description be?");
                String updatedDescription = scanner.nextLine();
                ToDoList.updateDescriptionOfListItem(listItemDescription, updatedDescription);

            } else if (userChoice.equals("2")){
                System.out.println("What should the updated status be?");
                String updatedState = scanner.nextLine();

                ToDoList.updateStateOfListItem(listItemDescription, updatedState);
            }

        }else{
            System.out.println("A list item with a description of: " + listItemDescription + " was not found in your list.");
        }


    }


    private boolean checkIfDescriptionWasFound(String description) {

        boolean descriptionFound = false;

        for (int i = 0; i < ToDoList.toDoList.length; i++) {
            if (ToDoList.toDoList[i] != null && ToDoList.toDoList[i].getDescription().equals(description)) {
                descriptionFound = true;
                break;
            }

        }
        return descriptionFound;
    }


}
