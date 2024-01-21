public class House {

    double temperature;
    int humidity;

    public House(double temperature, int humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public void printStatus() {
        System.out.println(
                "Температура: " + this.temperature + "\n" +
                        "Влажность: " + this.humidity
        );

    }

}
