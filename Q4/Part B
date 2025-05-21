public boolean clearPair(int row, int col){
    int value = puzzle[row][col];

    for (int r = row; r<puzzle.length; r++){
        int startCol;
        if(r == row) {
            startCol = col +1;
        }
        else {
            startCol = 0;
        }

        for (int c = startCol; c<puzzle[0].length;c++){
            int otherValue = puzzle[r][c];

            if (otherValue != 0 && (otherValue == value || otherValue + value == 10)) {
                puzzle[row][col] = 0;
                puzzle[r][c] = 0;
                return true;
            }
        }
    }
    return false;
}
