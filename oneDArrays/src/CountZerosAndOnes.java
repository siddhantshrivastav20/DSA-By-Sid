// Count 0s and 1s that are present in the array...


public class CountZerosAndOnes {
    public static void main(String[] args){
        int[] arr = {0,1,0,0,0,0,1,1,1,1,1,0,0};
        count0and1(arr);
    }

    static void count0and1(int[] arr){
        int ones = 0;
        int zeros = 0;
        for(int i =0; i<arr.length; i++){
            if(arr[i] == 0){
                zeros++;
            }else if(arr[i] == 1){
                ones++;
            }
        }
        System.out.println("0s are: "+ zeros);
        System.out.println("1s are: "+ ones);
    }
}
