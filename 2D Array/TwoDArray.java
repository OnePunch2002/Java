import java.util.*;

public class TwoDArray{
    public static void main(String args[]) {
        
        Scanner x = new Scanner(System.in);
//inputs
        System.out.println("Enter no. of rows");
        int row = x.nextInt();

        System.out.println("Enter no. of columns");
        int col = x.nextInt();

        int [][] num = new int [row][col];

//outputs
        for(int i=0 ; i<row ; i++) {
            for(int j=0 ; j<col ; j++) {
                num[i][j] = x.nextInt();
            }
            System.out.println("a");
        }

        for(int i=0 ; i<row ; i++) {
            for(int j=0 ; j<col ; j++) {
                System.out.println(num[i][j] + " ");
            }
            System.out.println("a");
        }
    }
}
