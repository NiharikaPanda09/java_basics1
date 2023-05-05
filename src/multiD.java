import java.util.*;
public class multiD {

    static void multi(int[][]a, int r1, int c1, int [][]b, int r2, int c2 ){
        if(c1!=r2){
            System.out.println(" wrong input - addition not possible");
            return;
        }
        int[][]  mul = new int[r1][c2];
        for(int i=0; i<r1; i++){
            for(int j =0; j<c2; j++){
                for(int k= 0; k < c1; k++){

                    mul[i][j] += (a[i][k] * b[k][j]);
                }

            }
        }
        System.out.println(" multiplication is");
        printMD(mul);
    }
    static void printMD(int[][]arr){

        for(int i=0;i< arr.length; i++){
            for(int j=0; j< arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number of rows");
        int r1 = sc.nextInt();

        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];
        System.out.println(" enter " + r1*c1 + " of elements");

        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter the number of row2 and col2");
        int r2 = sc.nextInt();

        int c2 = sc.nextInt();
        int[][] b = new int[r2][c2];
        System.out.println(" enter " + r2*c2 + " of elements");

        for(int i=0; i<r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("matrix 1");
        printMD(a);
        System.out.println("matrix 2");
        printMD(b);
      //  sum(a,r1,c1,b,r2,c2);
        multi(a,r1,c1,b,r2,c2);

       // int[][] arr = new int[2][3];
      //  int[][] arr2 ={{1,5,6},{2,4,5}};
      //  printMD(arr2);

    }
}



