package hw10;

import com.google.gson.Gson;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

class UserReader2 {
    public void readTxtToJson(String fileInName, String fileOutName){
        ArrayList<String> ar = new ArrayList<String>();
        String line = null;

        File file = new File(fileInName);
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            ;
            while ( ( line = br.readLine() ) != null ) {
                if (!line.isEmpty() && !line.isBlank()){
                    ar.add(line);

                }
//                System.out.println(line);
            }
        } catch (Exception e) {
        }

        try(FileOutputStream fileOutputStream = new FileOutputStream(new File(fileOutName))
        ) {
            String res = new Gson().toJson(ar);
            fileOutputStream.write(res.getBytes(StandardCharsets.UTF_8));
        } catch (IOException ex){
            System.err.println(ex.getMessage());
        }

    }
    class User{
        private String name;
        private String age;

        public User(String name, String age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }
    }
}