public abstract class KeywordAnalyzer implements TextAnalyzer {

    public abstract String[] getKeywords();

    public abstract Label getLabel();

    public abstract Label processText(String string);
}
