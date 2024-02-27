import java.util.Scanner;

class matrix {
    public static void main(String args[]) {
        int row, col, i, j;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of rows");
        row = in.nextInt();

        System.out.println("Enter the number columns");
        col = in.nextInt();

        int a[][] = new int[row][col];
        int res[][] = new int[row][col];

        System.out.println("Enter the elements of matrix:");

        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++)
                a[i][j] = in.nextInt();

            System.out.println();
        }
        System.out.println("matrix is:-");

        for ( i= 0 ; i < row ; i++ )
        {
            for ( j=0 ; j < col ;j++ )
                System.out.print(res[i][j]+"\t");

            System.out.println();
        }
    }
}
