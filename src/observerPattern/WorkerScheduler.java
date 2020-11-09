package observerPattern;

public class WorkerScheduler implements Observer {
    @Override
    public void update(Observable observable, Object object) {
        String weather = (String)object;
        if (weather.equals("rainy")) {
            System.out.println("Go back home!");
        } else if (weather.equals("sunny")) {
            System.out.println("Go to work!");
        }
    }
}
