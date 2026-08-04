class Solution {
    public List<Integer> findMissingElements(int[] nums) {
       Arrays.sort(nums);
       int a=nums[0];
       int c=nums[nums.length-1];
       List<Integer> lists=new ArrayList<>();
       List<Integer> liste=new ArrayList<>();
       for(int num:nums)
            lists.add(num);
    
        while(a<c){
            if(!lists.contains(++a)){
                liste.add(a);
            }
        }
        return liste;
       
    }
}