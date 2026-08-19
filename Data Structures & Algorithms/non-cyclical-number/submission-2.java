class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hset =new HashSet();
        while(!hset.contains(n)){
            hset.add(n);
             n = compute(n);
            if(n==1){
                return true;
            }
        }
        return false;
        
    }
    public int compute(int n){
        ArrayList<Integer> list =new ArrayList();
        while(n!=0){
            int digit =n%10;
            list.add(digit);
            n=n/10;
            
        }
        int sum=0;
        for(int i =0;i< list.size();i++){
            System.out.println(list.get(i));
            sum= sum + list.get(i)* list.get(i);
        }
        return sum;
        
    }
}
