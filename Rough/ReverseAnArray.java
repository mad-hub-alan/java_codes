import java.util.*;

public class ReverseAnArray {

    static String[] reverseArray(String[] s) {

        String[] temp = new String[s.length];
        int index = s.length;

        for(int i=0; i<s.length; i++){
            temp[index-1] = s[i];
            index--;
        }
        return temp;
    }

    public static void main(String args[]) {
        assert (Arrays.equals(reverseArray(new String[] { "Why", "this", "kolaveridi?" }),
                new String[] { "kolaveridi?", "this", "Why" })) : "Expect {\"kolaveridi?\",\"this\",\"Why\"} for s={\"Why\",\"this\",\"kolaveridi?\"}";
        System.out.println("All test cases in main function passed");

        System.out.println(reverseArray(new String[]{"One","Two","Three"}));
    }
}
