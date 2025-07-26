package creational.abstractfactory;

public class ModernTable implements ITable {
    @Override
    public void putOn() {
        System.out.println("Setting items on an elegant Modern Table.");
    }

    @Override
    public String getStyle() {
        return "Modern";
    }
}
