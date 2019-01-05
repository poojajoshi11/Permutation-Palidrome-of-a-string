package random;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter a string to check if it is a permutation of a palindrome.");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(permutation(str));
    }

    public static boolean permutation(String str) {
        char letters[] = new char[str.length()];
        if (str.length() % 2 == 0) {
            
            str = str.toLowerCase();
            char arr[] = str.toCharArray();
            Arrays.sort(arr);
            str = String.valueOf(arr);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                while (ch == str.charAt(i)) {
                    count++;
                    i++;
                    if(str.length() == i)
                    {
                        break;
                    }
                }
                i--;
                if(count%2 != 0){
                    return false;
                }
                
                count = 0;
            }
            return true;
            
            

        } else {
            int ones = 0;
            int twos = 0;
            str = str.toLowerCase();
            char arr[] = str.toCharArray();
            Arrays.sort(arr);
            str = String.valueOf(arr);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                while (ch == str.charAt(i)) {
                    count++;
                    i++;
                    if(str.length() == i)
                    {
                        break;
                    }
                }
                i--;
                
                if (count == 1) {
                    ones++;
                } else if (count == 2) {
                    twos++;
                } else {
                    
                    return false;

                }
                count = 0;
            }
            
            if (ones== 1 && twos % 2 == 0) {
                return true;
            }
            return false;
        }
       
    }

}
