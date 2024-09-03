import java.util.Scanner;

import arrays.Arrays;

public class DataStructures {
    public static void main(String[] args) {
        Scanner mainScanner = new Scanner(System.in);
        menu(mainScanner);

    }

    // Created a menu so you can call either the temperature or coin method
    public static void menu(Scanner scanner) {
        while (true) {
            System.out.println("Select an operation:");
            System.out.println("0. Exit");
            System.out.println("1. Arrays");
            System.out.println("2. Dynamic Arrays");
            System.out.println("3. Stacks");
            System.out.println("4. Queues");
            System.out.println("5. Heap / Priority Queues");
            System.out.println("6. Singly Linked Lists");
            System.out.println("7. Doubly Linked Lists");
            System.out.println("8. Circular Linked Lists");
            System.out.println("9. Trees");
            System.out.println("10. ");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                case 1:
                    System.out.println("**** Arrays ****");
                    System.out.println("Using a generic to pass whatever type of array you want to iterate over.");
                    Integer[] intArray = { 1, 2, 3, 4, 5 };
                    String[] stringArray = { "Hello", "World", "!" };
                    System.out.println("Iterating over an array using a for-each loop:");
                    Arrays.iterateArray1(intArray);
                    Arrays.iterateArray1(stringArray);
                    System.out.println("Iterating over an array using a for loop:");
                    Arrays.iterateArray2(intArray);
                    Arrays.iterateArray2(stringArray);
                    System.out.println("Removing the last element from an array:");
                    Arrays.removeEnd(intArray);
                    Arrays.removeEnd(stringArray);
                    System.out.println("Removing the first element from an array:");
                    Arrays.removeStart(intArray);
                    Arrays.removeStart(stringArray);
                    System.out.println("Remove an element from the array based on the index:");
                    Arrays.removeElementAtIndex(intArray, 2);
                    Arrays.removeElementAtIndex(stringArray, 1);
                    System.out.println("Insert an element into the array at a specific index:");
                    Arrays.insertElementAtIndex(intArray, 2, 3);
                    Arrays.insertElementAtIndex(stringArray, 1, "World");
                    System.out.println("Search for an element in the array:");
                    Arrays.searchElement(intArray, 3);
                    Arrays.searchElement(stringArray, "World");
                    break;
                case 2:

                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");

            }
        }
    }

}
