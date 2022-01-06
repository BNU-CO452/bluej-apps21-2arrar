
import java.util.Scanner;

public class GameLogic {
    static Scanner scanner = new Scanner(System.in);

    static Player player;

    public static boolean isRunning;
    
    //Random Encounters, sniper fire, enemies etc.
    public static String[] encounters = {"Battle", "Battle", "Battle", "Rest", "Rest"};
    
    //ENemy names
    public static String[] enemies = {"Rebel", "Insurgent", "Commander", "Warlord"};
    
    //Story Elements
    public static int place = 0, act = 1;
    public static String[] places = {"Crash site", "Market", "Lake", "Outpost", "Camp Site", "Ruins", "Ambushed City", "Endless Road"};

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
        printSeperator(30);
        System.out.println("FaLLen AnGeL");
        System.out.println("    It was over before it even started.    ");
        System.out.println("  created by Zarrar and his beloved SENTINEL ");
        System.out.println("       if any error its zarrars fault       ");
        printSeperator(30);
        printSeperator(30);
        anythingToContinue();
        
        // this is to start the backstory
        Story.printIntro();
        
        
        /*
         * this is to get the name
         */

        clearConsole();
        printHeading("Pilot, what is your callsign?");
        name = scanner.next();

        // create player object
        player = new Player(name);
        // this to print scenario -- scenario not location
        Story.printScenario();

        isRunning = true;

        gameLoop();

    }
    // CHANGE TO HEALTH, THIS IS WRONG
    public static void checkLevel(){
        if(player.xp >= 10 && act ==1){
            
        }
        else if(player.xp >= 50 && act == 2){
        }
        else if (player.xp >=100 && act == 3){
        }
        
    }
    
    // Random encounter code, if no work remove and delete
    public static void randomEncounter(){
        int encounter = (int) (Math.random()* encounters.length);
        
        if(encounters[encounter].equals("Battle"))
        {
            //random battle thing
        }
        else if(encounters[encounter].equals("Rest"))
        {
            //rest sequence
        }
        
        
    }
    public static void continueJourney(){
        checkLevel();
        if(act != 1)
            randomEncounter();
        
        
    }
    
    public static void characterInfo(){
        clearConsole();
        printHeading(" CHARACTER INFORMATION ");
        System.out.println(player.name + "\tHP: " + player.hp + "/" + player.maxHp);
        printSeperator(20);
        System.out.println("XP: " + player.xp);
        
        anythingToContinue();
    }
    
    public static void printMenu(){
        clearConsole();
        printHeading(places[place]);
        System.out.println("Choose an action:");
        printSeperator(20); // toggle, in eclipse its fine, idk bout bluej
        System.out.println("(1) Continue on your journey");
        System.out.println("(2) Character information");
        System.out.println("(3) Exit game");
    }
    
    public static void gameLoop(){
        while(isRunning){
            printMenu();
            int input = readInt("-> ", 3);
            if(input == 1)
                continueJourney();
            else if(input == 2)
                characterInfo();
            else isRunning = false;
        }
    }
}