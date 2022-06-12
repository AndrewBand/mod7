package hw10;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        UserReader ur = new UserReader();
        final String inPath = "C:/Users/Banduryst-A/IdeaProjects/mod7/src/hw10/file.txt";
        final String outPath = "C:/Users/Banduryst-A/IdeaProjects/mod7/src/hw10/fileOut.txt";
        ur.readTxtToJson(inPath, outPath);

        TelephoneNumberChecker tc = new TelephoneNumberChecker();
        final String inTelChekerPath = "C:/Users/Banduryst-A/IdeaProjects/mod7/src/hw10/fileTelToCheck.txt";
        final String outTelChekerPath = "C:/Users/Banduryst-A/IdeaProjects/mod7/src/hw10/fileOutTelCheked.txt";
//        tc.numberChecker(inTelChekerPath, outTelChekerPath);

        WordsCounter wc = new WordsCounter();
        final String words = "C:/Users/Banduryst-A/IdeaProjects/mod7/src/hw10/words.txt";
        final String report = "C:/Users/Banduryst-A/IdeaProjects/mod7/src/hw10/wordCountReport.txt";
        wc.wordCount(words, report);
    }
}
