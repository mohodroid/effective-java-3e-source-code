package effectivejava.chapter2.item1.serviceprovider;

public class MessageService implements Service{
    @Override
    public void execute() {
        System.out.println("sending message...");
    }
}
