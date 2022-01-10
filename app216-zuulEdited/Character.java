/*
 * This is the Player class used to set player info
 */

public abstract class Character 
{
    // What all player will have
    public String name;
    public int maxHp, hp, xp;
    
    public Character(String name, int maxHp, int xp)
    {
        // Character constructor
        this.name = name;
        this.maxHp = maxHp;
        this.xp = xp;
        this.hp = maxHp;
    }
    
    // attack and defend methods
    public abstract int attack();
    public abstract int defend();
    
    
}
    