package test;

public class ConcatMeth {
    public static void main(String[] args) {
//        private static final

    }


    private enum ListURLofBank {
        NBU("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchangenew?json");

        private String url;
        ListURLofBank(String url) {
            this.url = url;
    } public String getUrl() {
            return url;
        }
    }
}


