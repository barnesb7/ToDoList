package com.company;

public class ToDoListItem {

    private String description;
    private String state;


    public ToDoListItem(String description, String state){
        this.description = description;
        this.state = state;
    }

    public void print(){
        System.out.println("<-- " + description + " : " + state + " -->");
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
