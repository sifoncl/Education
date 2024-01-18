public class NegativeTextAnalyzer extends KeywordAnalyzer {

    private Label label = Label.NEGATIVE_TEXT;
    private String[] negativMarker = {":(", "=(", ":|"};

    @Override
    public String[] getKeywords() {
        return negativMarker;
    }

    @Override
    public Label getLabel() {
        return label;
    }

    @Override
    public Label processText(String text) {
        for (String negativMarker : negativMarker) {
            if (text.contains(negativMarker)) {
                return label;
            }
        }
        return null;
    }


}
