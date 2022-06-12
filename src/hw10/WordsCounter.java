package hw10;

import java.io.*;
import java.util.*;

class WordsCounter {
    public void wordCount(String fileInName, String fileOutName) throws IOException {
        String line = null;
        int count = 0;

        File fileOut2 = new File(fileOutName);
        FileWriter fw = null;

        try  {
            fw = new FileWriter(fileOut2);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Unable to create file: " + fileOut2.toString());
        }

        ArrayList<String> ar = new ArrayList<String>();
        Set<String> arSet = new HashSet<>();

        File file = new File(fileInName);
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while ((line = br.readLine()) != null) {
                for (String aLine : line.split(" ")) {
                    if (!aLine.isBlank()) {
                        ar.add(aLine);
                        arSet.add(aLine);

                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Unable to read file: " + file.toString());
        }

        for (String arSetElement : arSet) {
            for (String arElement : ar) {
                if (arSetElement.equals(arElement)) {
                    count++;
                }
            }
            WriterToFile.writerToFile(arSetElement + " " + count + "\n\n", fileOutName);
            count = 0;
        }
    }
}