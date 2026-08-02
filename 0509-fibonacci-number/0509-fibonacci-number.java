class Solution {
    public int fib(int n) {
       if(n==0){
return 0;
        
       }
            else if (n==1 || n==2){

        return 1;

            }
        int n1=1;
        int n2=1;
        for(int i=3;i<=n;i++){
            int cur=n1+n2;
            n1=n2;
            n2=cur;
        }
        return n2;
    }
}