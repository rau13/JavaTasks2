package Arrays_and_Algorithms;

public class Sort_Algorithms {
    public static void main(String[] args){
        int [] arr = {4,8,9,1,7,5,0};
        int n = 7;
        QuickSort(arr,0,n-1 );
        printArr(arr,n);
    }
    static void QuickSort(int[] arr, int l, int r){
        if (l>=r) return;
        int i = l, j = r;
        int m = (i+j)/2;
        while(i<j){
            while(j<m && arr[i]<=arr[m]) i++;
            while(j>m && arr[j]>=arr[m]) j--;
            if(i<j){
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                if(i==m) m = j;
                else if (j==m) i = m;
            }
        }
        QuickSort(arr,l,m);
        QuickSort(arr,m+1,r);
    }
    static void SelectiveSort(int[] arr, int n ){
        for(int i =1; i<n; i++){
            int k = arr[i];
            int j = i-1;
            while(j>=0 && k<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = k;
        }
    }
    static void printArr(int arr[], int n){
        for(int i = 0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
