package intro;

public class LabeledBreakExample {
    public static void main(String[] args) {
        int j, k;
        outermost:
        for (j=1; j <5;j++){
            innerMost:
            for (k=1; k<3; k++) System.out.println("j= "+j+" and k = "+k);

            if (j==3)
                break outermost;
        }
    }
}
