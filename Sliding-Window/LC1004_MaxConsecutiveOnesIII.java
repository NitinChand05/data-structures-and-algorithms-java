/*
Problem: 1004. Max Consecutive Ones III
Topic: Sliding Window
Difficulty: Medium

Time Complexity: O(n)
Space Complexity: O(k)
*/
public class LC1004_MaxConsecutiveOnesIII {
     public static void main(String[] args) {
        int nums []={0,1,1,1,1,1,1,};
        int k = 3;
        int low = 0;
        int count = 0;
        int res =Integer.MIN_VALUE;
    
        for(int high = 0; high<nums.length; high++){
             if(nums[high]== 0){
                count++;
             }
             while(count>k ){
                if(nums[low]==0){
                    count--;
                }
                low++;
             }
             if(count<=k){
                int len = high-low+1;
                res = Math.max(len, res);
             }
        }
        System.out.println(res);

    }
}
