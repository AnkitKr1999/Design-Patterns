package SingletonPattern;

import java.util.Objects;

public class Singleton {
    public static void main(String[] args) {

        // classicSingleton();
        enumSingleton();
    }

    private static void enumSingleton() {
        ABC o1 = ABC.INSTANCE;
        o1.value = 5;
        o1.show();
        ABC o2 =  ABC.INSTANCE;
        o2.value = 6;
        o1.show();
    }

    enum ABC{ // singleton this way is thread
        INSTANCE;
        int value;
        public void show(){
            System.out.println("Value is: " + value);
        }
    }

    private static void classicSingleton() {

        Thread thread1 = new Thread(()->{
            Temp t1 = Temp.getInstance();
        },"Thread1");

        Thread thread2 = new Thread(()->{
            Temp t1 = Temp.getInstance();
        },"Thread2");

        thread1.start();
        thread2.start();
    }
}
class Temp {
    public static Temp temp;
    static Object lock = new Object();
    private Temp(){
        System.out.println("Temp Created!");
    }
    // public static synchronized Temp getInstance(){ // synchronized on entire function can slow down the function execution
    //     if(Objects.isNull(temp))
    //     temp = new Temp();
    //     return temp;
    // }

    // public static Temp getInstance(){ 
    //     synchronized(lock){
    //         if(Objects.isNull(temp))
    //         temp = new Temp();
    //     }
    //     return temp;
    // }

    public static Temp getInstance(){ // double checked locking
        if(Objects.isNull(temp))
        {
            synchronized(lock){
                if(Objects.isNull(temp))
                temp = new Temp();
            }
        }
        return temp;
    }
}
