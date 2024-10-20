import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");

        for(int i = 0; i<sb.length()/2; i++){             // this will start from index zero and go till half of the length of string
            int front = i;              
            int back = sb.length()-1-i;    // 5-1-0 = 4               

            char frontChar = sb.charAt(front);     //here we taken index present at front position
            char backChar = sb.charAt(back);        // here we taken index present at back position

            sb.setCharAt(front, backChar);            // here we replaced the characters 
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);

    }
}
