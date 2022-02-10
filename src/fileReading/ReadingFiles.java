package fileReading;

import java.io.*;

public class ReadingFiles {
    public static void main(String[] args) {
        // creating variable to read file
        File file = new File("text.txt");

        // using try catch to handle exceptions
        try(FileReader fileReader = new FileReader(file);
                BufferedReader bReader = new BufferedReader(fileReader);) {

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
        }
    }
}
