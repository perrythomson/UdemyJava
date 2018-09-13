package main.advancedTopics.composition;

/**
 * Created by pthomson on 6/7/17.
 */
public class PC {
    private Case theCase;       //instead of extending to only one class, doing it this way the PC class has the
    private Monitor monitor;    //classes of Case, Monitor, and Motherboard
    private Motherboard motherboard;


    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();

    }

    private void drawLogo() {
        //fancy graphics
        monitor.drawPixelAt(1200, 50, "yellow");  //can use getMonitor but this is more correct code
    }

//
//    private Case getTheCase() {
//        return theCase;
//    }
//
//    private Monitor getMonitor() {
//        return monitor;
//    }
//
//    private Motherboard getMotherboard() {
//        return motherboard;
//    }

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {

        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
}
