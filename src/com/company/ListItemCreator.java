package com.company;

import java.util.Scanner;

public class ListItemCreator {
    Scanner scanner = new Scanner(System.in);

    public ToDoListItem createNewItem(){
        System.out.println("Enter task description");
        String description = scanner.nextLine();
        boolean inValidStateGiven = true;
        String stateInput;
        do {
            System.out.println("Enter state [to do], [in progress], [complete]");
            stateInput = scanner.nextLine();

            if(stateInput.equals("to do") || stateInput.equals("in progress") || stateInput.equals("complete")){
                inValidStateGiven = false;
            } else {
                System.out.println("Please enter a valid state from the option below");
            }

        } while(inValidStateGiven);
        return new ToDoListItem(description, stateInput);
    }

}
