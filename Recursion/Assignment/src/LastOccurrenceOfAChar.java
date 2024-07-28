// Find last occurrence in a string using recursion.

public class LastOccurrenceOfAChar {
    public static void main(String[] args){
        String str = "sadfhksjkfls";
        int index = 0;
        char target = 's';
        int finalAns = lastOccurrence(str, index, target);
        System.out.println(finalAns);

    }

    static int lastOccurrence(String str, int index, int target){
        int lastOccur = -1;
        int ans = solution(str,index, target, lastOccur);
        return ans;
    }

    static int solution(String str,int index, int target, int lastOccur){
        if(index == str.length()){
            return lastOccur;
        }

        char ch = str.charAt(index);
        if(ch == target){
            lastOccur = index;
        }
        return solution(str, index+1, target, lastOccur);
    }
}
