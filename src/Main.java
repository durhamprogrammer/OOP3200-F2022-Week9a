import java.util.Scanner;

public class Main {

    public static String getConsoleInput(String prompt)
    {
        Scanner console = new Scanner(System.in);
        System.out.print(prompt);

        return console.nextLine();
    }

    public static void displayArray(String[] array)
    {
        for (var element: array)
        {
            System.out.println(element);
        }
    }


    public static void main(String[] args)
    {
        String[] myStrings = new String[Config.NUM_OF_STRINGS]; // new empty container of type String

        for (int i = 0; i < Config.NUM_OF_STRINGS; i++)
        {
            myStrings[i] = getConsoleInput("Please enter your name: ");
        }

        displayArray(myStrings);
    }
}