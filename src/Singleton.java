public class Singleton {
    private static volatile Singleton singletonObject;

    private Singleton() {
    }

    public static Singleton getInstance(){
        if (singletonObject == null){
            singletonObject = new Singleton();
        }
        return singletonObject;
    }
}
