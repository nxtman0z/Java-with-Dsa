import java.util.*;
public class search{
    public static boolean searchElement(int matrix[][],int key){
        for(int i =0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                if(matrix[i][j]== key){
                    System.out.print("found at cell ("+i +" , "+ j +")");
                    return true;
                }
            }
            }
            System.out.println("key not found");
            return false;
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
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
        searchElement(matrix,5);
    }
}