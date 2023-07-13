public class NestedForLoop {
    public static void main(String[] args) {
////        loop of i
//        for (int i=1; i<=3; i++){
////            loop of j
//            for(int j=1; j<=3; j++){
//                System.out.print(i+j + " ");
//            }
//            System.out.println();
//        }


//        pyramid example
//        for (int i =1; i<=5; i++){
//            for(int j=1; j<i; j++){
//                System.out.print(j + " ");
//            }
//            System.out.println(i);
//        }

//        for (int i =1; i<=5; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*" + " ");
//            }
//            System.out.println();
//        }
//
//        for (int i =1; i<=5; i++) {
//            for (int j = 5; i <= j; j--) {
//                System.out.print("*" + " ");
//            }
//            System.out.println();
//        }

        int term = 6;
        for (int i=1; i<=term; i++){
            for (int j=term; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();  //new line
        }
    }
}
