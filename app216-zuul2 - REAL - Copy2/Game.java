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
    static CommandReader reader;
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

    //For the Random Encounters
    //Random Encounters, sniper fire, enemies etc.
    public static String[] encounters = {"Battle", "Battle", "Battle", "Rest", "Rest"};

    //ENemy names
    public static String[] enemies = {"Rebel", "Insurgent", "Commander", "Warlord"};

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
    //for integer input bit
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
    public static void anythingToContinue(){
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

    public static void characterInfo(){
        clearConsole();
        printHeading(" CHARACTER INFORMATION ");
        System.out.println(player.name + "\tHP: " + player.hp + "/" + player.maxHp);
        printSeperator(20);
        System.out.println("XP: " + player.xp);
        printSeperator(20);
        System.out.println("Items");
        printSeperator(20);
        System.out.println("Rations: " + player.pots);
        System.out.println("Flare: " +player.flare);

        anythingToContinue();
    }

    // this is for FLARE squeunce

    public static void useFlare(){
        clearConsole();
        if(player.flare >= 1){
            printHeading("You've got your hands on a signal flare");
            System.out.println("Careful, it has a lock on it rigged to an explosive,");
            System.out.println("seems like they've tried to improvise some sort of trap");
            System.out.println("Do you want to try unlock it now?");
            System.out.println("(1) Yes \n(2) No, not now.");
            int input = readInt("-> ", 2);
            if(input == 1)
            {
                clearConsole();
                printHeading("You launched the flare up in the sky");
                System.out.println("");
                System.out.println("  .        . ");
                System.out.println("+  :       .");
                System.out.println("           :       _");
                System.out.println("       .   !   '  (_)");
                System.out.println("          ,|.' ");
                System.out.println("-  -- ---(-O-`--- --  -");
                System.out.println("         ,`|'`.");
                System.out.println("       ,   !    .");
                System.out.println("           :       :   ");
                System.out.println("           .     --+--");
                System.out.println(" .:        .       !");
                anythingToContinue();
                
                clearConsole();
                System.out.println("---------------+---------------");
                System.out.println("          ___ /^^[___              _");
                System.out.println("        /|^+----+   |#___________//");
                System.out.println("      ( -+ |____|    ______-----+/");
                System.out.println("       ==_________--            / ");
                System.out.println("         ~_|___|__");
                System.out.println("             |            ");
                System.out.println("             |            ");
                System.out.println("            |            ");
                System.out.println("             |            ");
                System.out.println("              |            ");
                System.out.println("             *           ");
                System.out.println("");
                System.out.println("A friendly chopper approaches above you,");
                System.out.println(" Congratuliations, now get out of here before you");
                System.out.println(" shot down again.");

                printSeperator(30);
                System.out.println(player.name + "s stats");
                printSeperator(30);
                System.out.println("Final XP: " + player.xp );

            }
        }
    }

    // PLAYER DIED SEQUENCE

    public static void playerDied()
    {
        clearConsole();
        printHeading("The clutches of death have grabbed you. You've died");
        printHeading("You gathered " + player.xp + " XP and a coffin :)");
        System.out.println("Thank you for playing");

    }

    // BATTLE SEUQUENCE
    public static void battle(Enemy enemy){
        while(true){
            clearConsole();
            printHeading(enemy.name + "\nHP: " + enemy.hp + "/" + enemy.maxHp);
            printHeading(player.name + "\nHP: " + player.hp + "/ " + player.maxHp);
            System.out.println("What would you like to do?");
            printSeperator(20);
            System.out.println("(1) Fight\n(2) Eat Rations\n(3) Retreat");
            int input = readInt("->", 3);

            if(input == 1)
            {
                int dmg = player.attack() - enemy.defend();
                int dmgTook = enemy.attack() - player.defend();

                //because math.random makes some funny numbers, if below 0 set to 0
                if(dmg < 0)
                {
                    dmg = 0;
                }
                // Deal damage to both players
                player.hp -= dmgTook;
                enemy.hp -= dmg;

                clearConsole();
                printHeading("Battle");
                System.out.println("You shot the " + enemy.name + "and dealt " + dmg + "damage!");
                printSeperator(15);
                System.out.println(enemy.name + " fired back and dealt " + dmgTook + " to you");
                anythingToContinue();

                if(player.hp <= 0)
                {
                    playerDied();
                    break;
                }
                else if(enemy.hp <= 0)
                {
                    clearConsole();
                    printHeading("You took the " + enemy.name + " out of his misery.");
                    player.xp += enemy.xp; // add enemy xp onto player xp
                    System.out.println("You got " + enemy.xp + " xp out of it.");
                    // item drops
                    boolean addRest = (Math.random()*5 + 1 <= 2.25);
                    if(addRest)
                    {
                        System.out.println("You managed to get a hold of a flare!");
                        // Add flare method
                        player.addFlare();
                    }
                    break;
                }
            }
            else if(input == 2)
            {
                //zarrar code this, ration part
                clearConsole();
                if(player.pots > 0 && player.hp < player.maxHp)
                {
                    player.hp = player.maxHp;
                    clearConsole();
                    printHeading(" You snacked on some rations and now have " + player.maxHp + " health");
                }
                else
                {
                    printHeading("No rations left, or you don't need to eat any");
                }
            }

            else
            {
                clearConsole();
                // Currently 35%, toggle if ya want
                if(Math.random()*10 + 1 <= 3.5)
                {
                    printHeading("You managed to escape from the " + enemy.name);
                    anythingToContinue();
                    break;
                }
                else
                {
                    printHeading("Escaping isn't always an option");
                    int dmgTook = enemy.attack();
                    System.out.println("You've been shot amidst your retreet and took " + dmgTook + "damage");
                    anythingToContinue();
                    if(player.hp <0)
                        playerDied();
                }
            }
        }
    }

    // FOR RANDOM BATTLE ENCOUNTERS
    //THIS AREA IS FOR THE RANDOM BATTLE SEQUENCE

    public static void randomBattle(){
        clearConsole();
        printHeading("You've been spotted by an enemy, engage in combat!");
        anythingToContinue();

        battle(new Enemy(enemies[(int)(Math.random()*enemies.length)], player.xp));
    }
    
  
}
