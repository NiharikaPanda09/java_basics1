import java.util.*;
public class gCD {
//    static int gcd(int n1, int n2){
//        if(n2 == 0){
//            return n1;
//        }
//        return gcd(n2,n1%n2);
//    }
//    static int iGCD(int n1, int n2){
//        while(n1 % n2 != 0){
//            int rem = n1%n2;
//            n1 = n2;
//            n2 = rem;
//        }
//        return n2;
//    }
    static int findMax(int[] arr){
        int mx = Integer.MIN_VALUE;
     for(int i =0; i < arr.length; i++){
         if(arr[i] > mx){
             mx = arr[i];
         }
     }
     return mx;
    }
    static void BCountSort(int [] arr){
        int max = findMax(arr);
        int [] ct = new int[max+1];
        for(int i =0; i< arr.length; i++){
            ct[arr[i]]++;
        }
        int k =0;
        for(int i=0; i < ct.length; i++){
            for(int j=0; j<ct[i]; j++){
                arr[k++] =i;
            }
        }

    }
    static void Display(int [] ar){
        for(int val: ar){
            System.out.print(val + " ");
        }
        System.out.println();
    }
    static void countSort(int[] arr,int place){
        int n = arr.length;
        int[] output = new int[n];
        int [] ct = new int[10];
        for(int i =0; i< arr.length; i++){
            ct[(arr[i]/place)%10]++;
        }
        for(int i=1; i< ct.length; i++){
            ct[i] += ct[i-1];

        }
        for(int i=n-1;i>=0;i--){
            int idx = ct[(arr[i]/place)%10]-1;
            output[idx] =arr[i];
            ct[(arr[i]/place)%10]--;
        }
        for(int i=0;i<n;i++){
            arr[i] =output[i];
        }

    }
    static void RadixSort(int[] arr){
        int max = findMax(arr);
        for(int place=1;max/place >0; place*= 10){
            countSort(arr,place);
        }
    }

    public static void main(String[] args) {
    int[] arr={43,453,626,894,0,3};
    RadixSort(arr);
    Display(arr);


//        for(int i=1; i<20; i++){
//            if(n1%i == 0 && n2%i == 0){
//                gcd = i;
//
//            }
//        }


    }
}
