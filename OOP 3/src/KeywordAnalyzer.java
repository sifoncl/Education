import java.util.Arrays;

public abstract class KeywordAnalyzer implements TextAnalyzer {
    protected abstract String[] getKeywords();

    protected abstract Label getLabel();

    public Label processText(String text) {
        Label result = getLabel();
        if (!Arrays.stream(getKeywords()).anyMatch(k -> text.contains(k)))
            result = null;
        return result;
    }
}