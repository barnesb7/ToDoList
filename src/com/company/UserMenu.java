package com.company;

public class UserMenu {

    private String NEWLINE = "\n";
    private String title = "ToDo List";
    private String displayAllItemsOption = "[1] Display existing items";
    private String displayByStateOption = "[2] Display existing items by state";
    private String addItemOption = "[3] Add an item";
    private String editExistingItemOption = "[4] Edit an existing item";
    private String deleteItemOption = "[5] Delete an item";
    private String exitOption = "[6] Exit program";

    public void displayMenu(){
        System.out.println(title + NEWLINE + displayAllItemsOption + NEWLINE + displayByStateOption + NEWLINE
                            + addItemOption + NEWLINE + editExistingItemOption + NEWLINE + deleteItemOption
                            + NEWLINE + exitOption);
    }
}
