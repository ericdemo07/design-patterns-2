package creational.abstractfactory;

public class VictorianTable implements ITable {
    @Override
    public void putOn() {
        System.out.println("Setting items on an elegant Victorian Table.");
    }

    @Override
    public String getStyle() {
        return "Victorian";
    }
}
