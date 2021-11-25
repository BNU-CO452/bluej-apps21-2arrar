
/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author ZARRAR AFZAL
 * @version 1 OF MANY
 */
public class StockApp
{
    private InputReader reader;

    private StockList stock;

    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        reader = new InputReader();

        stock = new StockList();
        StockDemo demo = new StockDemo(stock);
    }

    /**
     *  Display a list of menu choices and execute
     *  the user's choice.
     */
    public void run()
    {
        boolean finished = false;

        while(!finished)
        {
            printHeading();
            printMenuChoices();

            String choice = reader.getString("Please enter your choice > ");

            finished = executeChoice(choice.toLowerCase());
        }
    }

    private boolean executeChoice(String choice)
    {
        if(choice.equals("quit"))
        {
            return true;
        }
        else if(choice.equals("print"))
        {
            stock.print();
        }
        else if(choice.equals("add"))
        {
            int id = reader.getInt("enter ID number");
            String name = reader.getString ("please enter the name of new product");
            Product product = new Product(id,name);
            stock.add(product);
            System.out.println("product" +product.getName()+ "with ID"
                +product.getID()+ "has been added successfully");
        }
        else if(choice.equals("remove"))
        {
            int id = reader.getInt("enter ID you'd wish to remove");
            stock.remove(id);
            System.out.println("product with ID" + "has been removed");
        }
        else if(choice.equals("buy"))
        {
            int id = reader.getInt("enter ID you wish to buy");
            int amount = reader.getInt ("Please enter amount you wish to buy (1-10)");
            /*delete if no work code below for 1-10*/
            if(1 <= amount && amount <= 10)
            {
                stock.buyProduct(id,amount);
                System.out.println("Successfully Purchased" +id+" "+amount+ ",thank you");

            }
            else
            {
                System.out.println("Purchase denied, incorrect information");
            }
        }
        else if(choice.equals("sell"))
        {
            int id = reader.getInt("enter ID you wish to sell");
            int amount = reader.getInt ("Please enter amount you wish to sell (1-10)");
            /*delete if no work, code below for 1-10*/
            if(1 <= amount && amount <= 10)
            {
                stock.sellProduct(id,amount);
                System.out.println("Successfully Sold" +id+ " "+amount+ ",thank you");
            }
        }
        else if(choice.equals("search"))
        {
            String phrase = reader.getString("Pleas enter name of Product you wish to search for");
            stock.lookupProducts(phrase);
        }
        else if(choice.equals("stockbelow"))
        {
            int amount = reader.getInt("Please enter quantity you'd like to list (limit 1-5)");
            if(1 <= amount && amount <=5)
            {
                stock.stockBelow(amount);
            }
        }
        else if(choice.equals("restockup"))
        {
            int amount = reader.getInt("Please enter threshold you'd like to restock");
            int quantity = reader.getInt("please enter restock amount (1-10)");
            {
                stock.reStockup(amount,quantity);
            }
        }
        return false;
    }

    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    Buy:        Buy a product(s)");
        System.out.println("    Sell:       Sell a product(s)");
        System.out.println("    Search:     Searches for a product");
        System.out.println("    StockBelow: Lists stock below set amount");
        System.out.println("    Restockup:  Re-stock up a product");
        System.out.println("    Print:      Print all products");
        System.out.println("    Quit:       Quit the program");
        System.out.println();        
    }

    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println("********************************");
        System.out.println("  App21-04: Stock Application ");
        System.out.println("      by ZARRAR AFZAL");
        System.out.println("********************************");
    }
}