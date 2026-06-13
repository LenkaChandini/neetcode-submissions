class NumMatrix {
    int[][] psum;
    int n;
    int m;
    public NumMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        psum = matrix;
        for(int i=1; i<n; i++){
            for(int j=0; j<m; j++){
                psum[i][j] += psum[i-1][j];
            }
        }

        for(int i=0; i<n; i++){
            for(int j=1; j<m; j++){
                psum[i][j] += psum[i][j-1];
            }
        }

        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         System.out.print(psum[i][j]+" ");
        //     }
        //     System.out.println();
        // }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int res = psum[row2][col2];
        int ext = 0;
        if(row1 != 0 && col1 != 0){
            ext += psum[row1-1][col1-1];
        }
        if(row1 != 0){
            ext -= psum[row1-1][col2];
        }
        if(col1 != 0){
            ext -= psum[row2][col1-1];
        }

        return res+ext;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */

