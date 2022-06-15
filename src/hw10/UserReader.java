package hw10;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class UserReader {
    public void readTxtToJson(String fileInName, String fileOutName) {
        String line = null;

        File fileOut2 = new File(fileOutName);
        FileWriter fw = null;

        try {
            fw = new FileWriter(fileOut2);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Unable to create file: " + fileOut2.toString());
        }

        ArrayList<String> ar = new ArrayList<String>();
        File file = new File(fileInName);
        ArrayList<Integer> colm = new ArrayList<Integer>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while ((line = br.readLine()) != null) {
                if (!line.isEmpty() && !line.isBlank()) {
                    ar.add(line);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Unable to read file: " + file.toString());
        }

        for (int i = 0; i < ar.size(); i++) {
            colm.add(ar.get(i).trim().split(" ").length);
        }

        int rows = ar.size();
        int columns = Collections.max(colm);
        String[][] ArINN = new String[rows][columns];

        for (int i = 0; i < ArINN.length; i++) {
            String[] line4 = ar.get(i).trim().split(" ");
            for (int j = 0; j < line4.length; j++) {

                ArINN[i][j] = String.valueOf(line4[j]);

            }
        }

        String[][] arInHand = new String[1][2];
        arInHand = Arrays.copyOf(ArINN, 1);

        for (int i = 1; i < ArINN.length; i++) {
            String[] line4 = ar.get(i).trim().split(" ");

            if (i != 1) {
                WriterToFile.writerToFile(" {\n" + "\n" + " \"", fileOutName);
            } else {
                WriterToFile.writerToFile("[\n" + "\n" + " {\n" + "\n" + " \"", fileOutName);
            }

            WriterToFile.writerToFile(arInHand[0][0] + "\": \"", fileOutName);
            WriterToFile.writerToFile(ArINN[i][0] + "\",\n", fileOutName);
            WriterToFile.writerToFile("\n" + "\"", fileOutName);
            WriterToFile.writerToFile(arInHand[0][1] + "\":", fileOutName);
            WriterToFile.writerToFile(ArINN[i][1] + "\n", fileOutName);

            if (i != ArINN.length - 1) {

                WriterToFile.writerToFile("\n" + " },\n", fileOutName);
            } else {
                WriterToFile.writerToFile("\n" + " }" + "\n\n" + "]", fileOutName);
            }
            WriterToFile.writerToFile("\n", fileOutName);
        }
    }
}