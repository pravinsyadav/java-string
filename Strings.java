import java.util.*;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();              //input from user for string
        // System.out.println("your name is:" +name );

        // string concatenation
        String fname = sc.nextLine();
        String lname = sc.nextLine();
        String fullname = fname+" " +lname;      // string concatenation is used to add/merge two different srting 
        System.out.println(fullname);
        System.out.println(fullname.length());      //.length is used to count length of the string

        // we can also print individual letter present in the string using charAt function 
        // charAt----> this is the inbuild function in java
        for(int i = 0;i<fullname.length();i++){
            System.out.print(fullname.charAt(i));
        }
        sc.close();
    }

}
