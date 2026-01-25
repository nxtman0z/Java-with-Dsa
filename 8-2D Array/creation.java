import java.util.*;
public class creation{
    public static void main(String[] args) {
        int matrix[][] = new int[5][5];
        Scanner sc = new Scanner(System.in);
        int n = matrix.length,m = matrix[0].length;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("2D array is :");
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}