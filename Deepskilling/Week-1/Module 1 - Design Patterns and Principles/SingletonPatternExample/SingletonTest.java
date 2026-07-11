public class SingletonTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        
        System.out.println("logger1 instance: " + logger1);
        System.out.println("logger2 instance: " + logger2);
        
        if (logger1 == logger2) {
            System.out.println("Both logger1 and logger2 are the same instance. Singleton pattern works.");
        } else {
            System.out.println("logger1 and logger2 are different instances. Singleton pattern failed.");
        }
    }
}
