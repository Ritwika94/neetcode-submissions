class Solution {
    double k =0;
    public double myPow(double x, int n) {
        k=x;
        if(n<0){
            x=1/x;
            n=-n;

        }
        
        
           return pow( x,n);  
        
    }
    public double pow( double val,int n) {
        if(n==0)
        return 1.0;
        double pow1 = pow(val,n/2);
        if(n%2 ==0){
            return pow1*pow1;
        }
        else {
            return pow1*pow1*val;
        }
         
       
    }
}
