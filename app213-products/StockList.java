import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author ZARRAR AFZAL 
 * @version 1 OF MANY
 */
public class StockList
{
    // A list of the products.
    private ArrayList<Product> stock;

    /**
     * Initialise the stock manager.
     */
    public StockList()
    {
        stock = new ArrayList<Product>();
    }

    /**
     * Add a product to the list.
     * @param item The product item to be added.
     */
    public void add(Product item)
    {
        stock.add(item);
    }
    
    /**
     * Remove a product from the list the list.
     * @param item The product item to be added.
     */
    public void remove(int productID)
    {
        Product product = findProduct(productID);
        if(product !=null)
        {
            System.out.println(product+ "has been removed successfully");
            stock.remove(product);
        }
        else System.out.println("That ID doesnt exist");
        
    }
    
    /**
     * A method to buy a single quantity of the product
     */
    public void buyProduct(int productID)
    {
        buyProduct(productID, 1);
    }
    
    
    /**
     * Buy a quantity of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void buyProduct(int productID, int amount)
    {
        Product product = findProduct(productID);
        
        if(product != null) 
        {
            if(product.getQuantity() < 1000)
            {
                product.increaseQuantity(amount);
                // printout message
                System.out.println("You have purchasedd " + amount + " of " + product.getName());
            }
            else
            {
                // printout message
                System.out.println("Not enough space, capacity reached " + product.getName());
            }
        }
        else
        {
            // printout message
            System.out.println("Unfortunately, this item is not sold here.");
        }
    }
    
    /**
     * Find a product to match the product id,
     * if not found return null
     */
    public Product findProduct(int productID)
    {
        for(Product product : stock)
        {
            if(product.getID() == productID)
            {
                return product;
            }
        }
        return null;
    }
    
    /**
     * A method to sell a single quantity of the product
     */
    public void sellProduct(int productID)
    {
        sellProduct(productID, 1);
    }
    
    /**
     * Sell one of the given product.
     * Show the before and after status of the product.
     * @param id The ID of the product being sold.
     */
    public void sellProduct(int productID, int amount)
    {
        Product product = findProduct(productID);
        
        if(product != null) 
        {
            if(product.getQuantity() > 0 && product.getQuantity() >= amount)
            {
                product.decreaseQuantity(amount);
                // printout message
                System.out.println("You have successfully sold " + amount + " the " + product.getName());
            }
            else if(product.getQuantity() <= amount)
            {
                System.out.println(product.getName() + " Error, we only have " + product.getQuantity());
            }
            else
            {
                // printout message
                System.out.println(product.getName() + " is unfortunately out of stock");
            }
        }
        else
        {
            // printout message
            System.out.println(" is not available here");
        }
    }  

    
    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public int numberInStock(int productID)
    {
        Product product = findProduct(productID);
        if(product != null)
        {
            return product.getQuantity();
        }
        else return 0;
    }

    /**
     * Print details of the given product. If found,
     * its name and stock quantity will be shown.
     * @param id The ID of the product to look for.
     */
    public void printProduct(int productID)
    {
        Product product = findProduct(productID);
        if(product != null) 
        {
            System.out.println(product.toString());
        }
    }
    
    /**
     * Print out each product in the stock
     * in the order they are in the stock list
     */
    public void print()
    {
        printHeading();
        for(Product product : stock)
        {
            System.out.println(product);
        }
        System.out.println();
    }
    
    public void printHeading()
    {
        System.out.println();
        System.out.println(" TORRENTS R US ");
        System.out.println(" =+=+=+=+=+=+=+=+=+=+=");
        System.out.println();
    }
    
    /**
     * To look for item starting with prefixes
     * -copied code above, but add 'startsWith' addition
     * if no work remove.
     */
    public void lookupProducts(String phrase)
    {
        for(Product product : stock)
        {
            if(product.getName().startsWith(phrase) == true)
            {
                System.out.println(product);
            }
        }
    }
    
    /**
     * To list products which stock level are below set number
     * -copied code above, remove it no work
     */
    public void stockBelow15(String phrase)
    {
        for(Product product : stock)
        {
            if(product.getQuantity() < 15 )
            {
                System.out.println(" Products Below 15 ");
                System.out.println(" ---------------- ");
                System.out.println(product);
            }
        }
    }
}