/*
 * THIS CLASS IS FOR ENEMY
 *  ENEMIES INCLUDE:
 *      REBEL
 *      INSURGENT
 *      COMMANDER
 *      WARLORD
 *      
 *      EXPERIMENT-attack varies on player health
 *      sentinel code this part i beg, is2hard4me
 */

public class Enemy extends Character{

    //delete if no worky
    int playerXp; // for experiment

    public Enemy(String name, int playerXp){
        super(name, (int) (Math.random()*playerXp + playerXp/3 +5), (int) (Math.random()*(playerXp/4 + 2) + 1));

        this.playerXp = playerXp;
        /* Uncomment if no worky 
        public Enemy(String name, int maxHp, int xp) {
        super(name, maxHp, xp);
        // TO DO Auto-generated constructer stub
        }
         */
    }

    @Override
    public int attack() {
        // one again, way too complicated- change to (Math.random()*100); or something
        return (int) (Math.random()*(playerXp/4 + 1) + xp/4 + 3);
    }

    @Override
    public int defend() {
        // TODO Auto-generated mthod stub
        return (int) (Math.random()*(playerXp/4 + 1) + xp/4 + 3);
    }
}
