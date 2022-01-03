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

    // This is for your upgrade skills n stuff
    // i cant see ur docx. so i put random 
    public String[] atkUpgrades = {"Strength", "Power", "Might", "Godlike Strength"};
    public String[] defUpgrades = {"Heavy Bones", "Stoneskin", "Scale Armour", "Holy Aura"};

    
    // Consttrrrructorrrr for the Player
    public Player(String name) {
        //callllling constructorrrr of the sssuuuuuuuuuuuuuuiiiiiii-per class
        super(name, 100, 0);
        // TODO Auto-generated constructor stub

        //To set all upgrades to 0, zar you can do this one
        this.numAtkUpgrades = 0;
        this.numDefUpgrades = 0;

        //Choose traits
        chooseTrait(); // its at the botom

    }

    // Method for attack/defend, #override will always remain no matter

    @Override
    public int attack() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int defend() {
        // TODO Auto-generated mthod stub
        return 0;
    }

    // Choose trait
    public void chooseTrait(){
        GameLogic.clearConsole();
        GameLogic.printHeading("Choose a trait");
        System.out.println("(1) " + atkUpgrades[numAtkUpgrades]);
        System.out.println("(2) " + defUpgrades[numDefUpgrades]);
        //get input
        int input = GameLogic.readInt("-> ", 2);
        GameLogic.clearConsole();

        if (input == 1){
            GameLogic.printHeading("You selected " + atkUpgrades[numAtkUpgrades]);
            numAtkUpgrades++;
            System.out.println("Quite the masochist.");
        }
        else{
            GameLogic.printHeading("You selected " + defUpgrades[numDefUpgrades]);
            numDefUpgrades++;
            System.out.println("Quite the pacifist.");
        }
        GameLogic.anythingToContinue();
    }
        
}