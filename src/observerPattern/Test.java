package observerPattern;

public class Test {
    public static void main(String[] args) {
        Forcaster forcaster = new Forcaster();
        WeatherDisplayer weatherDisplayer = new WeatherDisplayer();
        WorkerScheduler workerScheduler = new WorkerScheduler();
        forcaster.addObserver(weatherDisplayer);
        forcaster.addObserver(workerScheduler);

        forcaster.setWeather("rainy");
    }
}
