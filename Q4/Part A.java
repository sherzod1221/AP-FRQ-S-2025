public SumOrSameGame(int numRows, int numCols) {
    puzzle = new int[numRows][numCols];

    for (int r = 0; r <numRows; r++) {
        for (int c = 0; c < numCols; c++) {
            puzzle[r][c] = (int)(Math.random()*9) +1;
        }
    }
}
