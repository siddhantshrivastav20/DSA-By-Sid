// https://leetcode.com/problems/peak-index-in-a-mountain-array/


public class PeekMountainElementIndexInArray {
    public static void main(String[] args){
        int[] arr = {0,2,1,0};
        int ans = peekMountainElement(arr);
        System.out.println(ans);

    }

    static int peekMountainElement(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end -start)/2;
            if(arr[mid] > arr[mid+1] && arr[mid]>arr[mid-1]){
                return arr[mid];
            }else if(arr[mid]<arr[mid+1]){
                start = mid;
            }else if(arr[mid]<arr[mid-1]){
                end = mid;
            }
        }return start;
    }
}
