package creational.factorymethod;

public class Ship extends SeaTransport {

    @Override
    public void deliver() {
        System.out.println("Ship delivered");
    }

    @Override
    public int calculatedPrice() {
        return 88;
    }

    @Override
    public int speedInKnots() {
        return 5;
    }
}
