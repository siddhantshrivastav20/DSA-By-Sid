// Code for linear searching in 2D array....


public class LinearSearchIn2D {
    public static void main(String[] args){
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        int target = 11;
        boolean ans = linearSearch(arr,target);
        System.out.println(ans);
    }

    static boolean linearSearch(int[][] arr, int target){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] == target){
                    System.out.println("Index: ["+i+", "+j+"]");
                    return true;
                }
            }
        }
        return false;
    }
}
