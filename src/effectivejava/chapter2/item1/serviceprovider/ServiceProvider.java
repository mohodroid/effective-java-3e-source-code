package effectivejava.chapter2.item1.serviceprovider;

public class ServiceProvider {


    public static void main(String[] args) {
        Services.registerDefaultProvider(new MessageProvider());
        Service service = Services.newInstance();
        service.execute();
    }


}






