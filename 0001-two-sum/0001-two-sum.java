class Solution {
    public int[] twoSum(int[] nums, int target) {
             
             HashMap<Integer,Integer> hashs=new HashMap();
             
             for(int i=0;i<nums.length;i++){
                int diff=target-nums[i];
                if(hashs.containsKey(diff)){
                    return new int[]{hashs.get(diff),i};
                }
                hashs.put(nums[i],i);
             }
             return new int[]{};
           }
        }