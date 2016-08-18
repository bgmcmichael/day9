package tiyinc.noobs;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by fenji on 8/18/2016.
 */
public class Day9Lecture {
    public static void main(String[] args) {
        Day9Lecture myLecture = new Day9Lecture();
        System.out.println("running");

        myLecture.testWriteFile();
    }

    public void testWriteFile() {
        FileWriter testWriter = null;
        System.out.println("test write file");
    try{
        File testFile = new File("noobs.txt");
        testWriter = new FileWriter(testFile);
        testWriter.write("Java Rocks! Hard!!!! 2");
    } catch (Exception ex) {
        ex.printStackTrace();
    } finally {
        if (testWriter != null) {
            try {
                testWriter.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
    }
}
