import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> hashs=new HashMap<>();
        List<Integer> lists=new ArrayList<>();
        for(int n:nums){
            hashs.put(n,hashs.getOrDefault(n,0)+1);
            if(hashs.get(n)>(nums.length/3)){
                if(!lists.contains(n))
                    lists.add(n);
            }
               
        }
        return lists;
    }
}