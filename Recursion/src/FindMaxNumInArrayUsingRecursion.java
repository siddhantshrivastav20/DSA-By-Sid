// find maximum using recursion in array.

public class FindMaxNumInArrayUsingRecursion {
    public static void main(String[] args){
        int[] arr = {23,24,444,34,54,76};
        int index = 0;
        int max = Integer.MIN_VALUE;
        int size = arr.length;
        int ans = maximumNumber(arr, index, max, size);
        System.out.println(ans);
    }

    static int maximumNumber(int[] arr, int index, int max, int size){
        if(index == size){
            return max;
        }

        if(arr[index] > max){
            max = arr[index];
        }
        int ans = maximumNumber(arr, index+1, max, size);
        return ans;
    }
}
