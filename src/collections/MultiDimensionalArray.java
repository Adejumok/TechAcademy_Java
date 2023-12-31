package collections;

public class MultiDimensionalArray {
    public static void main(String[] args) {
//        declaring and initialising 2D array
        int arr1[][] = new int[5][];
        int[][] arr = {{1, 2, 3}, {2, 4, 5}, {4, 4, 5}};
//        printing 2D array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

//        Test Jagged Array = columns are not the same in all the rows
        int[][] arr2 = new int[3][];
        arr2[0] = new int[3];
        arr2[1] = new int[4];
        arr2[2] = new int[2];

        int count = 0;
        for (int i=0; i< arr2.length; i++)
            for (int j=0; j<arr2[i].length; j++)
                arr2[i][j] = count++;

        for (int i=0; i< arr2.length; i++){
            for (int j=0; j<arr2[i].length; j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
