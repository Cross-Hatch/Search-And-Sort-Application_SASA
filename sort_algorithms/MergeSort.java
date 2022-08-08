package sort_algorithms;

public class MergeSort {
    
    public static void main(String[]args){
        int[] array = {20, 35, -15, 7, 55, 1, -22};

        mergesort(array, 0, array.length);

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
    public static void mergesort(int[] input, int start, int end){

        //For temp arrays with only one element
        if(end - start < 2){
            return;
        }
        int mid = (start + end)/2;

        mergesort(input, start, mid);
        mergesort(input, mid, end);
        merge(input,start, mid, end);
    }
    public static void merge(int[] input, int start, int mid, int end){
        //This is to check if the last element in the left partition is less than the first element in the right which is also the mid
        if(input [mid-1] <= input[mid]){
            return;
        }

        int i = start;
        int j = mid;
        int tempInd = 0;

        int[] tempArray = new int[end-start];

        while( i < mid && j < end){
            tempArray[tempInd++] = input[i] <= input[j] ? input[i++] : input[j++];

        }
        System.arraycopy(input, i , input, start + tempInd, mid -i);
        System.arraycopy(tempArray, 0, input, start, tempInd);
    }
}
