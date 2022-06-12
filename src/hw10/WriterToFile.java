package hw10;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class WriterToFile {
static void writerToFile(String toWrite, String fileOutName) {
    File fileOut = new File(fileOutName);

    try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileOut, true))) {

                bw.write(toWrite);

    } catch (IOException e) {
        e.printStackTrace();
        System.out.println("Unable to write file: " + fileOut.toString());
    }
}
}
