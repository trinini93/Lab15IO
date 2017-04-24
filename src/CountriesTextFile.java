import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Created by trina2 on 4/24/17.
 */
public class CountriesTextFile {

    public static void readFromFile(String s) {
        Path filePath = Paths.get(s);
        File textFile = filePath.toFile();
        try {
            FileReader r = new FileReader(textFile);
            BufferedReader reader = new BufferedReader(r);
            try {
                String line = reader.readLine();

                while (line != null) {
                    System.out.println(line);
                    line = reader.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void writeToFile(Scanner s) {
        //System.out.println("Please enter a country to add to the list. "); //commenting out so this doesn't print twice
        String countryName = s.nextLine();
        Country country = new Country(countryName);
        Path countriesPath = Paths.get("countries.txt");
        File testFiles = countriesPath.toFile();

        try {
            PrintWriter out = new PrintWriter(new FileOutputStream(testFiles, true));
            out.println(country);
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
