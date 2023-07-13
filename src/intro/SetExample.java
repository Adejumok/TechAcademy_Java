package intro;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {

        int[] count = {34, 22, 10, 60, 30, 22};

        Set<Integer> set = new HashSet<>();
        try {
            for (int i = 0; i < 6; i++) set.add(count[i]);
            System.out.println(set);

            TreeSet<Integer> sortedSet = new TreeSet<>(set);
            System.out.println("The sorted list is: ");
            System.out.println(sortedSet);

            set.add(19);
            System.out.println("New Hash Set: "+set);
            System.out.println("Tree Set: "+sortedSet);

            System.out.println("The first element of the set is: " + sortedSet.first());
            System.out.println("The last element of the set is: " + sortedSet.last());
        }
        catch (Exception e){
            System.out.println("The error "+e+" occured.");
        }
    }
}
