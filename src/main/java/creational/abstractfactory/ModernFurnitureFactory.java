package creational.abstractfactory;

public class ModernFurnitureFactory implements IFurnitureFactory{
    @Override
    public IChair createChair() {
        return new ModernChair();
    }

    @Override
    public ISofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public ITable createTable() {
        return new ModernTable();
    }
}
