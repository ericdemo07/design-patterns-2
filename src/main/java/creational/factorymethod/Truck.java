package creational.factorymethod;

public class Truck extends RoadTransport {

    @Override
    public void deliver() {
        System.out.println("Truck delivered");
    }

    @Override
    public int calculatedPrice() {
        return 44;
    }

    @Override
    public int wheelsCount() {
        return 10;
    }
}
