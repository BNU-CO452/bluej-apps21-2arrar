

public class StatsCommand extends ZuulCommand
{
    public StatsCommand(Game zuul)
    {
        super(zuul);
    }
    

    public void execute(){
        Game.characterInfo();
        
    }
    
    
}