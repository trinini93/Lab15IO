import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Created by trina2 on 4/24/17.
 */
public class CountriesAppMain {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in); //scnr to get user input

        System.out.println("You have 3 options. To view a list of countries, type in 'A'. To enter a country, type in 'B'. To exit, type in 'C'. ");

        String userInput = scnr.nextLine(); //String for userInput options

        if(userInput.equalsIgnoreCase("A")) {
            System.out.println("Here are the list of countries: ");
            CountriesTextFile.readFromFile("countries.txt"); //getting countries, passing in txt file//then create parameter
        }
        else if (userInput.equalsIgnoreCase("B")) {
            System.out.println("Please enter a country to add to the list: ");
            CountriesTextFile.writeToFile(scnr); //passing in scnr to add country to text

        } else {
            System.out.println("Thank you for visiting! Goodbye. ");
        }

    }
}
