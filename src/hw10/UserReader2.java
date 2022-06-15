package hw10;

import com.google.gson.Gson;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

class UserReader2 {
    public void readTxtToJson(String fileInName, String fileOutName) {
        ArrayList<Person> ar = new ArrayList<Person>();
        String line = null;

        File file = new File(fileInName);
        ArrayList<Integer> colm = new ArrayList<Integer>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while ((line = br.readLine()) != null) {
                if (!line.isEmpty() && !line.isBlank() && !line.contains("age")) {
                    ar.add(new Person(String.valueOf(line.split(" ")[0]), Integer.valueOf(line.split(" ")[1])));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Unable to read file: " + file.toString());
        }

        try (FileOutputStream fileOutputStream = new FileOutputStream(new File(fileOutName))
        ) {
            String res = new Gson().toJson(ar);
            fileOutputStream.write(res.getBytes(StandardCharsets.UTF_8));
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }

    }
}