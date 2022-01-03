
import java.util.Scanner;

public class GameLogic {
    static Scanner scanner = new Scanner(System.in);

    static Player player;
    // method to get input 
    public static int readInt(String prompt, int userChoices){
        int input;

        do{
            System.out.println(prompt);
            try{
                input = Integer.parseInt(scanner.next());
            }catch(Exception e){
                input = -1;
                System.out.println("Please enter a valid number");
            }
        }while(input < 1 || input > userChoices);
        return input;
    }

    //method to clear the text window

    public static void clearConsole()
    {
        for(int i = 0; i < 100; i++)
            System.out.println();
    }

    //method to print text seperator with n lenth
    public static void printSeperator(int n )
    {
        for(int i = 0; i < n; i++)
            System.out.print("-");
        System.out.println();
    }
    //printing heading
    public static void printHeading(String title){
        printSeperator(30);
        System.out.println(title);
        printSeperator(30);

    }

    //method to stop the game til input is given
    public static void anythingToContinue(){
        System.out.println("\nEnter anything to proceed");
        scanner.next();
    }

    public static void startGame(){
        boolean nameSet;
        String name;
        clearConsole();
        printSeperator(30);
        printSeperator(40);
        System.out.println("FaLLen AnGeL");
        System.out.println("    It was over before it even started.    ");
        System.out.println("  created by Zarrar and his beloved SENTINEL ");
        System.out.println("       if any error its zarrars fault       ");
        printSeperator(40);
        printSeperator(30);
        anythingToContinue();

        /*
         * this is to get the name
         */
        
            clearConsole();
            printHeading("Pilot, what is your callsign?");
            name = scanner.next();

            clearConsole();
            printHeading("Callsign " + name + ".\nDo you copy?");
            System.out.println("(1) I copy!");
            System.out.println("(2) Negative!");

            int input = readInt("-> ", 2);
            if(input == 1)
                nameSet = true;
        

        // create player object
        player = new Player(name);
    }
}