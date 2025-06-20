import java.io.*;

class java {
    public static void main(String[] args)
    {
        String data = "Hello, World!";

        try (FileOutputStream fos
             = new FileOutputStream("output.txt")) {
                 
            // Convert the string into bytes
            byte[] dataBytes = data.getBytes();

            // Write the bytes to the file
            fos.write(dataBytes);

            System.out.println(
                "Data successfully written to the file.");
        }
        catch (IOException e) {
            System.out.println("An error occurred: "
                               + e.getMessage());
        }
    }
}
