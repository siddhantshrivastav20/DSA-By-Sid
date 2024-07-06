// Implement 

public class BinarySearchUsingRecursion {
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50,60,70,80};
        int start = 0;
        int end = arr.length-1;
        int target = 60;

        int answer = binarySearch(arr, target, start, end);
        System.out.println(answer);
    }

    static int binarySearch(int[] arr,int target, int start, int end){
        if(start > end){
            return -1;
        }

        int mid = start+(end-start)/2;

        if(arr[mid] == target){
            return mid;
        }

        if(arr[mid] > target){
            return binarySearch(arr, target, start, mid-1);
        }else{
            start = mid+1;
            return binarySearch(arr, target, mid +1, end);
        }

    }
}
