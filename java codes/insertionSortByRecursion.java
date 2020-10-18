import java.util.Arrays;

public class insertionSortByRecursion {
    /* Recursive function to sort an Array usong Insertion sort */

    static void insertionSortByRecursion(int[] arr, int n){
        //base case
        if(n<=1)
            return;
        //sort first n-1 elements
        insertionSortByRecursion( arr,n-1 );

            //Now we insert last element at its correct position in sorted array
            int last = arr[n-1];
            int j = n-2;

        /* NOw we will move elements of arr[0...i-1], that are
        greater than key, to one position ahead of their current positon */

        while (j >= 0 && arr[j]>last) {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = last;
    }

    public static void main(String[] args)
    {
        int[] arr = {43,54,64,76,89,70};
        insertionSortByRecursion(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
