package zelda;

public class Zelda {
    
public static void main(String[] args){

    System.out.println("Welcome to hyrule!");

// create a new instance of the NPCs to populate the world
NPC  npcAlex = new NPC("Hyrule Castle", "Alex");
NPC  npckross = new NPC("kakariko Village", "kross");
NPC  npcissac = new NPC("zoras domain", "issac");
NPC  npcpreston = new NPC("gerudo desert", "preston");
NPC  npcjessica = new NPC("Hyrule Castle", "jessica");

NPC  npcgreg = new NPC("kakariko village", "greg");

System.out.println("\n your quest as zelda is to find all the people in hyrule. here are there previouse known locations");
//display the location of npc
npcAlex.displayLocation();
npckross.displayLocation();
npcissac.displayLocation();
npcpreston.displayLocation();
npcjessica.displayLocation();
npcgreg.displayLocation();

npcAlex.sleep();

npckross.eat("apple");
npcissac.talk("i am a god amongst men");

}



}
