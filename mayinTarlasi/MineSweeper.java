import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class MineSweeper {
    int row,col,satir,sutun;
    int howManyMines,howManyCorrectGuessIsDone=0;
    int[][] map;
    String[][] board;
    Random random = new Random();
    boolean isGameOver=false;
    Scanner scanner = new Scanner (System.in);

    MineSweeper(int row, int col)
    {
        this.row=row;
        this.col =col;
        this.map = new int[row][col];
        this.board = new String[row][col];
    }

    private void print2DArray(int[][] array){
        for (int[] x : array)
        {
            for (int y : x)
            {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
    private void print2DArray(String[][] array){
        for (String[] x : array)
        {
            for (String y : x)
            {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }

    private void createMines()
    {
        
        howManyMines = row*col/4;
        int temp = howManyMines;

        while(howManyMines>0)
        {
            int randomRow = random.nextInt(row);
            int randomCol = random.nextInt(col);

            if (map[randomRow][randomCol] != 1 ){
                map[randomRow][randomCol]=1;
                howManyMines--;
            }
        } 

        howManyMines = temp;
    }

    private void fillBoard(){
        for (int i=0 ; i<row;i++){
            for(int j=0; j<col;j++){
                board[i][j] ="-";
            }
        }
    }

    private int countMineNeighbours(int satir, int sutun){

        int count = 0;

        //sol üst
        if (sutun-1>=0 && satir-1 >=0 )
        {
            if (mayinVarMi(satir-1,sutun-1))
            {
                count++;
            }
        }


        //üst

        if (satir-1 >=0 )
        {
            if (mayinVarMi(satir-1,sutun))
            {
                count++;
            }
        }

        //sag üst
        if (sutun+1<col && satir-1 >=0 )
        {
            if (mayinVarMi(satir-1,sutun+1))
            {
                count++;
            }
        }

        //sol
        if (sutun-1>=0)
        {
            if (mayinVarMi(satir,sutun-1))
            {
                count++;
            }
        }

        //sag
        if (sutun+1<col)
        {
            if (mayinVarMi(satir,sutun+1))
            {
                count++;
            }
        }

        //sol alt
        if (sutun-1>=0 && satir+1 <row)
        {
            if (mayinVarMi(satir+1,sutun-1))
            {
                count++;
            }
        }

        //alt
        if (satir+1 <row)
        {
            if (mayinVarMi(satir+1,sutun))
            {
                count++;
            }
        }

        //sag alt
        if (sutun+1<col && satir+1 <row)
        {
            if (mayinVarMi(satir+1,sutun+1))
            {
                count++;
            }
        }


        return count;

    }

    private boolean mayinVarMi(int satir,int sutun)
    {
        if (map[satir][sutun] == 1)
            return true;
        else
            return false;

    }

    private boolean isWin()
    {
        if ((row*col-howManyMines) == howManyCorrectGuessIsDone)
            return true;
        else
            return false;
    }
    public void run()
    {
        createMines();
        fillBoard();
        System.out.println("Mayınların Konumu");
        System.out.println("------------------");
        print2DArray(map);
        System.out.println("===================");

        System.out.println("Mayın Tarlası Oyununa Hoş Geldiniz !");


        while(!isGameOver){

            print2DArray(board);


            System.out.print("Satir giriniz : ");
            satir = scanner.nextInt();
            if (satir<0 || satir >row-1){
                System.out.println("Hatalı bir sayi girdiniz");
                continue;
            }
            System.out.print("Sütun giriniz : ");
            sutun=scanner.nextInt();
            if (sutun<0 || sutun >col-1){
                System.out.print("Hatalı bir sayi girdiniz");
                continue;
            }
            

            if (map[satir][sutun] ==1)
            {
                isGameOver=true;
                System.out.println("Game Over!!");
            }
            else
            {
                howManyCorrectGuessIsDone++;
                if (isWin())
                    break;
                int count  = countMineNeighbours(satir, sutun);
                board[satir][sutun] = Integer.toString(count);
            }


            System.out.println("===========================");

        }

        if (!isGameOver)
        {
            System.out.println("Oyunu Kazandınız!!");
        }
    }
    
}
