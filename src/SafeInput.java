// SafeInput.java

import java.util.Scanner;

public class SafeInput {

    // method that inputs an integer within the given and range and returns it
    public static int getRangedInt(Scanner console, String prompt, int low, int high)
    {
        int value;
// input of integer
        System.out.print(prompt);
        value = console.nextInt();

// validate value to be within [low,high]
// re-prompt until valid
        while(value < low || value > high)
        {
            System.out.println("Invalid input. Input should be between "+low+" and "+high+" (inclusive)");
            System.out.print(prompt);
            value = console.nextInt();
        }
        console.nextLine();
        return value; // return the value

    }

    // method to prompt the user for a string and return it
    public static boolean getYNConfirm(Scanner console, String prompt)
    {
        String confirm;
// input of string
        System.out.print(prompt);
        confirm = console.nextLine();

// validate that the string is either "y" or "n"
// re-prompt until valid
        while(!confirm.equalsIgnoreCase("Y") && !confirm.equalsIgnoreCase("N"))
        {
            System.out.println("Invalid input. Input should be either Y or N");
            System.out.print(prompt);
            confirm = console.nextLine();
        }

// if "y" return true else false
        if(confirm.equalsIgnoreCase("y"))
            return true;
        return false;
    }

}
