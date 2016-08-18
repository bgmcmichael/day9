package tiyinc.noobs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by fenji on 8/18/2016.
 */
public class Day9Lecture {
    public static void main(String[] args) {
        Day9Lecture myLecture = new Day9Lecture();
        System.out.println("running");

        myLecture.testWriteFile();
        myLecture.testReadFile();
    }

    public void testReadFile (){
        try {
            File testFile = new File("src/tiyinc/noobs/Day9Lecture.java");
            Scanner scan = new Scanner(testFile);
            while (scan.hasNext()) {
                String currentLine = scan.nextLine();
                System.out.println(currentLine);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void testWriteFile() {
        FileWriter testWriter = null;
        System.out.println("test write file");
    try{
        File testFile = new File("noobs.txt");
        testWriter = new FileWriter(testFile);
        testWriter.write("Java Rocks! Hard!!!! 2");
    } catch (IOException ex) {
        ex.printStackTrace();
    } finally {
        if (testWriter != null) {
            try {
                testWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    }
}
