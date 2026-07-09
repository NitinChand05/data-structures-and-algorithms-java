/*
Problem: 03.  Longest Substring Without Repeating Characters
Topic: Sliding Window
Difficulty: Medium

Time Complexity: O(n)
Space Complexity: O(k)
*/

import java.util.HashMap;
public class LC03 {

    public static void main(String[] args) {
        String s = "pwwkew";
        int low = 0;
        int res =Integer.MIN_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int high = 0; high < s.length(); high++) {
            char ch = s.charAt(high);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            while (map.get(ch) > 1) {
                char c = s.charAt(low);
                map.put(c, map.getOrDefault(c, 0) - 1);
                if(map.get(c)==0){
                    map.remove(c);
                }
                low++;

            }
            if(map.get(ch)==1){
                int len = map.size();
                res = Math.max(len, res);

            }
        }
        if(res==Integer.MIN_VALUE){
            System.out.println(0);
            
        }else{
                    System.out.println(res);

        }
    }

}

