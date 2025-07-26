package creational.factorymethod;

public abstract class TransportFactory {
    public abstract ITransport createTransport();

    public void planDelivery() {
        ITransport transport = createTransport();
        System.out.print("Planning delivery: ");
        transport.deliver();
    }
}
