



public class Story {
    
    public static void printIntro(){
        Game.clearConsole();
        Game.printSeperator(30);
        System.out.println("Backstory");
        Game.printSeperator(20);
        System.out.println("+-=-+ +-=-+ +-=-+ +-=-+ +-=-+ +-=-+ +-=-+ +-=-+ +-=-+ +-=-+ +-=-+ +-=-+ +-=-+ ");
        System.out.println(" 1980, Russia. The war between the Soviet's and the Rural's a ");
        System.out.println(" is at its peak. ");
        System.out.println(" The local general has requested those able to enlist, so you did. ");
        System.out.println(" ");
        System.out.println(" After a couple weeks, you received training as a Soviet Pilot ");
        System.out.println(" and are stationed near the region of conflict. ");
        System.out.println(" It was the day of your mission. You tighten the straps of your ");
        System.out.println(" leather helmet and positioned yourself in the Mi-24 helicopter. ");
        System.out.println(" Signal given, you ascend into the skies and brave the airspace4 ");
        System.out.println(" alone. ");
        System.out.println(" ");
        System.out.println(" You admired the beautiful mountain range this area has to offer ");
        System.out.println(" as you do, you begin to veer off your given flight path. ");
        System.out.println("  ");
        System.out.println(" *$%£$$!!^£&*£%^£* ");
        System.out.println(" A blast would take out your rear properller, you are under attack ");
        System.out.println(" The helicopter begins to swing out of control. ");
        System.out.println(" Descending at rapid speeds, you panic, shut your eyes- and brace for impact. ");
        System.out.println("+-=-+ +-=-+ +-=-+ +-=-+ +-=-+ +-=-+ +-=-+ +-=-+ +-=-+ +-=-+ +-=-+ +-=-+ +-=-+ ");
        
        Game.anythingToContinue();
    }
    
    public static void printScenario(){
        Game.clearConsole();
        Game.printSeperator(30);
        System.out.println("Scenario");
        Game.printSeperator(20);
        System.out.println(" You awake to find yourself laying in a desert. ");
        System.out.println(" You are surrounded by metal debris. ");
        System.out.println(" The hot sun stares as you try to recollect your conscience ");
        System.out.println(" ");
        System.out.println(" Your uniform is torn, survival gear torched. ");
        System.out.println(" Around you is your battle rifle and a map. ");
        System.out.println(" You must find some sort of flare to signal a rescue ");
        System.out.println(" Good luck " + Game.player.name );
        Game.anythingToContinue();
    }
    
    public static void printCrash(){
        Game.clearConsole();
        Game.printSeperator(30);
        System.out.println("Crash Site");
        Game.printSeperator(20);
        System.out.println(" You are at the crash site.");
        System.out.println(" Remnants of your helicopter are blackened by the blast");
        System.out.println(" and sunked into the yellow sand.");
        System.out.println(" The flickers of fire is the only noise that can be heard");
        Game.anythingToContinue();
    }
    
    public static void printLake(){
        Game.clearConsole();
        Game.printSeperator(30);
        System.out.println("Lake");
        Game.printSeperator(20);
        System.out.println(" A body of water is present before you ");
        System.out.println(" Scattered around are shells and drift wood ");
        System.out.println(" The sun's glow bounces of the shoreline as  ");
        System.out.println(" the cold winds of water gently breeze past. ");
        Game.anythingToContinue();
    }
    
    public static void printMarket(){
        Game.clearConsole();
        Game.printSeperator(30);
        System.out.println("Market");
        Game.printSeperator(20);
        System.out.println(" A clutter of stalls and people walk, talk and watch. ");
        System.out.println(" Long cuts of cloth dance in the breeze as shopkeepers ");
        System.out.println(" exclaim their products and prices ");
        System.out.println(" The air is filled with foreign voices. ");
        Game.anythingToContinue();
    }
    
    public static void printCamp(){
        Game.clearConsole();
        Game.printSeperator(30);
        System.out.println("Camp");
        Game.printSeperator(20);
        System.out.println(" Tents and make-shift selters are everywhere. ");
        System.out.println(" Groups of people can be seen spread among the area ");
        System.out.println(" You feel a sense of uneasiness being here. ");
        System.out.println(" Something isn't right. ");
        Game.anythingToContinue();
    }
    
    public static void printOutpost(){
        Game.clearConsole();
        Game.printSeperator(30);
        System.out.println("Outpost");
        Game.printSeperator(20);
        System.out.println(" Tall re-inforced walls stare down at you ");
        System.out.println(" Barbed wire tangle themselves along the peaks of them. ");
        System.out.println(" Subtle tones of voices can be heard from the large tents. ");
        System.out.println(" Marching men patrol the perimeter. ");
        Game.anythingToContinue();
    }
    
    public static void printCity(){
        Game.clearConsole();
        Game.printSeperator(30);
        System.out.println("City");
        Game.printSeperator(20);
        System.out.println(" Destroyed walls and ruined buildings stand lonely. ");
        System.out.println(" There is not a single person in sight, apart from ");
        System.out.println(" the placement of several bodies. ");
        System.out.println(" Torched cars and flamining remains are the only ");
        System.out.println(" signs of warmth.");
        Game.anythingToContinue();
    }
    
    public static void printRuins(){
        Game.clearConsole();
        Game.printSeperator(30);
        System.out.println("Ruins");
        Game.printSeperator(20);
        System.out.println(" Standing columns remain shattered and in pieces ");
        System.out.println(" What seemed to be a artifact, now a mear collection ");
        System.out.println(" of rubble and debris. ");
        System.out.println(" There's not alot to comment on. ");
        Game.anythingToContinue();
    }
    
    public static void printRoad(){
        Game.clearConsole();
        Game.printSeperator(30);
        System.out.println("Road");
        Game.printSeperator(20);
        System.out.println(" Tarnished tarmac lays beneath your feet ");
        System.out.println(" and extends into the hazy distance. ");
        System.out.println(" Checkpoints can be seen among the horizon but ");
        System.out.println(" they don't look friendly. ");
        Game.anythingToContinue();
    }
}
