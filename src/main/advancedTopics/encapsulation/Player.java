package main.advancedTopics.encapsulation;

/**
 * Created by pthomson on 6/14/17.
 */
public class Player {

    public String fullName;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health = this.health - damage;

        if (this.health <= 0) {
            System.out.println("Player knocked out.");
        }
    }

    public int heathRemaining() {
        return this.health;
    }
}
