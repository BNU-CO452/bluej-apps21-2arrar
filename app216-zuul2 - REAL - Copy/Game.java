/**
 *  This class is the main class of the "World of Zuul" application. 
 *  "World of Zuul" is a very simple, text based adventure game.  Users 
 *  can walk around some scenery. That's all. It should really be extended 
 *  to make it more interesting!
 * 
 *  To play this game, create an instance of this class and call the "play"
 *  method.
 * 
 *  This main class creates and initialises all the others: it creates all
 *  locations, creates the CommandReader and starts the game.  
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2016.02.29
 * 
 * Modified and extended by Student Name
 */

import java.util.Scanner;

public class Game 
{
    public final Map MAP;
    private CommandReader reader;
    private boolean gameOver;
    static Player player;
    
    static Scanner scanner = new Scanner(System.in);
        
    /**
     * Create the game and initialise its internal map.
     */
    public Game() 
    {
        MAP = new Map();
        reader = new CommandReader(this);
    }

    /**
     *  Main play routine.  Loops until end of play.
     */
    public void play() 
    {            
        startGame();
        gameOver = false;

        // Enter the main command loop.  Here we repeatedly 
        // read commands and execute them until the game is over.
                
        while (! gameOver) 
        {
            gameOver = reader.getCommand();
        }
        
        System.out.println("Thank you for playing.  Good bye.");
    }

    /**
     * Print out the opening message for the player.
     */
    private void printWelcome()
    {
        System.out.println();
        System.out.println(" Welcome to the World of Zuul!");
        System.out.println(" World of Zuul is a new, incredibly boring adventure game.");
        System.out.println(" Type 'help' if you need help.");
        System.out.println();
        System.out.println(MAP.getCurrentLocation().getLongDescription());
    }
    
    // CODE BEGINS HERE DELETE IF NO WORKY
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
    public void anythingToContinue(){
        System.out.println("\nEnter anything to proceed");
        reader.getCommand();
    }
    
    public void startGame(){
        boolean nameSet;
        String name;
        clearConsole();
        printSeperator(30);
        printSeperator(30);
        System.out.println("                FaLLen AnGeL               ");
        System.out.println("    It was over before it even started.    ");
        System.out.println("  created by Zarrar and his beloved SENTINEL ");
        System.out.println("       if any error its zarrars fault       ");
        printSeperator(30);
        printSeperator(30);
        anythingToContinue();
        
         // this is to start the backstory
        Story.printIntro();
        
         clearConsole();
        printHeading("Pilot, what is your callsign?");
        name = scanner.next();

        // create player object
        player = new Player(name);
        // this to print scenario -- scenario not location
        Story.printScenario();
        
    }
    
}
