package input_output_work_whith_file;

import java.io.*;
import java.util.ArrayList;

class FileriderWriter {
    public static void main(String[] args) throws FileNotFoundException {
String filePath = "C:/Users/Banduryst-A/IdeaProjects/mod7/src/input_output_work_whith_file/dhcpIN";
//        Scanner sc = new Scanner(new BufferedReader(new FileReader(filePath)));
        ArrayList<String> ar = new ArrayList<String>();
        String line =null;

        File file = new File(filePath);
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while((line=br.readLine())!= null){
                ar.add(line);
//                System.out.println(line);
            }
        } catch (Exception e) {
        }


        String filout = "C:/Users/Banduryst-A/IdeaProjects/mod7/src/input_output_work_whith_file/dhcpOUT";
        File fileOut = new File(filout);
        try( BufferedWriter bw = new BufferedWriter(new FileWriter(fileOut))) {

            bw.write("<<< DHCP >>>>" + "\n");
            for (String a : ar) {
                if (a.contains("ip dhcp pool")) {
                    bw.write("\n");
                    System.out.println("\n");
                }
                bw.write(a + "\t");
                System.out.println((a + "\t"));
            }
        } catch (IOException e) {
            System.out.println("Unable to write file: " + file.toString());
        }

        }
}
