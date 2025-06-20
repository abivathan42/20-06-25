public class GFG {

    // Method 1
    // To add character to a string
    public static String
    addCharToStringUsingSubString(String str, char c,
                                  int pos)
    {
        return str.substring(0, pos) + c
            + str.substring(pos);
    }

    // Method 2
    // Main driver method
    public static void main(String[] args)
    {
        // Custom input character and string
        String blogName = "GeeksforGeeks";
        char two = 'f';

        // Calling the Method 1 to
        // To add character to a string

        // Custom arguments
        String cblogName = addCharToStringUsingSubString(
            blogName, two, 5);

        // Print and display the above string on console
        System.out.println(cblogName);
    }
}
