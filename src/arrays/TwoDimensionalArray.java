package arrays;

public class TwoDimensionalArray {

        public static void main(String[] args) {

            // 2D String array containing different grocery items
            String[][] groceries = {
                    {"Apple", "Orange", "Banana"},
                    {"Potato", "Carrot", "Tomato"},
                    {"Chicken", "Mutton", "Fish"}
            };

            // Updating specific elements using row and column indexes
            groceries[1][1] = "Onion";
            groceries[2][0] = "ButterChicken";

            // Printing the 2D array using nested enhanced for loops
            System.out.println("================================");
            System.out.println("        GROCERY ITEMS");
            System.out.println("================================");

            for (String[] item : groceries) {

                for (String items : item) {
                    System.out.print(items + "   ");
                }

                System.out.println();
            }

            // --------------------------------------------

            System.out.println("\n================================");
            System.out.println("        DIAL PAD");
            System.out.println("================================");

            // 2D character array representing a telephone dial pad
            char[][] telephone = {
                    {'1', '2', '3'},
                    {'4', '5', '6'},
                    {'7', '8', '9'},
                    {'*', '0', '#'}
            };

            // Printing the telephone dial pad
            // using nested enhanced for loops
            for (char[] phone : telephone) {

                for (char calls : phone) {
                    System.out.print(calls + "    ");
                }

                System.out.println();
            }

            System.out.println("================================");
        }
    }

