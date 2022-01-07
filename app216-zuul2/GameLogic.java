
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
        System.out.println("                FaLLen AnGeL               ");
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
        printSeperator(20);
        System.out.println("Items");
        printSeperator(20);
        System.out.println("Rations: " + player.pots);
        System.out.println("Flare: " +player.flare);

        anythingToContinue();
    }
    
    /*
     * this is for random death
     */
    public static void sniper(){
        clearConsole();
        printHeading("You see a blinding glint flash along the horizon. \n You squint your eyes to try make out what it is.");
        
    }
    
    /*
     * this is for FLARE squeunce
     */
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
    
    /*
     * THIS AREA IS FOR THE RANDOM BATTLE SEQUENCE
     */
    public static void randomBattle(){
        clearConsole();
        printHeading("You've been spotted by an enemy, engage in combat!");
        anythingToContinue();

        battle(new Enemy(enemies[(int)(Math.random()*enemies.length)], player.xp));
    }

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
                    System.out.println("You got " + enemy.xp + " out of it.");
                    // item drops
                    boolean addRest = (Math.random()*5 + 1 <= 2.25);
                    if(addRest)
                    {
                        System.out.println("You managed to get a hold of a flare!");
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
                    System.out.println("You've been shot amidst your retreet and took 0 " + dmgTook + "damage");
                    anythingToContinue();
                    if(player.hp <0)
                        playerDied();
                }
            }
        }
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

    /*
     * PLAYER DIED SEQUENCE
     */

    public static void playerDied()
    {
        clearConsole();
        printHeading("The clutches of death have grabbed you. You've died");
        printHeading("You gathered " + player.xp + " XP and a coffin :)");
        System.out.println("Thank you for playing");

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
