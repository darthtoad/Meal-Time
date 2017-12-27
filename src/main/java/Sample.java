/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample {
    public static void main(String[] args) {
        System.out.println("What is your favorite color?");

        try{
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String inputString = bufferedReader.readLine();

            System.out.println("Your favorite color is " + inputString + "? Me too!");
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Sample {

    public static void askWhatYouAteFor(String meal) {

        try {

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("What did you eat for " + meal + "?");
            String yourMeal = bufferedReader.readLine();
            System.out.println("You had " + yourMeal + " for " + meal + ".");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        askWhatYouAteFor("breakfast");
        askWhatYouAteFor("lunch");
        askWhatYouAteFor("dinner");
    }
}