import java.util.Arrays;
import java.util.Stack;

class Solution179 {
    int maxlen;
    public String largestNumber(int[] nums) {
        class Tmp implements Comparable <Tmp>{
            public int getNum() {
                return num;
            }
            public void setNum(int num) {
                this.num = num;
            }
            public String getRes() {
                return res;
            }

            public void setRes(String res) {
                this.res = res;
            }
            public int getLen() {
                return len;
            }
            public void setLen(int len) {
                this.len = len;
            }
            int num;

            public String getResapp() {
                return resapp;
            }

            public void setResapp(String resapp) {
                this.resapp = resapp;
            }

            String resapp;
            int len;
            String res;
            @Override
            public int compareTo(Tmp o) {
                if(resapp.compareTo(o.resapp)==0)
                {
                    return o.len-this.len;
                }else {

                    return resapp.compareTo(o.resapp);
                }
            }
            Tmp(int num,int len,String string,String app)
            {
                this.res=string;
                this.len=len;
                this.num=num;
                this.resapp=app;
            }
        }
        String[] res = new String[nums.length];
        Tmp [] tmps=new Tmp[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = String.valueOf(nums[i]);
            if (res[i].length() > maxlen)
                maxlen = res[i].length();
        }

        for (int i = 0; i < nums.length; i++) {
            if(maxlen!=res[i].length())
            {
                nums[i] = (int) (nums[i] * Math.pow(10, maxlen - res[i].length()));
            }
            else {
                nums[i] = (int) (nums[i] * Math.pow(10, maxlen - res[i].length()));
            }
            tmps[i]=new Tmp(nums[i],res[i].length(),res[i],String.valueOf(nums[i]));
        }
        StringBuilder stringBuilder=new StringBuilder();
        Arrays.sort(tmps);
       for (int i=tmps.length-1;i>=0;i--)
       {
           stringBuilder.append(tmps[i].res);
       }
       return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Solution179 solution179=new Solution179();
       String string= solution179.largestNumber(new int []{74,21,33,51,77,51,9,60,5,56});
    }
}