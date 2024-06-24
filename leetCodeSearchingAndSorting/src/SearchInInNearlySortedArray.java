//Given a sorted array arr[] of size N, some elements of array are moved to either of the adjacent positions,
// i.e., arr[i] may be present at arr[i+1] or arr[i-1] i.e. arr[i] can only be swapped with either arr[i+1]
// or arr[i-1]. The task is to search for an element in this array.
// Input: arr[] = {10, 3, 40, 20, 50, 80, 70), key = 40

// Output: 2
// Explanation: Output is index of 40 in given array i.e. 2
// Input: arr[] = {10, 3, 40, 20, 50, 80, 70), key = 90
 // Output: -1
// Explanation: -1 is returned to indicate the element is not present



public class SearchInInNearlySortedArray {
    public static void main(String[] args){
        int[] arr = {10, 3, 40, 20, 50, 80, 70};
        int key = 70;
        int ans = nearlySorted(arr,key);
        System.out.println(ans);
    }

    static int nearlySorted(int[] arr, int key){
        int start = 0;
        int end = arr.length-1;
        while (start<= end){
            int mid = start+(end-start)/2;
            if(arr[mid] == key){
                return mid;
            }else if (mid > 0 && arr[mid-1] == key ){
                return mid-1;
            }else if(mid<arr.length-1 && arr[mid+1] == key){
                return mid +1;
            }else if(arr[mid]<key){
                start = mid+2;
            }else {
                end = mid-2;
            }
        }
        return -1;
    }
}
