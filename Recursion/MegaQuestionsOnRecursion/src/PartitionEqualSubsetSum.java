public class PartitionEqualSubsetSum {
    public static void main(String[] args){
        int[] arr = {1,5,11,5};
        int idx = 0;
        boolean ans =partitionEqualSum(arr,idx);
        System.out.println(ans);
    }

    static boolean partitionEqualSum(int[] arr, int index){
        // Total sum of array
        int total = 0;
        int target = 0;
        for(int i =0; i<arr.length; i++){
            total = total+arr[i];
        }

        if(total%2 != 0){
            return false;
        }

        target = total/2;
        return solve(arr,target,index);

    }

    static boolean solve(int[] arr, int target, int index){
        if(target < 0 || index == arr.length) return false;
        if(target == 0) return true;
        boolean inc = solve(arr,target-arr[index],index+1);
        boolean exc = solve(arr, target, index+1);

        return inc || exc;

    }
}
