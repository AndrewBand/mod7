package hw10;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class TelephoneNumberChecker {
    public void numberChecker(String fileInName, String fileOutName) {
        ArrayList<String> ar = new ArrayList<String>();

        String line = null;

        File file = new File(fileInName);
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            while ((line = br.readLine()) != null) {
                if (!line.isEmpty() && !line.isBlank()) {
                    ar.add(line);
                }
            }
        } catch (Exception e) {
        }
        String regex = "[\\(|][\\d][\\d][\\d][\\-|[\\)\\ ]][\\d][\\d][\\d][\\-][\\d][\\d][\\d][\\d]";
        Pattern pattern = Pattern.compile(regex);

        File fileOut = new File(fileOutName);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileOut))) {

            for (int i = 0; i < ar.size(); i++) {
                Matcher matcher = pattern.matcher(ar.get(i));
                if (matcher.matches()) {
                    System.out.println("ar.get(" + i + ") = " + ar.get(i));
                    bw.write(ar.get(i));
                }
            }
        } catch (IOException e) {
            System.out.println("Unable to write file: " + file.toString());
        }
    }
}