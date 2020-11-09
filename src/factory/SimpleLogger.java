package factory;

public class SimpleLogger implements Logger {
    private Class c;

    public SimpleLogger(Class c) {
        this.c = c;
    }

    @Override
    public void log(String message) {
        System.out.println(c.getCanonicalName() + ": " + message);
    }

    @Override
    public void check(boolean flag, String message) {
        if (!flag) {
            System.out.println(c.getCanonicalName() + " has something wrong: " + message);
        }
    }
}
