// Binary Search on Decreasing Order array

public class BinarySearchDecresingOrder {
    public static void main(String[] args){
        int[] arr = {50,40,30,20,10};
        int target = 50;

        int ans = binarySearchSolution(arr,target);
        if(ans == -1){
            System.out.println("Element is not present in the array");
        }else{
            System.out.println("Element is present at index: "+ans);
        }
    }

    static int binarySearchSolution(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return -1;
    }
}
