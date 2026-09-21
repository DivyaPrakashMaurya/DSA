class Solution {
    public int[][] generateMatrix(int n) {
        int matrix[][] = new int[n][n];
        
        int startRow = 0;
        int startCol = 0;
        int endRow = n -1;
        int endCol = n -1;

        int num = 1;

        while(startRow <= endRow && startCol <= endCol){
            // Right
            for(int i = startCol; i <= endCol; i++){
                matrix[startRow][i] = num++;
            }
            // Down
            for(int i = startRow + 1; i <= endRow; i++){
                matrix[i][endCol] = num++;
            }
            // Left
            if(startRow < endRow){
                for(int i = endCol-1; i>= startCol; i--){
                    matrix[endRow][i] = num++;
                }
            }
            // Up
            if(startCol < endCol){
                for(int i = endRow-1; i > startRow; i--){
                    matrix[i][startCol] = num++;
                }
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        return matrix;
    }
}