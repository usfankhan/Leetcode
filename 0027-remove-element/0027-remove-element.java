class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> lists=new ArrayList<>();
         

         for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                lists.add(nums[i]);
            }
         }
           for(int i=0;i<lists.size();i++){
            nums[i]=lists.get(i);
           }
         return lists.size();
    }
}