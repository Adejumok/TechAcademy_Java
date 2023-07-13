package intro;

import java.util.Arrays;

public class ClonedArray {
    public static void main(String[] args) {
        int[] arr = {33,3,4,5};
        System.out.println("Printing an original array: ");
        for (int num:arr) System.out.println(num);
        System.out.println(Arrays.toString(arr));


        System.out.println("Printing clone of the array: ");
        int[] clonedArr = arr.clone();
        for (int num:clonedArr) System.out.println(num);
        System.out.println(clonedArr);

        System.out.println("Are both equal?");
        System.out.println(arr==clonedArr);
    }
}
