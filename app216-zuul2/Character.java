
/* this is the character class
 * ---- btw sent dont touch this, make 
 * player class instead
 */


public abstract class Character{
    
    // Values all the characters n stuff have
    public String name;
    public int maxHp, hp, xp;
    
    //character
    public Character(String name, int maxHp, int xp)
    {
        this.name = name;
        this.maxHp = maxHp;
        this.xp = xp;
        this.hp = maxHp;
    }
        
    
    // methods for attack/defend
    public abstract int attack();
    public abstract int defend();

}