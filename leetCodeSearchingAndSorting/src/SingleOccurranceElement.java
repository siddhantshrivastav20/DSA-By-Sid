// https://leetcode.com/problems/single-element-in-a-sorted-array/description/


public class SingleOccurranceElement {
    public static void main(String[] args){
        int[] arr = {1,1,2,2,3};
        int ans = singleOccuranc(arr);
        System.out.println(ans);
    }

    static int singleOccuranc(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start+(end -start)/2;

            if(start == end){
                return arr[start];
            }

            int currValue = arr[mid];
            int leftValue = -1;
            if(mid-1 >= 0){
                leftValue = arr[mid-1];
            }

            int rightValue = -1;
            if(mid+1 < arr.length){
                rightValue = arr[mid+1];
            }

            if(currValue != leftValue && currValue != rightValue){
                return arr[mid];
            }

            if(currValue == leftValue){
                int currIdx = mid-1;
                if(currIdx %2==0){
                    start = mid +1;
                }else {
                    end = mid-1;
                }
            }

            if(currValue == rightValue){
                int currIdx = mid;
                if(currIdx %2==0){
                    start = mid +1;
                }else {
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
