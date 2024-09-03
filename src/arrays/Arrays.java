package arrays;

public class Arrays {

    public static <T> void iterateArray1(T[] array) {
        // check if the array is empty
        if (array.length == 0) {
            System.out.println("The array is empty.");
            return;
        }
        // iterate over the array using a for-each loop
        System.out.print("[");
        for (T element : array) {
            System.out.print(element);
            if (element != array[array.length - 1]) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static <T> void iterateArray2(T[] array) {
        // check if the array is empty
        if (array.length == 0) {
            System.out.println("The array is empty.");
            return;
        }
        // iterate over the array using a for loop
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[array.length - 1]) {
                System.out.print(array[i] + ",");
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.println("]");
    }

    public static <T> void removeEnd(T[] array) {
        // check if the array is empty
        if (array.length == 0) {
            System.out.println("The array is empty.");
            return;
        }
        // create a new array with a length of the original array minus 1
        @SuppressWarnings("unchecked")
        T[] newArray = (T[]) new Object[array.length - 1];
        // copy the elements from the original array to the new array
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
        System.out.println("Removed the last element from the array.");
        // iterate over the new array
        iterateArray1(newArray);
    }

    public static <T> void removeStart(T[] array) {
        // check if the array is empty
        if (array.length == 0) {
            System.out.println("The array is empty.");
            return;
        }
        // create a new array with a length of the original array minus 1
        @SuppressWarnings("unchecked")
        T[] newArray = (T[]) new Object[array.length - 1];
        // copy the elements from the original array to the new array
        for (int i = 1; i < array.length; i++) {
            newArray[i - 1] = array[i];
        }
        array = newArray;
        System.out.println("Removed the first element from the array.");
        // iterate over the new array
        iterateArray1(newArray);
    }

    public static <T> void removeElementAtIndex(T[] array, int index) {
        // check if the array is empty
        if (array.length == 0) {
            System.out.println("The array is empty.");
            return;
        }
        // check if the index is out of bounds
        if (index < 0 || index >= array.length) {
            System.out.println("The index is out of bounds.");
            return;
        }
        // create a new array with a length of the original array minus 1
        @SuppressWarnings("unchecked")
        T[] newArray = (T[]) new Object[array.length - 1];
        // copy the elements from the original array to the new array
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            newArray[j++] = array[i];
        }
        array = newArray;
        System.out.println("Removed the element at index " + index + " from the array.");
        // iterate over the new array
        iterateArray1(newArray);
    }

    public static <T> void insertElementAtEnd(T[] array, T element) {
        // create a new array with a length of the original array plus 1
        @SuppressWarnings("unchecked")
        T[] newArray = (T[]) new Object[array.length + 1];
        // copy the elements from the original array to the new array
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[newArray.length - 1] = element;
        array = newArray;
        System.out.println("Inserted the element at the end of the array.");
        // iterate over the new array
        iterateArray1(newArray);
    }

    public static <T> void insertElementAtStart(T[] array, T element) {
        // create a new array with a length of the original array plus 1
        @SuppressWarnings("unchecked")
        T[] newArray = (T[]) new Object[array.length + 1];

        // copy the elements from the original array to the new array
        for (int i = 1; i < newArray.length; i++) {
            newArray[i] = array[i - 1];
        }
        newArray[0] = element;
        array = newArray;
        System.out.println("Inserted the element at the start of the array.");
        // iterate over the new array
        iterateArray1(newArray);
    }

    public static <T> void insertElementAtIndex(T[] array, int index, T element) {
        // check if the array is empty
        if (array.length == 0) {
            System.out.println("The array is empty.");
            return;
        }
        // check if the index is out of bounds
        if (index < 0 || index >= array.length) {
            System.out.println("The index is out of bounds.");
            return;
        }
        // create a new array with a length of the original array plus 1
        @SuppressWarnings("unchecked")
        T[] newArray = (T[]) new Object[array.length + 1];
        // copy the elements from the original array to the new array
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i == index) {
                newArray[j++] = element;
            }
            newArray[j++] = array[i];
        }
        array = newArray;
        System.out.println("Inserted the element at index " + index + " into the array.");
        // iterate over the new array
        iterateArray1(newArray);
    }

    public static <T> void searchElement(T[] array, T element) {
        // check if the array is empty
        if (array.length == 0) {
            System.out.println("The array is empty.");
            return;
        }
        // search for the element in the array
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(element)) {
                System.out.println("The element " + element + " was found at index " + i + " in the array.");
                return;
            }
        }
        System.out.println("The element " + element + " was not found in the array.");
    }
}
