package effectivejava.chapter2.item7;


import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

//Java program to illustrate weakHashMao
public class Caches {

    public static void main(String[] args) throws InterruptedException {
        Map<Demo, String> map = new WeakHashMap<>(); // change with strongReference map HashMap to see result
        Demo removedDemo = new Demo();
        Demo demo = new Demo();
        //put an entry into weakHashMao
        map.put(removedDemo, " removed demo ");
        map.put(demo, " demo ");
        System.out.println(map);
        removedDemo = null;
        System.gc();
        Thread.sleep(4000);
        System.out.println(map);
    }


    private static class Demo {
        @Override
        public String toString() {
            return "demo";
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("finalized method is called");
        }
    }


}
