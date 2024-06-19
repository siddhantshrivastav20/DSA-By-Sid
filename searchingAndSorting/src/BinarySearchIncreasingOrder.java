// Binary Search algorithm..

public class BinarySearchIncreasingOrder {
    public static void main(String[] args){
        int[] arr = {10,20};
        int target = 30;
        int ans = binarySearchIncreasingOrder(arr,target);
        if(ans < 0){
            System.out.println("Element is not present in the array.");
        }else {
            System.out.println("Element is present at index: "+ ans);
        }

    }

    static int binarySearchIncreasingOrder(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == target){
                return mid;
            } else if (arr[mid] > target) {
                end = mid-1;
            }else if(arr[mid] < target){
                start = mid +1;
            }
        }
        return -1;
    }

}
