public class UniqueElement {
    public static void main(String[] args){
        int[] arr = {2,10,11,10,2,13,15,13,15};
//        int ans = findUniqueElement(arr);
//        System.out.println("Unique element is: "+ans);

        int ans2 = findUniqueElement2(arr);
        System.out.println(ans2);
    }


    static int findUniqueElement(int[] arr){

        int unique = -1;
        for(int i=0; i<arr.length; i++){
            int count = -1;
            for(int j=0; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count <= 1){
                unique = arr[i];
            }
        }
        return unique;

    }



    // Method- 2;
    static int findUniqueElement2(int[] arr){
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            ans = ans^arr[i];
        }
        return ans;
    }
}
