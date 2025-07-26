package creational.factorymethod;

public class Tempo extends RoadTransport{
    @Override
    public int wheelsCount() {
        return 6;
    }

    @Override
    public void deliver() {
        System.out.println("Tempo delivered");
    }

    @Override
    public int calculatedPrice() {
        return 24;
    }
}
