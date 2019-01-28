package com.company;

import java.util.Scanner;

public class ListItemCreator {
    Scanner scanner = new Scanner(System.in);

    public ToDoListItem createNewItem(){
        System.out.println("Enter task description");
        String description = scanner.nextLine();

        System.out.println("Enter state [to do], [in progress], [complete]");
        String state = scanner.nextLine();

        return new ToDoListItem(description, state);
    }

}
