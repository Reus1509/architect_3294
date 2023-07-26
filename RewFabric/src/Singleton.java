public class Singleton {
    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {
        System.out.println("Hi, I'm singleton!");
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }
}
