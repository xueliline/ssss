import java.util.ArrayList;
import java.util.List;

public class Solution17 {
    List<String> list = new ArrayList<>();
    public int max = 0;
    public String digits = "";
    char chars[][] = {
            {'a', 'b', 'c'},
            {'d', 'e', 'f'},
            {'g', 'h', 'i'},
            {'j', 'k', 'l'},
            {'m', 'n', 'o'},
            {'p', 'q', 'r', 's'},
            {'t', 'u', 'v'},
            {'w', 'x', 'y', 'z'}};

    private void inorder(String str, int height) {
        if (height == max) {
            list.add(str);
            return;
        }
       char[] tmp = chars[(digits.charAt(height) - '2')];
        for (int i = 0; i < tmp.length; i++) {
            inorder(str + tmp[i], height + 1);
        }

    }

    public List<String> letterCombinations(String digits) {
        if(digits.length()==0)
            return list;
        max = digits.length();
        this.digits = digits;
        inorder("", 0);
        return list;
    }

    public static void main(String[] args) {
        Solution17 solution17=new Solution17();
        solution17.letterCombinations("23");
    }
}
