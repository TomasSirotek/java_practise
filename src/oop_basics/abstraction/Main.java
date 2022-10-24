package oop_basics.abstraction;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        NumberExtractor extractor = new NumberExtractor();
        EmailExtractor emailExtractor = new EmailExtractor();

        String path = "src/oop_basics/abstraction/data.txt";
       // extractor.prepAndSend(path);

        emailExtractor.prepAndSend(path);
    }
}
