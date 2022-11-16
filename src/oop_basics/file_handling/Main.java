package oop_basics.file_handling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static String path = "/Users/Tomas/Desktop/fileToRead.txt";

    public static void main(String[] args) {
        printFileContents();
         ddToFile("Suck me jin jang");
        addTextAtLine("Testik",2);
        printFileContents();
    }


    private static void addTextAtLine(String text,int lineNumber){
        try {
            String fileInput = "";
            int countLines = 0;
            FileReader reader = new FileReader(path);
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNext()) {
                fileInput += scanner.nextLine() + "\r\n";
                if(countLines == lineNumber){
                    fileInput += text + "\r\n";
                }
                countLines++;
            }
            reader.close();

            FileWriter fileWriter = new FileWriter(path);
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
        try {
            FileReader reader = new FileReader(path);
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
