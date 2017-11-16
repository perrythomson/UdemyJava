//package headFirst.chapter4.chapter5;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//
//public class GameHelper {
//    private static final String alphabet = "abcdefg";
//    private int gridLength = 7;
//    private int gridSize = 49;
//    private int[] grid = new int[gridSize];
//    private int comCount = 0;
//
//    public String getUserInput(String prompt) {
//        String inputLine = null;
//        System.out.println(prompt + " ");
//
//        try {
//            BufferedReader inputStream = new BufferedReader(new InputStreamReader(System.in));
//            inputLine = inputStream.readLine();
//            if (inputLine.length() == 0) {
//                return null;
//            }
//        } catch (IOException e) {
//            System.out.println("IOException: " + e);
//        }
//        return inputLine.toLowerCase();
//    }
//
//    public ArrayList<String> placeDotCom(int comSize) {
//        ArrayList<String> alphaCells = new ArrayList<>();
//        String[] alphacords = new String[comSize];
//        String temp = null;
//        int[] coords = new int[comSize];
//        int attempts = 0;
//        boolean success = false;
//        int location = -1;
//
//        comCount++;
//        int incr = 1;
//        if ((comCount % 2) == 1) {
//            incr = gridLength;
//        }
//        while (!success & attempts++ < 200) {
//            location = (int) (Math.random() * gridSize);
//            int x = 0;
//            success = true;
//            while (success && x < comSize) {
//                if (grid[location] == 0) {
//                    coords[x++] = location;
//                    location += incr;
//                    if (location >= gridSize) {
//                        success = false;
//                    }
//                    if (x > 0 && (location % gridLength == 0)) {
//                        success = false;
//                    }
//                } else {
//                    success = false;
//                }
//            }
//        }
//
//        int x = 0;
//        int row = 0;
//        int column = 0;
//
//        while (x < comSize) {
//            grid[coords[x]] = 1;                    // Sets the location as "occupied" to prevent another "dot com" to come over it.
//            row = (int) (coords[x] / gridLength);   // Get the location row
//            column = coords[x] % gridLength;        // Get the location column
//            temp = String.valueOf(alphabet.charAt(column));// Convert the column to a letter (from "a" to "g")
//            alphaCells.add(temp.concat((Integer.toString(row))));// Concatenate the column and the row to form a coordinate and add it to the result
//            x++;
//        }
//        return alphaCells;
//
//    }
//}
