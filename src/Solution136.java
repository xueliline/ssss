import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Solution136 {
    public int singleNumber(int[] nums) {
        int res=0;
        for (int i=0;i<nums.length;i++)
        {
            res=nums[i]^res;
        }
        return res;
    }


}
//public static void main(String[] args) {
//    Solution136 solution136 =new Solution136();
//    int res=solution136.singleNumber(new int []{4,1,2,1,2});
//    System.out.println(res);
//}