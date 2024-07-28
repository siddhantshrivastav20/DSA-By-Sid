public class AddStringUsingRecursion {
    public static void main(String[] args){
        String num1 = "123";
        String num2 = "456";
        int p1 = num1.length()-1;
        int p2 = num2.length()-1;
        int carry = 0;
        String ansStr = "";
        String ans = solution(num1,p1,num2,p2,carry,ansStr);
        String rev = reverse(ans);
        System.out.println(rev);
    }


    static String solution(String num1,int p1, String num2,int p2, int carry,String ansStr){
        // base case
        if(p1 <0 && p2 <0 ){
            ansStr = ansStr + carry;
            return ansStr;
        }
        // solve 1st problem
        int n1 = (p1>=0 ? num1.charAt(p1): 0);
        int n2 = (p2>=0 ? num2.charAt(p2): 0);
        int sum = n1+n2+carry;
        ansStr = ansStr + sum % 10;
        carry = sum/10;
        return solution(num1, p1-1, num2,p2-1, carry,ansStr);
    }

    static String reverse(String ans){
        String newStr = "";
        for (int i =ans.length()-1; i>=0; i--){
            char ch = ans.charAt(i);
            newStr = newStr+ch;
        }
        return newStr;
    }
}


