class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        if (matrix == null || matrix.length == 0) {
            return list;
        }

        //right, down, left, up
        while(startRow <= endRow && startCol <= endCol){
        for(int i = startCol; i <= endCol; i++){
            list.add(matrix[startRow][i]);
        }
        for(int i = startRow+1; i <= endRow; i++){
            list.add(matrix[i][endCol]);
        }
        if( startRow < endRow){
            for(int i = endCol-1; i >= startCol; i--){
              list.add(matrix[endRow][i]);
            }
        }
        if( startCol < endCol){
            for(int i = endRow-1; i>= startRow+1; i--){
             list.add(matrix[i][startCol]);
            }
        }
        startRow++;
        startCol++;
        endRow--;
        endCol--;
        }

        return list;
    }
}