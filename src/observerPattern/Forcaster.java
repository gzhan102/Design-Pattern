package observerPattern;

public class Forcaster extends Observable {
    private String weather;

    public void setWeather(String weather) {
        this.weather = weather;
        notifyObservers(weather);
    }

    public String getWeather() {
        return weather;
    }
}
