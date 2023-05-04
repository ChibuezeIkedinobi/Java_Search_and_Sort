package binarySearch;

public class binary {

    public static void main(String[] args) {
        int[] array = {5,3,7,9,2,4,6,1,23,10};
        int key = 1;
        int last = array.length - 1;

        binarySearch(array, 0, last, key);
    }

    public static void binarySearch(int[] array, int first, int last, int key) {

        int mid = (first + last) / 2;

        while (first <= last) {
            if (array[mid] < key) {
                first = mid + 1;
            } else if (array[mid] == key) {
                System.out.println("Element is found at index: "+mid);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Element is not found");

        }
    }
}
