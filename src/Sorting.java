public class Sorting {
    //    static void bubbleSort(int[]a){
//        int n = a.length;
//        for(int i =0; i<n-1; i++){
//            Boolean flag = false;
//            for(int j =0; j<(n-i-1); j++){
//                if(a[j] > a[j+1]){
//                    int temp= a[j];
//                    a[j] = a[j+1];
//                    a[j+1] = temp;
//                    flag = true;
//                }
//
//            }
//            if(flag == false)
//                return;
//        }
//    }
//    static void SelectionSort(int[]a){
//        int n = a.length;
//        for(int i =0; i<n-1; i++){
//            int min_index = i;
//            for(int j =i+1; j<n; j++){
//                if(a[j] < a[min_index]){
//                    min_index = j;
//                }
//            }
//            int temp = a[i];
//            a[i] = a[min_index];
//            a[min_index] = temp;
//        }
//    }
//    static void InsertionSort(int[] a) {
//        int n = a.length;
//        for (int i = 1; i < n; i++) {
//            int j = i;
//            while (j > 0 && a[j] < a[j - 1]) {
//                int temp = a[j];
//                a[j] = a[j - 1];
//                a[j - 1] = temp;
//                j--;
//            }
//        }
//
//    }

    static void MoveZero(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] == 0 && a[j + 1] != 0) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;


                }
            }
        }

    }

    static void sortFruits(String[] fruits) {

        int n = fruits.length;
        for (int i = 0; i < n - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (fruits[j].compareTo(fruits[min_index]) < 0) {
                    min_index = j;
                }
            }
            String temp = fruits[i];
            fruits[i] = fruits[min_index];
            fruits[min_index] = temp;
        }
    }

    public static void main(String[] args) {
        String[] fruits = {"apple", "kiwi", "pineapple", "mango"};
        sortFruits(fruits);
        for (String val : fruits) {
            System.out.println(val + " ");
        }
    }
}

