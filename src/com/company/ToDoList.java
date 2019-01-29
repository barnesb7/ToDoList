package com.company;

public class ToDoList {

    ToDoListItem[] toDoList = new ToDoListItem[10];

    public void addItem(ToDoListItem itemToAdd){
        for (int i = 0; i < toDoList.length; i++){
          if(toDoList[i] == null){
                toDoList[i] = itemToAdd;
                break;
            } else if (i == toDoList.length -1){
                System.out.println("Your list is full. You must delete an item before adding.");
            }
        }
    }

    public void displayExistingItems(){
        for (int i = 0; i < toDoList.length; i++){
            if(toDoList[i] != null){
                toDoList[i].print();
            } else if (i == toDoList.length -1){
                System.out.println("There are no items in the list. Free day!");
            }
        }
    }

    public void displayItemsByState(String stateInput){
        for (int i = 0; i < toDoList.length; i++){
            if(toDoList[i] != null && toDoList[i].getState().equals(stateInput)){
                toDoList[i].print();
            } else if (i == toDoList.length -1){
                System.out.println("There were no items found with a state of: " + stateInput);
            }
        }

    }



    public void deleteItemByDescription(String description){
        for (int i = 0; i < toDoList.length; i++){
            if(toDoList[i] != null && toDoList[i].getDescription().equals(description)){
                toDoList[i] = null;
                System.out.println("All list items with the description of - " + description + " - have been successfully deleted.");
                break;
            } else if (i == toDoList.length -1){
                System.out.println("There were no items found with a description of: " + description);
            }
        }

    }
}
