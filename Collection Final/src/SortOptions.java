public class SortOptions {

    private SortField sortField;
    private SortOrder sortOrder;

    public SortOptions(SortField sortField, SortOrder sortOrder) {
        this.sortField = sortField;
        this.sortOrder = sortOrder;
    }

    public SortField getSortField() {
        return sortField;
    }

    public SortOrder getSortOrder() {
        return sortOrder;
    }

    public enum SortField {
        BY_NAME,
        BY_PRICE,
        BY_NAME_AND_PRICE

    }

    public enum SortOrder {
        ASC,
        DESC

    }
}



