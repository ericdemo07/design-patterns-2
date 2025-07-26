package creational.factorymethod;

public class Car extends RoadTransport {
    @Override
    public void deliver() {
        System.out.println("Car delivered");
    }

    @Override
    public int calculatedPrice() {
        return 22;
    }

    @Override
    public int wheelsCount() {
        return 4;
    }
}
