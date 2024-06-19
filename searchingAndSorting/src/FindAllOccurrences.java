// Find all occurrences of element in sorted array.

public class FindAllOccurrences {
    public static void main(String[] args){
        int[] arr = {35,35,40,45,60,60,60,60,70};
        int target = 60;
        int ans = allOccurrences(arr,target);
        if(ans == -1){
            System.out.println("Element is not present in array:");
        }else{
            System.out.println("Total Occurrence of element in array: "+ans);
        }
    }


    static int allOccurrences(int[] arr, int target){
        int start =0;
        int end = arr.length-1;
        int count = -1;

        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid] == target){
                for(int i=mid; i<=end; i++){
                    if(arr[mid] == arr[i]){
                        count++;
                    }
                }
                for(int i=mid; i>=start; i--){
                    if(arr[mid] == arr[i]){
                        count++;
                    }
                }
                return count;
            }else if(arr[mid]<target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }return -1;
    }
}
