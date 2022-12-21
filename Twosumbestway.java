import java.util.Map;
class Solution {
    public int[] twoSum(int[] nums, int target)     {
       Map<Integer,Integer> mp = new HashMap();
       for(int i=0;i<nums.length;i++){
           Integer index_pos = mp.get(nums[i]);
           if(index_pos==null){
               mp.put(target-nums[i],i);
           }
           if(index_pos!=null){
               return new int[] {index_pos , i};
           }
       }

       return nums;
    }
}
