package main.advancedTopics.innerClasses;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");


    public static void main(String[] args) {

//        class ClickListener implements Button.OnClickListener {
//            public ClickListener() {
//                System.out.println("I've been attached...");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " was clicked...");
//            }
//        }
//        btnPrint.setOnClickListener(new ClickListener());

        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked...");
            }
        });
        listen();
    }

    private static void listen() {
        boolean quit = false;
        while (!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }
}



//        Gearbox mcLaren = new Gearbox(6);
//        Gearbox.Gear first = mcLaren.new Gear(1, 11.1);
////        Gearbox.Gear second = new Gearbox.Gear(2, 11.3);  //not an enclosing class
////        Gearbox.Gear third = new mcLaren.Gear(2, 10.3);  //needs the .new to create a new instance of
//        Gearbox.Gear second = mcLaren.new Gear(2, 12.2);
//        Gearbox.Gear third = mcLaren.new Gear(3, 13.3);
//        Gearbox.Gear forth = mcLaren.new Gear(4, 14.4);
//        Gearbox.Gear fifth = mcLaren.new Gear(5, 15.5);
//        Gearbox.Gear sixth = mcLaren.new Gear(6, 16.6);

//        mcLaren.addGear(1, 11.11);  //no reference to the gear class because it is now local
//        mcLaren.addGear(2, 22.22);
//        mcLaren.addGear(3, 33.33);    //commenting out because we implemented addGear in constructor of Gearbox method

//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(1);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(1000));
//        mcLaren.changeGear(2);
//        System.out.println(mcLaren.wheelSpeed(3000));
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(3);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(6000));
//        mcLaren.changeGear(7);
//        mcLaren.operateClutch(true);
//        System.out.println(mcLaren.wheelSpeed(10));
