/*
Problem: 904. Fruit Into Baskets
Topic: Sliding Window
Difficulty: Medium

Time Complexity: O(n)
Space Complexity: O(k)
*/

import java.util.HashMap;

public class LC904_FruitIntoBaskets {

    public static void main(String [] args){
        int fruits [] ={1,1};
        int basket = 2 ;

        int low = 0;
        int res = Integer.MIN_VALUE;

        HashMap<Integer,Integer> map =new HashMap<>() ;

        
        for(int high =0 ; high<fruits.length ; high++){
            map.put(fruits[high], map.getOrDefault(fruits[high],0)+1);

            while(map.size()>basket){
                 map.put(fruits[low], map.getOrDefault(fruits[low],0)-1);

                 if(map.get(fruits[low])==0){
                    map.remove(fruits[low]);
                 }
                 low ++;
            }

            if(map.size() == basket || map.size()<basket){
                int len = high-low+1;
                res = Math.max(res,len);
            }

        }

System.out.println(res);

    }
}
