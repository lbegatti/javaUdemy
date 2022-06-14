public class APIResponseParser {

    /**
     * Parses the input text and returns a Book instance containing
     * the parsed data.
     * @param response text to be parsed
     * @return Book instance containing parsed data
     */
    public static Book2 parse(String response) {
        Book2 book = new Book2();

        // title
        String endRule = "</title>";
        String startRule = "<title>";
        String title = parse(response, startRule, endRule);
        //System.out.println(title);
        book.setTitle(title);

        // Author
        String startRuleAuthor = "<name>";
        String endRuleAuthor = "</name>";
        String author = parse(response, startRuleAuthor,endRuleAuthor);
        //System.out.println(author);
        book.setAuthor(author);

        // Publication Year
        String startRulePubYear = "<original_publication_year type=\"integer\">";
        String endRulePubYear = "</original_publication_year>";
        int pubYear = Integer.parseInt(parse(response, startRulePubYear, endRulePubYear));
        //System.out.println(pubYear);
        book.setPublicationYear(pubYear);

        // Average rating
        String startRuleAveRat = "<average_rating>";
        String endRuleAveRat = "</average_rating>";
        double aveRating = Double.parseDouble(parse(response, startRuleAveRat, endRuleAveRat));
        //System.out.println(aveRating);
        book.setAverageRating(aveRating);

        // Ratings count
        String startRuleRatingsCount = "<ratings_count type=\"integer\">";
        String endRuleRatingsCount = "</ratings_count>";
        String ratingsCount = parse(response, startRuleRatingsCount, endRuleRatingsCount);
        int ratingsCountInteger = Integer.parseInt(ratingsCount.replaceAll(",",""));
        //System.out.println(ratingsCountInteger);
        book.setRatingsCount(ratingsCountInteger);

        // Image url
        String startRuleImageUrl = "<image_url>";
        String endRuleImageUrl = "</image_url>";
        String imageUrl = parse(response, startRuleImageUrl, endRuleImageUrl);
        //System.out.println(imageUrl);
        book.setImageUrl(imageUrl);

        // Your code
        return book;
    }

    private static String parse(String response, String startRule, String endRule) {
        if (response.contains(startRule)) {
            //System.out.println(patternSuffix);

            return response.substring(response.indexOf(startRule) + startRule.length(), response.indexOf(endRule));

        }
        return "No pattern";
    }

    // write overloaded parse method with the 3 parameters response, startRule, endRule

    public static void main(String[] args) {
        String response = "<work>" +
                "<id type=\"integer\">2361393</id>" +
                "<books_count type=\"integer\">813</books_count>" +
                "<ratings_count type=\"integer\">1,16,315</ratings_count>" +
                "<text_reviews_count type=\"integer\">3439</text_reviews_count>" +
                "<original_publication_year type=\"integer\">1854</original_publication_year>" +
                "<original_publication_month type=\"integer\" nil=\"true\"/>" +
                "<original_publication_day type=\"integer\" nil=\"true\"/>" +
                "<average_rating>3.79</average_rating>" +
                "<best_book type=\"Book\">" +
                "<id type=\"integer\">16902</id>" +
                "<title>Walden</title>" +
                "<author>" +
                "<id type=\"integer\">10264</id>" +
                "<name>Henry David Thoreau</name>" +
                "</author>" +
                "<image_url>" +
                "http://images.gr-assets.com/books/1465675526m/16902.jpg" +
                "</image_url>" +
                "<small_image_url>" +
                "http://images.gr-assets.com/books/1465675526s/16902.jpg" +
                "</small_image_url>" +
                "</best_book>" +
                "</work>";

        APIResponseParser.parse(response);
    }
}

