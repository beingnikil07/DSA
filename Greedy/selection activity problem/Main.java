/* Q: you are given 'n' activities with their start and end times .select the maximum number of activities that can
 * be performed by a single person,assuming that a person can only work on a single activity at a time .
 * Activities are sorted according to end time.
 * Example
 * start=[10,12,20]
 * end=[20,25,30]
 * answer=2(A0 and A2)
 */

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        //End time basis sorting  hai already 
        int maxAct=0;
        ArrayList<Integer> ans=new ArrayList<>();
        // first activity
        maxAct=1;
        ans.add(0);
        int lastEnd=end[0];
        for(int i=1;i<end.length;i++){
            if(start[i]>=lastEnd){
                //activity select
                maxAct++;
                ans.add(i);
                lastEnd=end[i];
            }
        }
        System.out.println("Maximum activities:"+maxAct);
        //to print
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();   //new line
    }
}
