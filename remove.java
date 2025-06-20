class GfG {

    // Function to remove the first and
    // the last character of a string
    static String removeFirstandLast(String str) {

        // Creating a StringBuffer object
        StringBuffer sb = new StringBuffer(str);

        // Removing the last character
        // of a string
        sb.delete(str.length() - 1, str.length());

        // Removing the first character
        // of a string
        sb.delete(0, 1);

        // Converting StringBuffer into
        // string & return modified string
        return sb.toString();
    }

    public static void main(String args[]) {
        
        // Given String str
        String str = "java";

        // Print the modified string
        System.out.println(removeFirstandLast(str));
    }
}
