public class HouseRobber {
    public static void main(String[] args){
        int[] arr = {10,2,4,23};
        int index = 0;
        int ans = maxRobbery(arr, index);
        System.out.println(ans);

    }

    static int maxRobbery(int[] arr, int index){
        if(index >= arr.length) {
            return 0;
        }
        int includeAns = arr[index] + maxRobbery(arr, index+2);
        int excludeAns = maxRobbery(arr, index + 1);
        int maximum = Math.max(includeAns,excludeAns);
        return maximum;
    }
}
