
public class Player extends Character{
    
    // int to track number of upgrade
    public int numAtkUpgrades, numDefUpgrades;
    
    
    // Skill Names V is the prefix V
    public String[] atkUpgrades = ("Strength", "Power", "Might", "Godlike Strength");
    public String[] defUpgrades = ("Heavy Bones", "Stoneskin" , "Scale Armor", "Holy Aura");
    
    
    //Player constructor
    public Player(String name) 
    {
        // this super refers to character
        super(name, 100, 0);
        // automatic make all upgrades set to 0 when start
        this.numAtkUpgrades = 0;
        this.numDefUpgrades = 0;
        
        // for player to choose trait
        chooseTrait();
    }
    
    // attack/defend methods will always run first
    @Override
    public int attack() {
        return 0;
    }
    
    @Override
    public int defend() {
        return 0;
    }
    
    // choose trait
    public void chooseTrait(){
        printHeading("Choose a trait:");
        System.out.println(atkUpgrades[numAtkUpgrades]);
        System.out.println(defUpggrades[numDefUpgrades]);
         
        if
        
        
}