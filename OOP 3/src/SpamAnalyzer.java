public class SpamAnalyzer extends KeywordAnalyzer {

    Label label = Label.SPAM;
    String[] spamMarker;


    public SpamAnalyzer(String[] spamMarker) {
        this.spamMarker = spamMarker;
    }

    @Override
    public String[] getKeywords() {
        return this.spamMarker;
    }

    @Override
    public Label getLabel() {
        return label;
    }

    public Label processText(String text) {
        for (String negativMarker : this.spamMarker) {
            if (text.contains(negativMarker)) {
                return label;
            }
        }
        return null;
    }


}

