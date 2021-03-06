
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
    private void createCrash()
    {
        crash = new Location("at the crash site");
        
        crash.setExit("north", market);
        
        
        crash.setExit("east", lake);
        
        
    }
    
    /**
     * Create the Market and link it to the crash
     */
    private void createMarket()
    {
        market = new Location("in the local market");
        
        market.setExit("south", crash);
        crash.setExit("north", market);
        
        
        market.setExit("east", outpost);

        
        market.setExit("west", camp);

        
        market.setExit("north", ruins);

    }
    
    /**
     * Create the Lake linked to the crash
     */
    private void createLake()
    {
        lake = new Location("in mountain's lake");
        
        lake.setExit("west", crash);
        crash.setExit("east", lake);
        
        lake.setExit("north", outpost);

    }
    
    /**
     * Create the office link
     */
    private void createCamp()
    {
        camp = new Location("in the rebel camp-site");
        
        camp.setExit("east", market);
        market.setExit("west", camp);
        
    }
    
    /**
     * Create the outpost and link it
     */
    private void createOutpost()
    {
        // create the Locations
        outpost = new Location("in a military outpost");
        
        outpost.setExit("north", city);

        
        outpost.setExit("west", market);
        market.setExit("east", outpost);
        
        outpost.setExit("south", lake);
        lake.setExit("north", outpost);
    }
    
    /**
     * Creat the City and Link it
     */
    private void createCity()
    {
        city = new Location("in the city");
        
        city.setExit("west", ruins);
        ruins.setExit("east", city);
        
        city.setExit("south", outpost);
        outpost.setExit("north", city);
        
    }
    /**
     * Create the Ruins and link
     * 
     */
    private void createRuins()
    {
      ruins = new Location("in a ruins");
      
      ruins.setExit("north", road);

      
      ruins.setExit("east", city);

      
      ruins.setExit("south", market);
      market.setExit("north", ruins);
    }
    
    private void createRoad()
    {
        road = new Location("at the long road");
        
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
}
