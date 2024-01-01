import java.io.*;
import java.util.*;

class File_read {
    public static void main(String[] args) throws IOException {
	File myFile = new File("aadi123.txt");

        // Check if the file exists before attempting to read it
        if (myFile.exists()) {
            Scanner sc = new Scanner(myFile);

            while (sc.hasNextLine()) {
                String Line = sc.nextLine();
                System.out.println(Line);
            }

            sc.close();
        } else {
            System.out.println("File not found.");
        }
    }
	
}
