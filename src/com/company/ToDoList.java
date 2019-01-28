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



}
