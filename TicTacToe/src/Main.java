import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        char[][] board = new char[3][3];
        for(int row=0;row< board.length;row++)
        {
            for(int col=0;col<board[row].length;col++)
            {
                board[row][col]=' ';
            }
        }

        char player='X';
        boolean gameOver = false;
        Scanner sc=new Scanner(System.in);

        while(!gameOver)
        {
            printBoard(board);
            System.out.print("Player "+player+" enter: ");
            int row =sc.nextInt();
            int col =sc.nextInt();
            System.out.println();

            if(board[row][col]==' ')
            {
                board[row][col]=player;//Place the element
                gameOver==haveWon(board,player);
                if(gameOver)
                {
                    System.out.println("player "+player+" has won: ");
                }
            }
        }
    }
}