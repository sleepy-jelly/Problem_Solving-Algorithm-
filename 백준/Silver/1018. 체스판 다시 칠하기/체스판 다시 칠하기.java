import java.util.Scanner;


public class Main {


    public static boolean [][] chessBoard;        // about chessBoard info =
                                              // yxPosition & socre will be save  like this  [y][x];

    public static int answer = 64;


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int tmpY = sc.nextInt();
        int tmpX = sc.nextInt();

        chessBoard = new boolean[tmpY][tmpX];    //init chessBoard size  (x, y, max array size of score)  

        
        for(int i = 0; i <tmpY; i++){

            String squareLine = sc.next();     // squareLine 

            for(int j = 0; j < tmpX; j++){

                if(squareLine.charAt(j)=='W'){                  // if this position [y][x] has White 
                    chessBoard[i][j] = true;                    // put White data in the position(ture)  ture == White;
                }else{                                                        // else always this position [y][x] has Black.
                    chessBoard[i][j] = false;                                 // put position(false)  false == Black ;  
                }
            } 

        }



        int rowY = tmpY - 7;
        int rowX = tmpX - 7;

        for(int i = 0; i < rowY; i++){
            for(int j = 0 ; j < rowX; j++){
                findBestBoard(i, j);
            }
        }

        sc.close();
        System.out.println(answer);

    }

    static void findBestBoard(int y, int x) {


        int endY = y + 8;
        int endX = x + 8;

        int count = 0;

        boolean currentColor = chessBoard[y][x];	// init to first color of chessBoard[y][x];

        
        for(int i = y; i < endY; i++){
            for(int j = x; j < endX; j++){

                if(chessBoard[i][j]!=currentColor){     //current color is same as current color so we need to change to color 
                    count++;                            // when board need to change color count =  count +1;
                }
                currentColor = (!currentColor);         //next board postion should be different to currnet color so change 
            }
            currentColor = (!currentColor);              //next board postion should be different to currnet color so change 
        }
        
        //compare count score about two way to solve this situation.
        //1st way chessBoard[y][x] is the main color        (not change this position color)
        //2nd way chessBoard[y][x] is not the main color    (change this position color)

        count = Math.min(count, 64 - count);         //compared better option is count
        answer =  Math.min(answer, count);          // put the best option so far

    }
}