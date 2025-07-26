package creational.abstractfactory;

public interface IFurnitureFactory {
    IChair createChair();
    ISofa createSofa();
    ITable createTable();
}
