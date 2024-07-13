// Extract subsequence in array..

import java.util.ArrayList;

public class IncludeExclude {
    public static void main(String[] args){
        String str = "abc";
        String newStr = "";
        int index = 0;
        ArrayList<String> newArr = new ArrayList<>();
        incExc(str,newStr,index,newArr);

        for(int i=0; i<newArr.size(); i++){
            System.out.println(newArr.get(i));
        }
    }



    static void incExc(String str, String newStr, int index, ArrayList<String> newArr){
        if(index == str.length()){
            newArr.add(newStr);
            return;
        }
        char ch = str.charAt(index);
        incExc(str,newStr+ch,index+1,newArr);
        incExc(str,newStr,index+1, newArr);
    }
}
