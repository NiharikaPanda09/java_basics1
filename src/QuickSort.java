public class QuickSort {
    static void displayArr(int[] arr){
        for (int val: arr){
            System.out.print(val + " ");
        }
    }
    static void swap(int []arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = arr[temp];
    }
    static int partition(int [] arr,int st,int end){
        int pivot = arr[st];
        int ct = 0;
        for(int i = st+1; i <= end ; i++){
            if(arr[i] <= pivot) ct++;
        }
        int pivotIdx = st+ct;
        swap(arr,st,pivotIdx);
        int i = st,j=end;
        while(i < pivotIdx && j > pivotIdx) {
            while (arr[i] <= pivot) i++;
            while (arr[j] > pivot) j--;
            if (i < pivotIdx && j > pivotIdx) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        return pivotIdx;
    }

    static void quickSort(int[] arr,int st,int end){
        if(st >= end) return;
        int pt = partition(arr,st,end);
        quickSort(arr,st,pt-1);
        quickSort(arr,pt+1,end);

    }
    public static void main(String[] args) {
        int [] arr = {6,3,5,2,4};
        System.out.println("Array before sorting");
       displayArr(arr);
        System.out.println();
        quickSort(arr,0, (arr.length)-1);

        System.out.println("Array after sorting ");
        displayArr(arr);
    }
}
