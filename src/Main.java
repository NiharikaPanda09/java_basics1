

import java.util.*;



public class Main {



    static int[][] transpose(int[][] matrix, int r, int c) {
        int[][] ans = new int[c][r];

        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }
    static void transposeInplace(int[][] matrix, int r, int c){
        for(int i=0; i<c; i++){
            for(int j =i; j<r ; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    static void ReverseArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    static void Rotate(int[][]matrix, int n) {
        transposeInplace(matrix, n, n);
        for (int i = 0; i < n; i++) {
            ReverseArray(matrix[i]);
        }
    }





    static void PrintArray(int[][] matrix) {
       for(int i=0; i< matrix.length; i++){
           for(int j=0; j< matrix[i].length; j++){
               System.out.print(matrix[i][j]  +  " ");
           }
           System.out.println();
       }

}
static void SpecialTransverse(int[][] matrix, int r, int c){
        int TopRow =0, BottomRow = r-1, LeftColumn =0, RightColumn = c-1;
        int total =0;
        while(total < r*c){
            for(int j=LeftColumn; j<= RightColumn && total < r*c; j++){
                System.out.print(matrix[TopRow][j] +"  " );
                total++;
            }
            TopRow++;
            for(int i=TopRow; i<=BottomRow && total < r*c; i++){
                System.out.print(matrix[i][RightColumn] + "  ");
                total++;
            }
            RightColumn--;
            for(int j=RightColumn; j>=LeftColumn && total < r*c; j--) {
                System.out.print(matrix[BottomRow][j] + " ");
                total++;
            }
            BottomRow--;

            for(int i=BottomRow; i>=TopRow && total < r*c; i--){
                System.out.print(matrix[i][LeftColumn] + " ");
                total++;
            }
            LeftColumn++;
        }
}



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of rows and columns");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][] matrix = new int[r][c];
        int total = r*c;
        System.out.println("enter " + total + " num of elements");
        for(int i=0; i< r; i++){
            for(int j=0; j<c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("input matrix");
        PrintArray(matrix);


        System.out.println("transverse of matrix");
        SpecialTransverse(matrix,r,c);

        //int[][] ans = transpose(matrix,r,c);


    }
}




