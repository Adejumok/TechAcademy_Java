package collections;

public class TestArray {

//    anonymous array in java
    static void printArray(int[] arr){
//        creating a method which receives an array as a parameter
        for (int j : arr)
            System.out.println(j);
    }

    //    passing array to a method in java
    static void min( int arr[]){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (min > arr[i])
                min = arr[i];
        System.out.println(min);
    }

    public static void main(String[] args) {
        printArray(new int[]{10, 22, 44, 66});
        int[] a = new int[5]; // declaration and instantiation
        a[0] = 10;
        a[1] = 20;
        a[2] = 70;
        a[3] = 40;
        a[4] = 50;
//        traversing array
//        for (int i = 0; i < a.length; i++)
//            System.out.println(a[i]);

        for(int i : a) System.out.println(i);


//      declaration, instantiation and initialization
        int[] b = {33, 3, 4, 5};
//      printing array
        for (int i = 0; i < b.length; i++) System.out.println(b[i]);

        int[] c = {33, 3, 4, 5};
        for (int k : c) System.out.println(k);

        int[] l = {33,3,4,5};
        min(l);

    }

}
