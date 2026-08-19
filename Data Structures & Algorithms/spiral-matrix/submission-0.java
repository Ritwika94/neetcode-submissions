class Solution {
    List<Integer>list =new ArrayList();
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int k=0;int c=0;
        while(k<m&& c< n){
            for(int i = c;i<n;i++){
                list.add(matrix[k][i]);
            }
            k++;
            for(int i = k;i<m;i++){
                list.add(matrix[i][n-1]);
            }
            n--;
            if(k<m){
                for(int i = n-1;i>=c;i--){
                    list.add(matrix[m-1][i]); 
                }
            }
            m--;
            if(c<n){
                for(int i=m-1;i>=k;i--){
                     list.add(matrix[i][c]); 
                }
            }
            c++;
        }

        return list;
        
    }
}
