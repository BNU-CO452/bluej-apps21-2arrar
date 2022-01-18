

public class StatsCommand extends ZuulCommand
{
    public StatsCommand(Game zuul)
    {
        super(zuul);
    }
    

    public void execute(){
        Game.clearConsole();
        Game.printHeading(" CHARACTER INFORMATION ");
        //Game.player.print();
        Player.printStats();
        
    }
    
    
}