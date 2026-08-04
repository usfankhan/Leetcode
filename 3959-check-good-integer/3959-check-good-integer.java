class Solution {
    public boolean checkGoodInteger(int n) {
        int digitsum=0;
        int squareSum=0; 
        while(n!=0){
            int num=n%10;
            digitsum=digitsum+num;
            squareSum=squareSum+(num*num);
            n=n/10;
        }
        if(squareSum-digitsum>=50)
            return true;
        else
            return false;
    }
}