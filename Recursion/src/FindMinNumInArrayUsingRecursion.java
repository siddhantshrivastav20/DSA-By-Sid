// Find minimum value from the given index.

public class FindMinNumInArrayUsingRecursion {
    public static void main(String[] args){
        int[] arr = {10,23,534,23,23,22};
        int min = Integer.MAX_VALUE;
        int index = 0;
        int size = arr.length;

        System.out.println(minimumNumber(arr, size, index, min));
    }

    static int minimumNumber(int[] arr, int size, int index, int min){
        if(index == size){
            return  min;
        }
        if(arr[index] < min){
            min = arr[index];
        }
        int ans = minimumNumber(arr, size, index+1, min);
        return ans;
    }
}
