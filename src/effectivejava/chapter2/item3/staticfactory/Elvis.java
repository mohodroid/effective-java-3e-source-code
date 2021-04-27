package effectivejava.chapter2.item3.staticfactory;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.util.function.Supplier;

// Singleton with static factory (Page 17)
public class Elvis implements Serializable {

    transient int age = 30;
    private static final Elvis INSTANCE = new Elvis();
    private Elvis() { }
    public static Elvis getInstance() {
        return INSTANCE;
    }

    private Object readResolve() {
        return INSTANCE;
    }

    public void leaveTheBuilding() {
        System.out.println("Whoa baby, I'm outta here!");
    }

    // This code would normally appear outside the class!
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Elvis elvis = Elvis.getInstance();
        elvis.leaveTheBuilding();

        System.out.println(Utils.serialize(elvis));
        System.out.println(elvis.age);

        Elvis desElvis = Utils.deserialize();
        System.out.println(desElvis);
        System.out.println(desElvis.age);

        Supplier<Elvis> supplier = Elvis::getInstance;
        System.out.println(supplier.get());
    }


}

class Utils {
    static Elvis serialize(Elvis elvis) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/mohsenmirtalebi/IdeaProjects/effective-java-3e-source-code/src/effectivejava/chapter2/item3/Elvis");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(elvis);
        fileOutputStream.close();
        objectOutputStream.close();
        return elvis;
    }

    static Elvis deserialize() throws IOException, ClassNotFoundException {

        FileInputStream file = new FileInputStream("/Users/mohsenmirtalebi/IdeaProjects/effective-java-3e-source-code/src/effectivejava/chapter2/item3/Elvis");
        ObjectInputStream in = new ObjectInputStream(file);
        Elvis elvis  = (Elvis) in.readObject();
        in.close();
        file.close();
        return elvis;
    }
}
