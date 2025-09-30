/**
 * ArrayCreationLab.java
 * 9/30/2025
 * Karan Modi
 */ 
import java.util.Scanner; // imports scanner

public class ArrayCreationLab {

    public static Scanner scanner = new Scanner(System.in);

    public static int getIntInput(String prompt) {
        System.out.print(prompt); //Gets int input
        return scanner.nextInt();
    }

    public static String getInput(String prompt) {
        System.out.print(prompt); //Gets string input
        return scanner.nextLine();
    }

    @SuppressWarnings("StringEquality")
     public static void main (String[] args) {
        // PART 1
        int[] scores; // initializes Scores array
        scores = new int[5]; //sets size of array to 5
        System.out.println("Array length: " + scores.length); //prints length of array

        // PART 2
        String[] colors = {"Red", "Green", "Blue"}; //initializes colors array with all values
        for (String color: colors) { // enhanced for loop for all values in array
            System.out.println(color); // prints out each color
        }

        // PART 3
        Double[] prices = new Double[3]; // initializes prices array with size 3
        prices[0] = 9.99; // sets each value
        prices[1] = 14.50;
        prices[2] = 20.00;

        for (Double price: prices) { //enhanced foor loop
            System.out.print(price + " "); // prints each value with a space in between
        }
        System.out.println(); // prints out the final results

        // PART 4
        int numberOfFoods = getIntInput("Enter the amount of your favorite foods: "); // inputs for the amount of fodo the user wants to input
        String[] foods = new String[numberOfFoods]; // initializes the foods array with the input value for the size
        scanner.nextLine(); // clears buffer due to different inputs

        for (int i = 0; i < numberOfFoods; i++) { // for loop for asking the user what foods they want in their array
            String fooditem = getInput("Enter food item: "); // input
            foods[i] = fooditem; // sets the value to the users food item
        }

        System.out.print("Your favorite foods are: ");
        for (String food: foods) { // enhanced for loop for all values in array
            if (food == foods[foods.length-1]) {
                System.out.print(food);
            }
            else {System.out.print(food + ", ");}
        }
        System.out.println();
    }
}