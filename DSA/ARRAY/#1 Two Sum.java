
import java.util.HashMap;

// Using Brute Force
/*class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0 ;i<nums.length ;i++){
            for (int j=i+1 ; j<nums.length ;j++){
                if (target ==nums[i]+nums[j]){
                    return new int[]{i,j} ;
                }
            }

        }
        return new int []{}; 
    }
}
*/

// Using Hash Tabble
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map =new HashMap<>();
      
        for (int i=0 ;i<nums.length ;i++){
            int remain=target-nums[i] ;
            if (map.containsKey(remain)){
                return new int []{i,map.get(remain)}  ;
            }
            else {
            map.put(nums[i],i);

            }
        }

        return new int []{} ;

    }
}