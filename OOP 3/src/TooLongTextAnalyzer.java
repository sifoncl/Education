public class TooLongTextAnalyzer implements TextAnalyzer {

    private int maxLength;
    private static Label label = Label.TOO_LONG;

    public TooLongTextAnalyzer(int maxLength) {
        this.maxLength = maxLength;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }


    @Override
    public Label processText(String text) {
        if (text.length() > this.maxLength) {
            return label;
        } else return null;
    }
}
