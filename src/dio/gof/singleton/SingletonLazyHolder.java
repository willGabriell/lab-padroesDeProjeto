package dio.gof.singleton;

public class SingletonLazyHolder {

    private static class InstanceHolder {
        private static SingletonLazyHolder instance = new SingletonLazyHolder();
    }

    public SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance() {
       return SingletonLazyHolder.getInstance();
    }
}
