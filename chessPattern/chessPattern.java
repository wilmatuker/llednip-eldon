class chessPattern {
    public static void main(String args[]) {
        char[][] board = new char[8][8];
        
        //rooks
        board[7][0] = '♖';
        board[7][7] = '♖';
        board[0][0] = '♜';
        board[0][7] = '♜';
        
        //knights
        board[7][1] = '♘';
        board[7][6] = '♘';
        board[0][1] = '♞';
        board[0][6] = '♞';
        
        //bishops
        board[7][2] = '♗';
        board[7][5] = '♗';
        board[0][2] = '♝';
        board[0][5] = '♝';
        
        //queens
        board[7][3] = '♕';
        board[0][3] = '♛';
        
        //kings
        board[7][4] = '♔';
        board[0][4] = '♚';
        
        //checker pattern
        for (int r = 2; r < 5; r++) {
            for (int c = 0; c < 8; c ++) {
                if(c % 2 == 0) {
                    System.out.print('□');
                } else {
                    System.out.print('■');
                }
            }
        }

        for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {
                System.out.print(board[r][c]);
            }
            System.out.println("");
        }
    }
}
