package effectivejava.chapter2.item1.serviceprovider;

public class MessageProvider implements Provider{
    @Override
    public Service newService() {
        return new MessageService();
    }
}
