// Find Last Occurrence of element in sorted element.


public class FindLastOccurrence {
    public static void main(String[] args){
        int[] arr = {10,20,35,35,40,54,67,77,77};
        int target = 35;
        int ans = lastOccurrence(arr,target);
        if(ans == -1){
            System.out.println("Element is not present in the array.");
        }else {
            System.out.println("Last occurrence of the element is at index: "+ans);
        }
    }


    static int lastOccurrence(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int ans = 0;

        while (start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid] == target){
                ans = mid;
                start = mid+1;
            }else if(arr[mid]<target){
                start = mid +1;
            }else {
                end = mid-1;
            }
        }
        return ans;

    }
}
