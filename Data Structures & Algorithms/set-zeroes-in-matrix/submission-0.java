class Solution {
    public void setZeroes(int[][] matrix) {
         ArrayList<Integer> list1 =new ArrayList();
         ArrayList<Integer> list2 =new ArrayList();

         for(int i =0;i<matrix.length;i++){
             for(int j =0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    list1.add(i);
                    list2.add(j);
                }
             }

         }

         for(int i=0;i<matrix.length;i++){
            if (list1.contains(i)){
                Arrays.fill(matrix[i],0);
            }
         }
         for(int i=0;i<matrix[0].length;i++){
            if (list2.contains(i)){
                for(int j =0;j<matrix.length;j++){
                    matrix[j][i]=0;
                }
            }
         }
        
    }
}
