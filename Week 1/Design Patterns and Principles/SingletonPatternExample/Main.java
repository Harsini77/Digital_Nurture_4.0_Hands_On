class Logger{
    private static Logger instance;
    private Logger(){
        System.out.println("Instance created");
    }
    public static Logger getInstance(){
        if(instance==null){
            instance=new Logger();
        }
        return instance;
    }
}
public class Main {
    public static void main(String[] args) {
            Logger obj1=Logger.getInstance();
            Logger obj2=Logger.getInstance();
            System.out.println(obj1==obj2);
    }
}