package creational.abstractfactory;

public class VictorianFurnitureFactory implements IFurnitureFactory{
    @Override
    public IChair createChair() {
        return new VictorianChair();
    }

    @Override
    public ISofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public ITable createTable() {
        return new VictorianTable();
    }
}
