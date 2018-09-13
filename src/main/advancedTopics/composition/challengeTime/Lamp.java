package main.advancedTopics.composition.challengeTime;

/**
 * Created by pthomson on 6/14/17.
 */
public class Lamp {
    private String style;
    private boolean battery;
    private int globRating;

    public void turnOn() {
        System.out.println("Lamp -> Turning on.");
    }

    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public boolean isBattery() {
        return battery;
    }

    public void setBattery(boolean battery) {
        this.battery = battery;
    }

    public int getGlobRating() {
        return globRating;
    }

    public void setGlobRating(int globRating) {
        this.globRating = globRating;
    }
}
