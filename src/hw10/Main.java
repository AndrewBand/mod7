package hw10;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        UserReader ur = new UserReader();
//        final String inPath = "C:/Users/Banduryst-A/IdeaProjects/mod7/src/hw10/file.txt";
        final String inPath = "file.txt";
        final String outPath = "fileOut.txt";
        ur.readTxtToJson(inPath, outPath);
//        Path toPath = new javax.validation.Path();
//        System.out.println("ur.getClass().getPackage() = " + toPath.toString());
        TelephoneNumberChecker tc = new TelephoneNumberChecker();
        final String inTelChekerPath = "fileTelToCheck.txt";
        final String outTelChekerPath = "fileOutTelCheked.txt";
        tc.numberChecker(inTelChekerPath, outTelChekerPath);

        WordsCounter wc = new WordsCounter();
        final String words = "words.txt";
        final String report = "wordCountReport.txt";
        wc.wordCount(words, report);
    }
}
