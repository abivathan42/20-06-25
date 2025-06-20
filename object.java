public class GFG {

    // Method 1
    // To add character to string
    public static String addCharToString(String str, char c,
                                         int pos)
    {

        // Creating an object of StringBuffer class
        StringBuffer stringBuffer = new StringBuffer(str);

        // insert() method where position of character to be
        // inserted is specified as in arguments
        stringBuffer.insert(pos, c);

        // Return the updated string
        // Concatenated string
        return stringBuffer.toString();
    }

    // Method 2
    // Main driver method
    public static void main(String[] args)
    {

        // Input string and character
        String blogName = "GeeksforGeeks";
        char two = 'f';

        // Calling the method 1 to
        // add character to a string

        // Custom string, character and position passed
        String cblogName
            = addCharToString(blogName, two, 5);

        // Print and display th above string
        System.out.println(cblogName);
    }
}
