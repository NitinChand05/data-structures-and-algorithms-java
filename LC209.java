public class LC209{
    public static void main(String [] args){
        int nums []={2,3,1,2,4,3};
        int target = 7;

        int high = 0;
        int low = 0;
        int res = Integer.MAX_VALUE;
        int sum = 0;

        while(high<nums.length){


            sum = sum + nums[high];

            while(sum >= target ){
                int length = high-low+1;
                res = Math.min(res,length);
                sum = sum-nums[low];
                low ++;


            }
            high ++;

        }
        System.out.println(res);

    }
}
