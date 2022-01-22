
/**
 * This class is reponsible for creating and
 * linking all the Locations in the game to
 * form a 2D or 3D network
 *              [road]
 *                 |
 *              [ruins]<----->[city]
 *                 |             |
 *  [camp]<---->[market]<---->[outpost]
 *                 |
 *              [crash]<---->[lake]
 *             
 * @author ZARRAR AFZAL
 * @version ONE OF MANY
 */
public class Map
{
    // Need to add a list of exits

    private Location crash, lake, market, outpost, camp, ruins, city, road;

    private Location currentLocation;

    public Item battle_rifle1, battle_rifle2, battle_rifle3, pistol, ration,
    map, ammunition;
    /**
     * Constructor for objects of class Map
     */
    public Map()
    {
        createLocations();
    }

    /**
     * Create all the Locations and link their exits together.
     * Set the current location to the outside.
     * Both locations need to have been created before
     * their exists are linked.
     */
    private void createLocations()
    {
        createCrash();
        createLake();
        createMarket();
        createCamp();
        createOutpost();
        createRuins();
        createCity();
        createRoad();

        currentLocation = crash;  // start game outside
    }

    /**
     * Create the crash and link it to the
     * and others
     */
    public void createCrash()
    {
        crash = new Location("at the crash site"  + System.lineSeparator() + " Remnants of your helicopter are blackened by the blast"  + System.lineSeparator() + " and sunked into the yellow sand."  + System.lineSeparator() + " The flickers of fire is the only noise that can be heard."); 

        crash.setExit("north", market);

        crash.setExit("east", lake);
        //Items
        battle_rifle1 = new Item("AK-74", "5.45x39mm Russian Made.", 1);
        crash.addItem(battle_rifle1);

        ration = new Item("Rations", "Dehydrated globs of some what consumeable minerals", 1);
        crash.addItem(ration);

        map = new Item("Map", "To get your way around", 1);
        crash.addItem(map);

    }

    /**
     * Create the Market and link it to the crash
     */
    private void createMarket()
    {
        market = new Location("in the local market" + System.lineSeparator() + "A clutter of stalls and people walk, talk and watch. " + System.lineSeparator() + "Long cuts of cloth dance in the breeze as shopkeepers "  + System.lineSeparator() + " exclaim their products and prices "   + System.lineSeparator() + " The air is filled with foreign voices. ");

        market.setExit("south", crash);
        crash.setExit("north", market);

        market.setExit("east", outpost);

        market.setExit("west", camp);

        market.setExit("north", ruins);
        //Items
        ration = new Item("Rations", "Dehydrated globs of some what consumeable minerals", 1);
        market.addItem(ration);

    }

    /**
     * Create the Lake linked to the crash
     */
    private void createLake()
    {
        lake = new Location("in mountain's lake"  + System.lineSeparator() + " A body of water is present before you "  + System.lineSeparator() + " Scattered around are shells and drift wood "  + System.lineSeparator() + " The sun's glow bounces of the shoreline as  "  + System.lineSeparator() + " the cold winds of water gently breeze past.");

        lake.setExit("west", crash);
        crash.setExit("east", lake);

        lake.setExit("north", outpost);

    }

    /**
     * Create the office link
     */
    private void createCamp()
    {
        camp = new Location("in the rebel camp-site"  + System.lineSeparator() + " Tents and make-shift selters are everywhere. "  + System.lineSeparator() + " Groups of people can be seen spread among the area "  + System.lineSeparator() + " You feel a sense of uneasiness being here. "); 

        camp.setExit("east", market);
        market.setExit("west", camp);

    }

    /**
     * Create the outpost and link it
     */
    private void createOutpost()
    {
        // create the Locations
        outpost = new Location("in a military outpost"  + System.lineSeparator() + " Tall re-inforced walls stare down at you "  + System.lineSeparator() + " Barbed wire tangle themselves along the peaks of them. "   + System.lineSeparator() + " Subtle tones of voices can be heard from the large tents."); 

        outpost.setExit("north", city);

        outpost.setExit("west", market);
        market.setExit("east", outpost);

        outpost.setExit("south", lake);
        lake.setExit("north", outpost);

        pistol = new Item("TT-30 Pistol ", "Classic .30 caliber pistol", 1);
        outpost.addItem(pistol);

        battle_rifle2 = new Item("AK-47-S", "7.62x39mm. Packs a real punch", 1);
        outpost.addItem(battle_rifle2);

    }

    /**
     * Creat the City and Link it
     */
    private void createCity()
    {
        city = new Location("in the city"   + System.lineSeparator() + " Destroyed walls and ruined buildings stand lonely. "   + System.lineSeparator() + " There is not a single person in sight, apart from "    + System.lineSeparator() + " the placement of several bodies. "    + System.lineSeparator() + " Torched cars and flamining remains are the only "   + System.lineSeparator() + "signs of warmth.");  

        city.setExit("west", ruins); 
        ruins.setExit("east", city);

        city.setExit("south", outpost);
        outpost.setExit("north", city);

        battle_rifle2 = new Item("AK-47-S", "7.62x39mm. Packs a real punch", 1);
        outpost.addItem(battle_rifle2);

        battle_rifle3 = new Item("M16A1", "5.56. US Made. Strange....", 1);
        outpost.addItem(battle_rifle3);

    }

    /**
     * Create the Ruins and link
     * 
     */
    private void createRuins()
    {
        ruins = new Location("in a ruins"    + System.lineSeparator() + " Standing columns remain shattered and in pieces "   + System.lineSeparator() + " What seemed to be a artifact, now a mear collection "   + System.lineSeparator() + " of rubble and debris. ");  

        ruins.setExit("north", road);

        ruins.setExit("east", city);

        ruins.setExit("south", market);
        market.setExit("north", ruins);
    }

    private void createRoad()
    {
        road = new Location("at the long road"  + System.lineSeparator() + " Tarnished tarmac lays beneath your feet "  + System.lineSeparator() + " and extends into the hazy distance. "  + System.lineSeparator() + " Checkpoints can be seen among the horizon but "  + System.lineSeparator() + "they dont look friendly." ); 

        road.setExit("south", ruins);
        ruins.setExit("north", road);
    }

    public Location getCurrentLocation()
    {
        return currentLocation;
    }

    public void enterLocation(Location nextLocation)
    {
        currentLocation = nextLocation;
    }

    // to print desccription
    public void areaDesc()
    {
        if(currentLocation == null)
        {
            System.out.println("ummmm... type quit. you broke the game.");
        }
        else if(currentLocation == crash)
        {
            Story.printCrash();
        }
    }
}
