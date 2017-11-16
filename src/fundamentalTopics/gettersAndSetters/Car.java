package fundamentalTopics.gettersAndSetters;

/**
 * Created by pthomson on 5/25/17.
 */
public class Car {

    private int door;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model) {

        String validModel = model.toLowerCase();
        if (validModel.equalsIgnoreCase("carrera") || validModel.equalsIgnoreCase("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel() {
        return this.model;
    }
}
