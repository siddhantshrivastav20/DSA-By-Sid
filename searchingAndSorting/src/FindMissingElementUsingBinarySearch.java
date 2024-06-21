// Find Missing value of the array using binary search..

public class FindMissingElementUsingBinarySearch {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8};
        int ans = findMissingElement(arr);
        System.out.println(ans);
    }

    static int findMissingElement(int[] arr){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;
            int diff = arr[mid]-mid;
            if(diff == 1){
                start = mid+1;
            }else{
                ans = mid;

                end = mid-1;
            }

            if(ans +1 == 0){
                return arr.length+1;
            }
        }
        return ans+1;
    }
}
