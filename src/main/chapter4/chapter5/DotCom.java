//package main.miscellaneousTopics.chapter4.chapter5;
//
//import java.util.ArrayList;
//
//public class DotCom {
//    private ArrayList<String> locationCells;
//    private String name;
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setLocationCells(ArrayList<String> loc) {
//        locationCells = loc;
//    }
//
//    public String checkYourself(String userInput) {
//        int index = locationCells.indexOf(userInput);
//        String result = "miss";
//        if (index >= 0) {
//            locationCells.remove(index);
//            if (locationCells.isEmpty()) {
//                result = "kill";
//            } else {
//                result = "hit";
//            }
//        }
//        System.out.println(result);
//        return result;
//    }
//}
