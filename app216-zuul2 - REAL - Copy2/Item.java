import java.util.HashMap;
/**
 * ITEM CLASS
 */

public class Item
{
    //Varaibles for the item
    public int id;
    public String name;
    public String description;
    
    
    public Item(String name, String description, int id)
    {
        this.id = id;
        this.name = name;
        this.description = description;
    }
    
    // To relay some info of the item
    
    public void getShortDesc()
    {
        System.out.println(name);
    }
    
    // Item name relay
    public String getName()
    {
        return name;
    }
    
    // For the lawwwwng descirption
    public String getLongDes()
    {
        System.out.println(name + " " + description);
        return description;
    }
}