class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> a=new ArrayList<>();
        Arrays.sort(nums);
        int st=nums[0];
        st++;
        for(int i=1;i<nums.length;i++){
            if(st!=nums[i]){
                a.add(st);
                i--;
            }
            st++;
        }
        return a;
    }
}