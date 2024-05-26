public class Task_9 {
    public static void main(String[] args) {
        // 9.Скачайте цитату из breaking bad и замените все плохие слова звёздочками

        //https://api.breakingbadquotes.xyz/v1/quotes
        StringBuilder url = new StringBuilder("https://api.breakingbadquotes.xyz/v1/quotes");
        Download download = new Download();
        StringBuilder page = download.downloadPage(url);

        StringBuilder quote = new StringBuilder(parsPageToQuotes(page) + " ");

        System.out.println(quote);

        beepObscenities(quote);

        System.out.println(quote);

    }

    public static StringBuilder parsPageToQuotes (StringBuilder page){
        int startIndex = page.lastIndexOf("quote");
        int endIndex = page.indexOf("author");
        StringBuilder quote = new StringBuilder(page.substring(startIndex + 8, endIndex - 3) + " ");

        int startAuthor = page.lastIndexOf("author");
        int endAuthor = page.lastIndexOf("}");
        quote.insert(0, page.substring(startAuthor + 9, endAuthor - 1) + ": ");

        return quote;
    }

    public static StringBuilder beepObscenities(StringBuilder quote) {
        StringBuilder result = new StringBuilder();
        String[] badWords = {"arse", "bloody Hell", "bugger", "crap", "damn", "goddamn", "git", "minger", "Sod-off", "shit",
                "son of a bitch", "arsehole", "balls", "bint", "bitch", "bollocks", "bullshit", "feck", "munter", "pissed",
                "pissed off", "bastard", "dickhead", "bloodclaat", "cock", "dick", "bellend", "knob", "prick", "twat",
                "beaver", "beef curtains", "clunge", "pussy", "snatch", "punani", "gash", "minge"};
        int indexBadWord = -1;
        for(String i : badWords) {
            indexBadWord = quote.indexOf(i);

            if(indexBadWord != -1) {
                int x = quote.indexOf(" ", indexBadWord );
                for (int j = indexBadWord + 1; j < x - 1; j++) {
                    quote.setCharAt(j, '*');
                }
            }
        }




        return result;
    }
}
