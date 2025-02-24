import java.util.ArrayList;

public class Solution {
    public static String convert(String s, int numRows){
        if (numRows == 1) return s;

        ArrayList<String> zigzag = new ArrayList<>();
        for(int i = 0; i < numRows; ++i){
            zigzag.add("");
        }
        int next = 0;
        boolean revers = true;


        for (int i = 0; i < s.length(); ++i) {

            zigzag.set(next, zigzag.get(next) + s.charAt(i));
            if (revers) {
                ++next;
                if (next > numRows - 1) {
                    --next;
                    revers = false;
                }
            }
            if (!revers) {
                --next;
                if (next < 0) {
                    ++next;
                    revers = true;
                    ++next;
                }
            }
        }

        s = "";

        for (String i : zigzag) s += i;
        return s;

    }
}
