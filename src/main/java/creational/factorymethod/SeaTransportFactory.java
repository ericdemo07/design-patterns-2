package creational.factorymethod;

public class SeaTransportFactory extends TransportFactory {
    @Override
    public SeaTransport createTransport() {
        return new Ship();
    }
}
