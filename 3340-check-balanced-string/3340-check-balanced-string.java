class Solution {
    public boolean isBalanced(String num) {
        char ch[]=num.toCharArray();
        int even=0;
        int odd=0;
        for(int i=0;i<ch.length;i++){
            int n=Character.getNumericValue(ch[i]);
            if(i%2==0 || i==0)
                even=even+n;
            else
                odd=odd+n;
        }
        if(even==odd)
            return true;
        else
            return false;
    }
}