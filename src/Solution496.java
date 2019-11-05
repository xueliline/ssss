import java.util.HashMap;
import java.util.Stack;

public class Solution496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int []res=new int[nums1.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for (int i=0;i< nums2.length;i++)
        {
            map.put(nums2[i],-1);
        }
        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                map.put(stack.pop(), num);
            }
            stack.add(num);
        }
        for (int i=0;i<nums1.length;i++) {
            res[i]=map.get(nums1[i]);
        }
        return res;
    }


}
//    public static void main(String[] args) {
//        Solution496 solution496=new Solution496();
//        int[]res= solution496.nextGreaterElement(new int []{2,4},new int []{1,2,3,4});
//        System.out.println(res);
//    }