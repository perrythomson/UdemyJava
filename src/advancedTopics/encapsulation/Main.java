package advancedTopics.encapsulation;

/**
 * Created by pthomson on 6/14/17.
 */
public class Main {
    public static void main(String[] args) {

//        Player player = new Player();
//
//        player.fullName = "Tim";
////        player.health = 450;  //without this the player health is defaulted to 0
//        player.weapon = "Axe";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Player " + player.fullName + " loses " + damage + " health. The remaining health is " + player.health + ".");
//
//        damage = 441;
//        player.loseHealth(damage);
//        System.out.println("Player " + player.fullName + " loses " + damage + " health. The remaining health is " + player.health + ".");
//
//

        EnhancedPlayer player = new EnhancedPlayer("Tim", 200, "axe");
        System.out.println("Initial health is " + player.getHealth());
    }
}
