import java.util.ArrayList;
import java.util.List;

class Solution56 {
    public int[][] merge(int[][] intervals) {
        if(intervals.length==0)
            return new int[0][0];
        for (int i=0;i<intervals.length;i++)
        {
           for (int j=0;j<intervals.length-i-1;j++)
           {
             if(intervals[j][0]>intervals[j+1][0])
             {
                 int tmp1=intervals[j][0];
                 int tmp2=intervals[j][1];
                 intervals[j][0]=intervals[j+1][0];
                 intervals[j][1]=intervals[j+1][1];
                intervals[j+1][0]=tmp1;
                intervals[j+1][1]=tmp2;
             }
           }
        }
        int [] cur=new int [2];
        List<Integer> head=new ArrayList<>();
        List<Integer> tail=new ArrayList<>();
        cur[0]=intervals[0][0];
        cur[1]=intervals[0][1];
        for (int i=1;i<intervals.length;i++)
        {
            if(cur[1]>=intervals[i][0])
            {
                cur[0]=cur[0];
                cur[1]=Math.max(intervals[i][1],cur[1]);
            }else {
                head.add(cur[0]);
                tail.add(cur[1]);
                cur[0]=intervals[i][0];
                cur[1]=intervals[i][1];

            }
        }
        head.add(cur[0]);
        tail.add(cur[1]);
        int [][]res=new int[head.size()][2];
        for (int i=0;i<head.size();i++)
        {
            res[i][0]=head.get(i);
            res[i][1]=tail.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        Solution56 solution56=new Solution56();
        int[][] res=solution56.merge(new int [][]{{1,4},{5,5}});
    }
}