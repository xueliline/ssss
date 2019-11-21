public class Solution179 {
    public String largestNumber(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i : nums) {
            if (max < i)
                max = i;
        }
        String.valueOf(max).length();
    }
}