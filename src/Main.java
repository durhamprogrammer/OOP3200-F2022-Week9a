import java.util.Scanner;

public class Main {

    /**
     * This is a generic Console Input Function that gets input from the keyboard
     * and saves the data to an element of an array.
     *
     * @param prompt {String}
     * @param object {T[]}
     * @return
     * @param <T>
     */
    public static <T> T getConsoleInputToArray(String prompt, T[] object)
    {
        Scanner console = new Scanner(System.in);
        System.out.print(prompt);

        switch (object.getClass().getSimpleName())
        {
            case "Double[]":
                return (T) ((Double)console.nextDouble());
            case "Integer[]":
                return (T) ((Integer)console.nextInt());
            case "Float[]":
                return (T) ((Float)console.nextFloat());
            default:
                return (T) console.nextLine();
        }
    }

    /**
     * This Method displays all the elements of an Array
     * @param array
     * @param <T>
     */
    public static <T> void displayArray(T[] array)
    {
        for (var element: array)
        {
            System.out.println(element);
        }
    }


    public static void main(String[] args)
    {
        String[] myStrings = new String[Config.NUM_OF_STRINGS]; // new empty container of type String
        Integer[] myInts = new Integer[Config.NUM_OF_INTEGERS];


        for (int i = 0; i < Config.NUM_OF_STRINGS; i++)
        {
            myStrings[i] = getConsoleInputToArray("Please enter your name: ", myStrings);
        }

        displayArray(myStrings);

        for (int i = 0; i < Config.NUM_OF_INTEGERS; i++)
        {
            myInts[i] = getConsoleInputToArray("Please enter your number: ", myInts);
        }

        displayArray(myInts);


    }
}