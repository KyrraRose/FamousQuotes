package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
     /**   No exceptions
      * boolean keepGoing =  true;
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
      */
        Scanner scanner = new Scanner(System.in);


         while (true) {
             try{
                 String[] quotes = {"FINISH HIM! - Mortal Kombat", "It’s dangerous to go alone, take this! - The Legend of Zelda", "Thank you, Mario! But our Princess is in another castle! - Super Mario", "I used to be an adventurer like you until I took an arrow to the knee. - Skyrim", "Waka Waka Waka Waka Waka Waka Waka Waka Waka Waka Waka Waka - Pacman", "The cake is a lie. - Portal", "War…war never changes - Fallout", "All your base are belong to us. - Zero Wing", "Endure and survive. - The Last of Us", "Don’t make a girl a promise if you know you can’t keep it. - Halo 3"};
                 System.out.print("Which amazing quote would you like to see? (0-9)\nQuote ");
                 int choice = scanner.nextInt();
                 scanner.nextLine();//CRLF
                 System.out.println("\n"+quotes[choice]);
                 boolean keepGoing = true;
                 while(keepGoing) {
                     System.out.println("\nWould you like to see another quote?\n[Y] Yes\n[N] No\n[R] Random Quote");
                     String another = scanner.nextLine().toUpperCase().trim();

                     switch (another) {
                         case "Y":
                             System.out.println("Coming right up!");
                             keepGoing = false;
                             break;
                         case "N":
                             System.out.println("Oh? You didn't like my quote(s)??\nFine, I'm exiting this situation.");
                             System.exit(0);
                             break;
                         case "R":
                             int i = (int) (Math.random() * quotes.length);
                             System.out.printf("\n%s\n", quotes[i]);
                             break;
                         default:
                             System.out.println("I couldn't hear you (I don't have ears) so I'll show you another anyway.");
                     }
                     System.out.println("\n=== Hit [ENTER] to continue! ===");
                     scanner.nextLine();
                 }
                 //Return to start
             }catch (Exception e){
                 System.out.println(e.getMessage());
                 System.out.println("Sorry, I don't know that! please try again.\n");
             }
         }


    }
}
