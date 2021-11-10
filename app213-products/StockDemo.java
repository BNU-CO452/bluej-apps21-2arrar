/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author ZARRAR AFZAL
 * @version 1 OF MANY
 */
public class StockDemo
{
    // The stock manager.
    private StockList stock;

    /**
     * Create a StockManager and populate it with at least
     * 10 sample products.
     */
    public StockDemo(StockList stock)
    {
        this.stock = stock;
        
        // Add at least 10 products, they must be unique to you
        // Make sure the ids are sequential numbers
        
        stock.add(new Product(101, "GTA San Andreas"));
        stock.add(new Product(102, "Insurgency(2014)"));
        stock.add(new Product(103, "COD MW2"));
        stock.add(new Product(104, "iw4x"));
        stock.add(new Product(105, "CS 1.6"));
        stock.add(new Product(107, "Minecraft"));
        stock.add(new Product(108, "SQUAD"));
        stock.add(new Product(109, "World War Z"));
        stock.add(new Product(110, "Rise of Nations"));
    }
    
    /**
     * Provide a demonstration of how the ProductList meets all
     * the user requirements by making a delivery of each product 
     * buying it in various amounts and then selling each
     * product by various amounts. Make sure all the requirements
     * have been demonstrated.
     */
    public void runDemo()
    {
        // Show details of all of the products before delivery.
        
        stock.print();

        buyProducts();
        stock.print();        

        sellProducts();
        stock.print();        
    }
    
    private void buyProducts()
    {
        stock.buyProduct(101, 9);
        stock.buyProduct(102, 4);
        stock.buyProduct(103, 5);
        stock.buyProduct(104, 1);
        stock.buyProduct(105, 4);
        stock.buyProduct(106, 9);
        stock.buyProduct(107, 3);
        stock.buyProduct(108, 6);
        stock.buyProduct(109, 2);
        stock.buyProduct(110, 5);
    }
    
    private void sellProducts()
    {
        stock.sellProduct(101, 8);
        stock.sellProduct(102, 2);
        stock.sellProduct(103, 2);
        stock.sellProduct(104, 1);
        stock.sellProduct(105, 2);
        stock.sellProduct(106, 5);
        stock.sellProduct(107, 3);
        stock.sellProduct(108, 3);
        stock.sellProduct(109, 2);
        stock.sellProduct(110, 5);
    }    
}