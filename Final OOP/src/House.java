public class House {

    private int humidity;
    private double temperature;

    public House(int humidity, double temperature) {
        this.humidity = humidity;
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void printHouseStatus() {
        System.out.println("Темппература: " + this.temperature + "°C");
        System.out.println("Влажность: " + this.humidity + "%");
    }
}
