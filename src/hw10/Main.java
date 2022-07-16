package hw10;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        UserReader ur = new UserReader();
//        final String inPath = "C:/Users/Banduryst-A/IdeaProjects/mod7/src/hw10/file.txt";
        final String inPath = "file.txt";
        final String outPath = "fileOut.json";
        ur.readTxtToJsonManuals(inPath, outPath);

        UserReaderJson urG = new UserReaderJson();
        final String inPath2 = "file2.txt";
        final String outPath2 = "fileOutGson.json";
        urG.readTxtToJson(inPath2, outPath2);

        TelephoneNumberChecker tc = new TelephoneNumberChecker();
        final String inTelChekerPath = "fileTelToCheck.txt";
        final String outTelChekerPath = "fileOutTelCheked.txt";
//        tc.numberChecker(inTelChekerPath, outTelChekerPath);

        WordsCounter wc = new WordsCounter();
        final String words = "words.txt";
        final String report = "wordCountReport.txt";
//        wc.wordCount(words, report);
    }
}
