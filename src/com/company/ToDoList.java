package com.company;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {

    static List<ToDoListItem> toDoList = new ArrayList<ToDoListItem>();


    public void addItem(ToDoListItem itemToAdd){
            toDoList.add(itemToAdd);
    }

    public void displayExistingItems(){
        for (int i = 0; i < toDoList.size(); i++){
                toDoList.get(i).print();

                if (i == toDoList.size() -1){
                System.out.println("There are no items in the list. Free day!");
            }
        }
    }

    public void displayItemsByState(String stateInput){
        for (int i = 0; i < toDoList.size(); i++){
            if(toDoList.get(i).getState().equals(stateInput)){
                toDoList.get(i).print();
            } else if (i == toDoList.size() -1){
                System.out.println("There were no items found with a state of: " + stateInput);
            }
        }

    }



    public void deleteItemByDescription(String description){
        for (int i = 0; i < toDoList.size(); i++){
            if(toDoList.get(i) != null && toDoList.get(i).getDescription().equals(description)){
                toDoList.set(i, null);
                System.out.println("All list items with the description of - " + description + " - have been successfully deleted.");
                break;
            } else if (i == toDoList.size() -1){
                System.out.println("There were no items found with a description of: " + description);
            }
        }

    }

    public static void updateDescriptionOfListItem(String descriptionToUpdate, String newDescription){
        for (int i = 0; i < toDoList.size(); i++){
            if(toDoList.get(i).getDescription().equals(descriptionToUpdate)){
                toDoList.get(i).setDescription(newDescription);
                System.out.println("All list items with the description of - " + descriptionToUpdate +
                        " - have been successfully updated with a new description of: " + newDescription);
                break;
            } else if (i == toDoList.size() -1){
                System.out.println("There were no items found with a description of: " + descriptionToUpdate);
            }
        }
    }


    public static void updateStateOfListItem(String description, String newState){
        for (int i = 0; i < toDoList.size(); i++){
            if(toDoList.get(i) != null && toDoList.get(i).getDescription().equals(description)){

                String oldState = toDoList.get(i).getState();

                toDoList.get(i).setState(newState);

                System.out.println("State update was successful");

            } else if (i == toDoList.size() -1){
                System.out.println("There were no items found with a description of: " + description);
            }
        }

    }
}
