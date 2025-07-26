package creational.factorymethod;

public class SpeedBoat extends SeaTransport{
    @Override
    public void deliver() {
        System.out.println("Speed boat delivered");
    }

    @Override
    public int calculatedPrice() {
        return 66;
    }

    @Override
    public int speedInKnots() {
        return 12;
    }
}
