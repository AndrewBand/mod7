package input_output_work_whith_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

class ChangeHelper {

    public static void main(String[] args) throws FileNotFoundException {
String filePath = "C:/Users/Banduryst-A/IdeaProjects/mod7/src/input_output_work_whith_file/changeIN";
        List<String> helperOld = asList (
                "no ip helper-address 10.128.4.5",
                "no ip helper-address 10.128.4.21",
                "ip helper-address 192.168.0.102"
                );
        List<String> helperNew = asList (
//                "no ip helper-address 192.168.0.100",
//                "no ip helper-address 192.168.0.101",
//                "no ip helper-address 192.168.0.102",
                "shutdown",
                "no shutdown"
        );
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


        String filout = "C:/Users/Banduryst-A/IdeaProjects/mod7/src/input_output_work_whith_file/changeOUT";
        File fileOut = new File(filout);
        try( BufferedWriter bw = new BufferedWriter(new FileWriter(fileOut))) {
            ar.stream()
                    .map(e -> "int " + e)
                    .flatMap(e -> {
                        return Stream.concat(Stream.of(e), helperNew.stream());
                    })
                    .forEach(e -> {
                        try {
                            bw.write(String.valueOf(e) + "\n");
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    });
//            for (String a : ar) {
//                if (a.contains("ip dhcp pool")) {
//                    bw.write("\n");
//                    System.out.println("\n");
//                }
//                bw.write(a + "\t");
//                System.out.println((a + "\t"));
//            }
        } catch (IOException e) {
            System.out.println("Unable to write file: " + file.toString());
        }

        }
}
