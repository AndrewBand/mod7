package hw10;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        UserReader2 ur2 = new UserReader2();
        UserReader ur = new UserReader();
        String inPath = "C:/Users/Banduryst-A/IdeaProjects/mod7/src/hw10/file.txt";
        String outPath = "C:/Users/Banduryst-A/IdeaProjects/mod7/src/hw10/fileOut.txt";
//        ur.readTxtToJson(inPath, outPath);

        TelephoneNumberChecker tc = new TelephoneNumberChecker();
        String inTelChekerPath = "C:/Users/Banduryst-A/IdeaProjects/mod7/src/hw10/fileTelToCheck.txt";
        String outTelChekerPath = "C:/Users/Banduryst-A/IdeaProjects/mod7/src/hw10/fileOutTelCheked.txt";
        tc.numberChecker(inTelChekerPath, outTelChekerPath);
    }
}
