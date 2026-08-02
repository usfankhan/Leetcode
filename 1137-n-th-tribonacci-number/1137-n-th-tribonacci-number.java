class Solution {
    public int tribonacci(int n) {
      int t0=0;
      int t1=1;
      int t2=1;
      if( n==1 || n==2)
        return 1;
      else if(n==0 ){
        return 0;
      }
      for(int i=3;i<=n;i++){
        int cur=t0+t1+t2;
        t0=t1;
        t1=t2;
        t2=cur;

      }
      return t2;
    }
}