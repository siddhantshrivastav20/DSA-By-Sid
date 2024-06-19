// Find first occurrence of an element in sorted array

public class FindFirstOccurrence {
    public static void main(String[] args){
        int[] arr = {10,20,35,35,40,54,67,77};
        int target = 35;
        int ans = firstOccurrence(arr,target);
        if(ans == -1){
            System.out.println("Element is not present in array.");
        }else{
            System.out.println("First occurance of target element is at index: "+ ans);
        }
    }

    static int firstOccurrence(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid] == target){
                ans = mid;
                end = mid-1;
            }else if(arr[mid] < target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;

    }
}
