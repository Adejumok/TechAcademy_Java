public class MultiDimensionalArray {
    public static void main(String[] args) {
////        declaring and initialising 2D array
//        int arr [][] = new int[5][];
//        int arr[][] = {{1,2,3}, {2,4,5},{4,4,5}};
////        printing 2D array
//        for (int i=0; i<arr.length; i++){
//            for(int j=0; j<arr[i].length; j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

//        Test Jagged Array = columns are not the same in all the rows
//        int arr [][] = new int[3][];
//        arr[0] = new int[3];
//        arr[1] = new int[4];
//        arr[2] = new int[2];
//
//        int count = 0;
//        for (int i=0; i< arr.length; i++)
//            for (int j=0; j<arr[i].length; j++)
//                arr[i][j] = count++;
//
//        for (int i=0; i< arr.length; i++){
//            for (int j=0; j<arr[i].length; j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

//        copying a java array
        char[] copyFrom ={'d','e','c','a','f','f','e','l','n','a','t','e','d'};
//        declaring a destination array
        char[] copyTo = new char[7];
//        copying array using System.arraycopy() method
        System.arraycopy(copyFrom, 2, copyTo, 0,7);
//        printing the destination array
        System.out.println(String.valueOf(copyTo));
//
    }
}
