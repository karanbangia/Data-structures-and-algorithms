class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> al=new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)return al;
        int k=0;
        int l=0;
        int last_row=matrix.length-1;
        int last_col=matrix[0].length-1;
        
        while(k<=last_row && l<=last_col)
        {
            for(int i=l;i<=last_col;i++)
            {
                al.add(matrix[k][i]);
            }
            k++;
            for(int i=k;i<=last_row;i++)
            {
                al.add(matrix[i][last_col]);
            }
            last_col--;
            if(k<=last_row)
            {
                for(int i=last_col;i>=l;i--)
                {
                    al.add(matrix[last_row][i]);
                }
                last_row--;
            }
            if(l<=last_col)
            {
                for(int i=last_row;i>=k;i--)
                {
                    al.add(matrix[i][l]);
                }
                l++;
            }
                
        }
        return al;
        
    }
}