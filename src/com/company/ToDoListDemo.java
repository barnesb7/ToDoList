package com.company;
import java.util.Scanner;

public class ToDoListDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        UserMenu userMenu = new UserMenu();

        boolean shouldContinue = true;
        String userInput;

        do{
            userMenu.displayMenu();
            userInput = scanner.nextLine();

            if(userInput.equals("1")){

            } else if (userInput.equals("2")){

            } else if (userInput.equals("3")){

            } else if (userInput.equals("4")){

            } else if (userInput.equals("5")){

            } else if (userInput.equals("6")){
                shouldContinue = false;
                System.out.println("Thank you! Goodbye");
            } else {
                System.out.println("Please enter one of the below options by number");
            }

        } while (shouldContinue);
    }
}
