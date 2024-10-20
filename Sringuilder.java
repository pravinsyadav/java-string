import java.util.*;

public class Sringuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("pravin");
        System.out.println(sb);

        //  char at index 0              'charAt' function give letter present at that index
        System.out.println(sb.charAt(0));

        // set char at index 0
        //'setCharAt' function is used to add new letter at any index by removing letter present at that index
        // it takes two parameters (index, letter that we want to add)

        sb.setCharAt(0, 's');
        System.out.println(sb);

        //'.insert' function is used to add letter at any index withot deleting previous letter present at that index
        sb.insert(5, 'p');
        System.out.println(sb);

        // we can delete any part in the strig by using '.delete' function
        sb.delete(4, 6);           // here 6 is non-inclusive means it will goes from 4 to 5 instead off 6
        System.out.println(sb);

        //now to add any letter at last index we use 'append' function
        sb.append("n");
        System.out.println(sb);
        System.out.println(sb.length());
    }
    
}