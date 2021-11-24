
/**
 * Write a description of class Program here.
 *
 * @author (ZARRAR AFZAL)
 * @version (VERSION 1 OF MANY)
 */

/**
 * the class blow contains main method and is activated first,
 * it creates a new StockApp and makes the app run.
 */
public class Program
{
    private static StockApp app;
    
    public static void main(String[] args)
    {
        app = new StockApp();
        app.run();
    }
}
