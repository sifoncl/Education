public class Garage<T extends Vehicle> {

    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "В этом гараже стоит: " + item.toString();
    }
}
