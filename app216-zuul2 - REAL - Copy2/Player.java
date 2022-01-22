
import java.util.ArrayList;
/*
 * This is the Player Class which will grab from Character
 * 
 * zarrar if i dare see you touch this class apart from constructor
 * im gunna block you
 */


public class Player extends Character{

    // for the upgrades to work, i made them store numbers instead of doing it by name
    // dont cry about it, it works
    public int numAtkUpgrades, numDefUpgrades; // so 1= strength, 2= power etc.
    
    int pots, flare;
    // this is for the inventory
    public ArrayList<Item> inventory;

    // This is for your upgrade skills n stuff
    // i cant see ur docx. so i put random 
    public String[] atkUpgrades = {"Strength", "Power", "Might", "Godlike Strength"};
    public String[] defUpgrades = {"Heavy Bones", "Stoneskin", "Scale Armour", "Holy Aura"};

    
    // Consttrrrructorrrr for the Player
    public Player(String name) {
        //callllling constructorrrr of the sssuuuuuuuuuuuuuuiiiiiii-per class
        super(name, 5, 0);
        // TODO Auto-generated constructor stub

        //To set all upgrades to 0, zar you can do this one
        this.numAtkUpgrades = 0;
        this.numDefUpgrades = 0;
        
        this.pots = 1;
        this.flare = 0;

        //Choose traits
        chooseTrait(); // its at the botom

    }

    // Method for attack/defend, #override will always remain no matter

    @Override
    public int attack() {
        // TODO Auto-generated method stub
        // Random number * xp/4 + atkupgradeno. + 3 + xp/10 + atkupgradeno. * 2 + def + 1
        // g this is way too complicated, return after and cahnge this.
        return (int) (Math.random()*(xp/4 + numAtkUpgrades*3 + 3) + xp/10 + numAtkUpgrades*2 + numDefUpgrades +1);
    }

    @Override
    public int defend() {
        // TODO Auto-generated mthod stub
        return (int) (Math.random()*(xp/4 + numDefUpgrades*3 + 3) + xp/10 + numDefUpgrades*2 + numAtkUpgrades +1);
    }

    // Choose trait
    public void chooseTrait(){
        Game.clearConsole();
        Game.printHeading("Choose a trait");
        System.out.println("(1) " + atkUpgrades[numAtkUpgrades]);
        System.out.println("(2) " + defUpgrades[numDefUpgrades]);
        //get input
        int input = Game.readInt("-> ", 2);
        Game.clearConsole();

        if (input == 1){
            Game.printHeading("You selected " + atkUpgrades[numAtkUpgrades]);
            numAtkUpgrades++;
            System.out.println("Quite the masochist.");
        }
        else{
            Game.printHeading("You selected " + defUpgrades[numDefUpgrades]);
            numDefUpgrades++;
            System.out.println("Quite the pacifist.");
        }
        Game.anythingToContinue();
    }
    
    public static void printStats()
    {
        Game.printSeperator(30);
        System.out.println("CHARACTER INFORMATION");
        Game.printSeperator(30);
    }
    
    //add flares
    public void addFlare()
    {
        flare = flare + 1;
    }
    
    public void addInventory(Item item){
        inventory.add(item);
    }
    
    public void decreaseRation()
    {
        pots = pots - 1;
    }
    
    public void printInventory(){
        Game.printHeading("INVENTORY");
        
        for (Item item : inventory){
            System.out.println(item.getName());
        }
        
    }
}
