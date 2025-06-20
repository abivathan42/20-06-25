import java.util.*;

// Driver Class
class GFG {
    public static void main(String[] args)
    {
        String s = "java";
        String ans = "";
        // using a for loop to iterate in the string
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            // checking for space in the string
            if (temp != ' ') {
                // checking if the character is already
                // present in the new String if not adding
                // the character to the new string
                if (ans.indexOf(temp) <= -1) {
                    ans = ans + temp;
                }
            }
            // if there is a space adding that to the string
            else {
                ans = ans + ' ';
            }
        }
        // using trim function to remove if any leading and
        // trailing space are there
        ans = ans.trim();
        System.out.println("Output : " + ans);
    }
}
