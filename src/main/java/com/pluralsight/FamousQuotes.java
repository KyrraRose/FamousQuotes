package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        boolean keepGoing =  true;
        do {
            Scanner scanner = new Scanner(System.in);
            String[] quotes = {"FINISH HIM! - Mortal Kombat", "It’s dangerous to go alone, take this! - The Legend of Zelda", "Thank you, Mario! But our Princess is in another castle! - Super Mario", "I used to be an adventurer like you until I took an arrow to the knee. - Skyrim", "Waka Waka Waka Waka Waka Waka Waka Waka Waka Waka Waka Waka - Pacman", "The cake is a lie. - Portal", "War…war never changes - Fallout", "All your base are belong to us. - Zero Wing", "Endure and survive. - The Last of Us", "Don’t make a girl a promise if you know you can’t keep it. - Halo 3"};
            System.out.print("Which quote would you like to see? (0-9)\nQuote ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            System.out.println("\n"+quotes[choice]);
            System.out.println("\nWould you like to see another quote?\n[Y] Yes\n[X] Exit");
            String another = scanner.nextLine().toUpperCase().trim();
            switch (another){
                case "Y":
                    System.out.println("Coming right up!");
                    break;
                case "X":
                    keepGoing = false;
            }
        }while(keepGoing);

    }
}
