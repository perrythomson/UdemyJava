package advancedTopics.arraysListsAutoBoxingUnBoxing;

import java.util.ArrayList;

/**
 * Created by pthomson on 7/11/17.
 */
public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();  //it can have an empty contructor for the ArrayList class

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryItem(String item) {
        groceryList.add(item);

    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list.");
        for(int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified.");
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }

    public void removeGroceryItem(int position) {
        groceryList.remove(position);
    }

    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem); //this returns an int which defines the items in groceryList
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if (position >= 0) {
            return true;
        }
        return false;
    }

//
//    public String findItem(String searchItem) {
////        boolean exists = groceryList.contains(searchItem);
//        int position = groceryList.indexOf(searchItem);
//        if (position >= 0) {
//            return groceryList.get(position);
//        }
//        return null;
//    }

}
