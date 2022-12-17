package Presentation;

import java.util.Scanner;

import Business.PartyActions;

public class FamilyChristmasV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       System.out.println("\nWelcome to the family Christmas party!");
        System.out.print("Enter your name to begin: ");
        String name = scanner.nextLine();
        System.out.println("Welcome to the madness " + name + "!");

       boolean takeAction = true;

       while(takeAction) {
            System.out.print("\nSelect (1) for food, (2) for gifts, or (3) to exit: ");
            int userInput = scanner.nextInt();
            System.out.println();

           switch (userInput) {
               case 1 -> {
                   PartyActions.food();
               }
               case 2 -> {
                   PartyActions.gifts();
               }
               case 3 -> {
                   takeAction = false;
                   System.out.println("Bye " + name + "! See you at the party!!!");
               }
               default -> {
               }
           }
       }
    }
}