import java.util.Arrays;

public class Colors {
   private Color[] colors;

   private final String DEFAULT_COLOR ="#f00";
    public Color[] getColors() {
        return colors;
    }

    public void setColors(Color[] colors) {
        this.colors = colors;
    }

    @Override
    public String toString() {
        return "Colors{" +
                "colors=" + Arrays.toString(colors) +
                '}';
    }

    public String getColorById(int id){
        for (Color c: this.colors) {
            if(c.getId()==id){
                return c.getColor();
            }
        }
        return DEFAULT_COLOR;
    }
}
