package Day2;
//Write a search function, which
//get as an argument int[ ] array, (returns the size of array)
//public static int search(int[ ] array)
//get as an argument int[ ] array , also int a, and returns an index of that argument
//public static int search(int[ ] array, int a)
//get as an argument int[ ] array, int argument, int index
//returns true if that element is in that place in array,otherwise false
//public static boolean search(int[] array, int argument, int index)
public class Exercise5 {
    public static void main(String[] args) {
        int[] array = {5, 7, 9, 43, 2};
        System.out.println(search(array));
        System.out.println(search(array, 43));
        System.out.println(search(array, 2, 3));
    }

    public static int search(int[] array) {
        return array.length;
    }

    public static int search(int[] array, int a) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (a == array[i]) {
                index = i;
            }
        }
        return index;
    }

    public static boolean search(int[] array, int argument, int index) {
        for (int i = 0; i < array.length; i++) {
            if (argument == array[index]) {
                return true;
            }
        }
        return false;
    }

}
