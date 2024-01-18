public class CommentValidatorRunner {

    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        Label label = null;

        for (TextAnalyzer analyzer : analyzers) {
            label = analyzer.processText(text);
            if (label != null) {
                return label;
            }
        }
        if (label == null) {
            label = Label.OK;
        }
        return label;
    }
}
