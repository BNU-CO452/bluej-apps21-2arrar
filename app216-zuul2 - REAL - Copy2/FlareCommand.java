

public class FlareCommand extends ZuulCommand
{
    public FlareCommand(Game zuul)
    {
        super(zuul);
    }
    

    public void execute(){
        Game.useFlare();
        
    }
    
    
}