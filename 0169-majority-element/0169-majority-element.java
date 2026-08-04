class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hashs=new HashMap<>();

        for(int num:nums){
            hashs.put(num,(hashs.getOrDefault(num,0))+1);
            if(hashs.get(num)>nums.length/2)
                return num;
        }
        return 0;
    }
}