/*
 * This is for the weapon : Weapon
 *                          Damage
 *                          
 */
public class Weapon {
    private String name;
    private int damage;
    // Constructer to attach
    public Weapon(int id, String name)
    {
        this.name = name;
        this.damage = damage;
    }
    
    /**
     * @return The weapon's name.
     */
    public String getName()
    {
        return name;
    }

    public String toString()
    {
       return " You are holding " + name ;
    }
    
    public void print()
    {
        System.out.println(toString());
    }
}
