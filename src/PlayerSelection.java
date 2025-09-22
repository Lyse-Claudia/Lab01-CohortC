//Name of Project: Ashesi Premier League-Lab01
//Author: Lyse Claudia Irera
//Date: 29/19/2025
//Purpose: Practice basic concepts in a single Java program
// that helps a coach make decisions about player eligibility, position, and lineup.




import java.awt.*;
import java.util.Scanner;


public class PlayerSelection {
    public static void main(String[] args) {
        System.out.println("Welcome to the Player Selection Program:");
        double pound = 0.45359237;
        int meter = 100;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the player's name: ");
        String name = input.nextLine();
        System.out.println("Enter " + name + "'s age");
        int age = input.nextInt();
        System.out.println("Enter " + name + "'s Height in meters: ");
        double height = input.nextFloat();
        height *= meter;
        int conv_height = (int) height;
        System.out.println("Enter " + name + "'s Weight in pounds: ");
        double weight = input.nextFloat();
        weight *= pound;
        int conv_weight = (int)weight;
        System.out.println("Enter " + name + "'s Jersey Number: ");
        int jersey_num = input.nextInt();

        System.out.println("The player's name is: "+name);

        //Printing player's age and their category
        if (age < 20) {
            System.out.println(name+ " is "+ age+ " years old. So, they are a Rising Star.");
        }
        else if (age <= 30) {
            System.out.println(name+ " is "+ age+ "years. So, they are a Prime Player.");
        }
        else {
            System.out.println(name + " is " + age + " years. So, they are a Veteran");
        }
        //printing height, weight, jersey number, and the incremented age and decremented jersey number
        System.out.println("Height: "+ conv_height+"cm.");
        System.out.println("Weight: "+conv_weight+"kg.");
        System.out.println("The jersey number: "+jersey_num);
        System.out.println("In the next season, "+name+" will be "+ ++age +" years old.");
        System.out.println("If they receive any penalty, their jersey number will become "+ --jersey_num);

        //Position of the player based on their original jersey number, not the decremented one.
        switch (jersey_num) {
            case 1:
                System.out.println("Position: Goalkeeper");
                break;
            case 2:
            case 5:
                System.out.println("Position: Defender");
                break;
            case 6:
            case 8:
                System.out.println("Position: Midfielder");
                break;
            case 7:
            case 11:
                System.out.println("Position: Winger");
                break;
            case 9:
                System.out.println("Position: Striker");
                break;
            case 10:
                System.out.println("Position: Playmaker");
                break;
            default:
                System.out.println("Player position not known");

        }

        //Attacker status: I found online that attacker jerseys are 7,9, 10, and 11.
        //So, I'm using those numbers in a combined switch case to check either a player has an attacker jersey or not.

        switch (jersey_num){
            case 7,8,10,11 -> System.out.println("Attacker Jersey: Yes");
            default -> System.out.println("Attacker Jersey: No");
        }

        //Eligibility
        if (age >= 18 && age <= 35 && weight < 90) {
            System.out.println("Eligibility: Eligible");
        }
        else {
            System.out.println("Eligibility: Not Eligible");
        }
        if (age < 18 || weight >= 90) {
            System.out.println(name + " has a problem (Either too young or too heavy).");
        }
        //Lineup Decision
        if ((20 <= age && age <= 30) && (conv_weight < 80)){
                System.out.println("Lineup Decision: Starting lineup");
            }

        else
            System.out.println("Lineup Decision: Bench");

        //Final Decision

        String decision = (age >= 18 && age <= 35 && weight < 90)? "Final Decision: Play.": "Final Decision: Rest";
        System.out.println(decision);
        //End of the program.


        //This is the code for the unwanted fall-through demo to observe the difference.
        switch (jersey_num){
            case 1: System.out.println("Position: Goalkeeper");
                break;
            case 2: System.out.println("Position: Defender");

            case 6: System.out.println("Position: Midfielder");

            case 7: System.out.println("Position: Winger");

            case 9: System.out.println("Position: Striker");
                break;
            case 10: System.out.println("Position: Playmaker");

            case 11: System.out.println("Position: Winger");
                break;
            case 5: System.out.println("Position: Defender");

            case 8: System.out.println("Position: Midfielder");

            default:System.out.println("Player position not known");

        }







    }
}
