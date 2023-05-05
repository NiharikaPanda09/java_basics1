import java.util.*;
public class count {
   static int Sum(int [][] matrix, int l1, int r1, int l2, int r2){
       int sum = 0;
       for(int i=l1; i <= l2; i++){
           for(int j = r1; j<= r2; j++){
               sum += matrix[i][j];
           }
       }

       return sum;
   }

   static void  FindPrefixSumMatrix(int[][] matrix){
       int r = matrix.length;
       int c = matrix[0].length;
       for(int i =0; i<r ; i++){
           for(int j = 1; j<c; j++){
               matrix[i][j] += matrix[i][j-1];
           }
       }
       for(int j=0; j<c; j++){
           for(int i=1; i<r; i++){
               matrix[i][j] += matrix[i-1][j];
           }
       }
   }

    static int Sum2(int [][] matrix, int l1, int r1, int l2, int r2){
       int ans =0;
       int sum =0, up=0, left=0, leftUp=0;

       FindPrefixSumMatrix(matrix);

       sum = matrix[l2][r2];
       if(r1 >= 1) {
           left = matrix[l2][r1 - 1];
       }
       if(l1 >= 1) {

           up = matrix[l1 - 1][r2];
       }
       if(l1 >=1 && r1>=1) {
           leftUp = matrix[l1 - 1][r1 - 1];
       }
         ans = sum - up - left + leftUp;


       return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int total = r * c;
        System.out.println("enter " + total + " num of elements");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("input matrix");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();


        System.out.println("rectangle sum is: "  + Sum(matrix,l1,r1,l2,r2));
        System.out.println("rectangle sum2 is: "  + Sum2(matrix,l1,r1,l2,r2));
    }
}
