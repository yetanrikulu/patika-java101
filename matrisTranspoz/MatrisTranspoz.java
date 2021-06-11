public class MatrisTranspoz {

    public static void main(String[] args) {

        int[][] matris = {{2,3,4},{5,6,4}};
        
        int [][] transpoz = new int [3][2];

        for (int i = 0 ; i < matris.length ; i++)
        {
            for(int j = 0 ; j< matris[i].length ; j++ )
            {
                transpoz [j][i] = matris [i][j];
            }
        }

        System.out.println("Transpoze:");
        for (int i = 0;i<transpoz.length;i++)
        {
            for (int j=0;j<transpoz[i].length;j++)
            {
                System.out.print(transpoz[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    
}
