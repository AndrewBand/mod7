package hw10;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class UserReader {
    public void readTxtToJson(String fileInName, String fileOutName) {


        ArrayList<String> ar = new ArrayList<String>();
        String line = null;

        File file = new File(fileInName);
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            ;
            while ((line = br.readLine()) != null) {
                if (!line.isEmpty() && !line.isBlank()) {
                    ar.add(line);

                    System.out.println(line);
                }
            }
        } catch (Exception e) {
        }

        ArrayList<Integer> colm = new ArrayList<Integer>();

        for (int i = 0; i < ar.size(); i++) {
            colm.add(ar.get(i).trim().split(" ").length);
        }
        System.out.println("colm MAX: " + Collections.max(colm));

        int rows = ar.size();
        System.out.println("nun rows: " + rows);
        int columns = Collections.max(colm);
        System.out.println("nun columns: " + columns);

        File fileOut = new File(fileOutName);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileOut))) {

            String[][] ArINN = new String[rows][columns];

            for (int i = 0; i < ArINN.length; i++) {
                String[] line4 = ar.get(i).trim().split(" ");
                for (int j = 0; j < line4.length; j++) {

                    ArINN[i][j] = String.valueOf(line4[j]);

                }
            }
            String[][] arInHand = new String[1][2];
            arInHand = Arrays.copyOf(ArINN, 1);
            System.out.println("arInHand = " + Arrays.toString(arInHand));
            for (int i = 0; i < arInHand.length; i++) {
                for (int j = 0; j < arInHand[i].length; j++) {

                    System.out.println("arInHand[i][j] = " + arInHand[i][j]);

                }
            }

            for (int i = 1; i < ArINN.length; i++) {
                String[] line4 = ar.get(i).trim().split(" ");
//                for (int j = 0; j < line4.length; j++) {

//                    ArINN[i][j] = String.valueOf(line4[j]);
                    if (i != 1) {
                        bw.write(
                                " {\n" +
                                        "\n" +
                                        " \""
                        );
                    } else {
                        bw.write(
                                "[\n" +
                                        "\n" +
                                        " {\n" +
                                        "\n" +
                                        " \""
                        );
                    }

                    bw.write(arInHand[0][0] + "\": \"");
                    bw.write(ArINN[i][0] + "\",\n");
                    bw.write("\n" + "\"");
                    bw.write(arInHand[0][1] + "\":");
                    bw.write(ArINN[i][1] + "\n");

                    if (i!=ArINN.length-1) {

                        bw.write(
                                "\n" +
                                        " },\n"
                        );
                    } else {
                        bw.write(
                                "\n" +
                                        " }" +
                                        "\n" +
                                        "]"
                        );
                    }


                    bw.write("\n");


//                }
            }


        } catch (IOException e) {
            System.out.println("Unable to write file: " + file.toString());
        }
    }
}