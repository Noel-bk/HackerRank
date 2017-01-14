public class JavaSingletonPattern {
    public static void main(String[] args) { 
    }
}

class Singleton {
    private static Singleton instance = new Singleton();
    public String str;

    private Singleton() {
    }

    public static Singleton getSingleInstance() {
        return instance;
    }
}

