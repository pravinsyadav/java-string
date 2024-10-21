import java.util.*;

public class CompareString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fname = sc.nextLine();
        String lname = sc.nextLine();
        
        // here to compare 2 string we use '.compareTo' function and
        // it will check 1. s1 < s2  then it will return +ve value
        //               2. s1 == s2  then it will return zero
        //               3. s1 > s2  then it will return -ve value
        if(fname.compareTo(lname)==0){
            System.out.println("string are equal");
        }else{
            System.out.println("string are not equal");
        }


        //'substring' is used to take any part of the sentence
        //'substring' is used to take small part of the big sentence
        // in this we can give beginning index and ending index and it will print letters between them in this spaces also considered
        String sentence = "my name is pravin";
        String name = sentence.substring(11);
        System.out.println(name);
        sc.close();
    }
}
