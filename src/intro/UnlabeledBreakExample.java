package intro;

public class UnlabeledBreakExample {
    public static void main(String[] args) {
        String[] arr = {"Shubham", "Anubhav", "Nishka", "Gunjan", "Akash"};
        String searchName = "Nishka";

        int j;
        boolean foundName = false;
        for (j=0; j< arr.length; j++){
            if (arr[j] == searchName){
                foundName=true;
                break;
            }
        }

        if (foundName){
            System.out.println("The name "+searchName+" is found at index "+j);
        }else {
            System.out.println("The name "+searchName+" is not found in the array");
        }
    }
}
