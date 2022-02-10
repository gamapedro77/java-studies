package filereading;

import java.io.*;

public class ReadingFiles {
    public static void main(String[] args) {
        // creating variable to read file
        File file = new File("text.txt");
        BufferedReader bReader = null;
        // using try catch to handle exceptions
        try {
            // fileReader creates a new object
            FileReader fileReader = new FileReader(file);
            // buffered reader loads the file on memory
            bReader = new BufferedReader(fileReader);

            // reads one line of the file and saves it on the variable
            String line = bReader.readLine();

            while(line != null) {
                // keep reading line by line and printing them
                System.out.println(line);
                line = bReader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bReader != null) {
                    bReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
