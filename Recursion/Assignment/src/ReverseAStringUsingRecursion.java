public class ReverseAStringUsingRecursion {
    public static void main(String[] args){
        String str = "siddhant";
        int index = str.length()-1;
        String revStr = "";
        String ans = reverseString(str,index,revStr);
        System.out.println(ans);
    }

    static String reverseString(String str, int index, String revStr){
        if(index<0){
            return revStr;
        }
        char ch = str.charAt(index);
        revStr = revStr + ch;
        return reverseString(str, index-1, revStr);
    }
}
