public class Color {

    private int id;
    private String color;
    private String value;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Colors{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
