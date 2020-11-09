package observerPattern;

public class WeatherDisplayer implements Observer {
    @Override
    public void update(Observable observable, Object object) {
        System.out.println("Forcaster has updated its weather: " + object);
    }
}
