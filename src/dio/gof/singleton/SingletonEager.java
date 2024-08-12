package dio.gof.singleton;

public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    public SingletonEager() {
        super();
    }

    public static SingletonEager getInstance() {
        return instancia;
    }
}
