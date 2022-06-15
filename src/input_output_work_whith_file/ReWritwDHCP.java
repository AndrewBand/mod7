package input_output_work_whith_file;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class ReWritwDHCP {
    public static void main(String[] args) throws FileNotFoundException {

        String filePath = "C:/Users/Banduryst-A/IdeaProjects/mod7/src/input_output_work_whith_file/dhcpOUT";

        Scanner sc = new Scanner(new BufferedReader(new FileReader(filePath)));
        ArrayList<String> ar = new ArrayList<String>();
        String line = null;

        File file = new File(filePath);
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while ((line = br.readLine()) != null) {
                ar.add(line);
//                System.out.println(line);
            }
        } catch (Exception e) {
        }

        ArrayList<Integer> colm = new ArrayList<Integer>();

        for(int i=0;i<ar.size();i++) {
            colm.add(ar.get(i).trim().split("\t").length);
        }
        System.out.println("colm MAX: " + Collections.max(colm));

        int rows = ar.size(); System.out.println("nun rows: "+rows);
        int columns = Collections.max(colm); System.out.println("nun columns: "+columns);

        String filout = "C:/Users/Banduryst-A/IdeaProjects/mod7/src/input_output_work_whith_file/dhcpBack";
        File fileOut = new File(filout);

        try( BufferedWriter bw = new BufferedWriter(new FileWriter(fileOut))) {
            bw.write("<<< DHCP back >>>>" + "\n");

        String [][] ArINN = new String[rows][columns];

            for (int i=0; i<ArINN.length; i++) {
                String[] line4 = sc.nextLine().trim().split("\t");
                for (int j=0; j<line4.length; j++) {

                    ArINN[i][j] = String.valueOf(line4[j]);

                    bw.write(ArINN[i][j] + "\n");
//                    System.out.println(ArINN[i][j]);
                }
            }


            } catch (IOException e) {
                System.out.println("Unable to write file: " + file.toString());
            }




    }
}