package oop_basics.file_handling;

import java.io.*;
import java.util.Scanner;

public class Main {

    private static final String path = "/Users/Tomas/Desktop/fileToRead.txt";

    public static void main(String[] args) {
        printFileContents();
        // addToFile("Suck me jin jang");
      //  addTextAtLine("Testik",4);
       // printFileContents();
    }


    private static void addTextAtLine(String text,int lineNumber){
        try {
            StringBuilder fileInput = new StringBuilder();
            int countLines = 0;
            FileReader reader = new FileReader(path);
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNext()) {
                fileInput.append(scanner.nextLine()).append("\r\n");
                if(countLines == lineNumber){
                    fileInput.append(text).append("\r\n");
                }
                countLines++;
            }
            reader.close();

            FileWriter fileWriter = new FileWriter(path,true);
            fileWriter.append(text);
            fileWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    private static void addToFile(String textToInput) {
        try {
            FileWriter fileWriter = new FileWriter(path,true);
            fileWriter.append(textToInput + "\r\n");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    private static void printFileContents() {
        System.out.println("----------");



        try ( FileReader reader = new FileReader(path);
              BufferedReader bufferedReader1 = new BufferedReader(reader)){

            String line;
            while ((line  = bufferedReader1.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
