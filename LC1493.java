/*
Problem: 1004.  Longest Subarray of 1's After Deleting One Element
Topic: Sliding Window
Difficulty: Medium

Time Complexity: O(n)
Space Complexity: O(k)
*/
public class LC1493 {

    public static void main(String[] args) {
        int nums[]={0,1,1,1,0,1,1,0,1};
        int low = 0;
        int count =0;
        int res = Integer.MIN_VALUE;
        for(int high =0 ; high<nums.length;high++){
            if(nums[high]==0){
                count++;
            }
            while(count>1){
                if(nums[low]==0){
                    count--;
                }
                low++;
            }
            if(count<=1){
                int len = high-low+1;
                res = Math.max(len, res);
                
            }
        }
        System.out.println(res-1);
    }
}
