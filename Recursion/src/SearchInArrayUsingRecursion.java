// Find target element in array using recursion.

public class SearchInArrayUsingRecursion {
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50,60};
        int target = 10;
        int size = arr.length;
        int index = 0;
        boolean ans = searchInArray(arr,target,size,index);
        System.out.println(ans);
    }

    static boolean searchInArray(int[] arr,int target, int size, int index){
        if(index == size){
            return false;
        }

        if(arr[index] == target){
            return true;
        }

        boolean ans = searchInArray(arr, target, size,index+1);
        return ans;

    }
}
