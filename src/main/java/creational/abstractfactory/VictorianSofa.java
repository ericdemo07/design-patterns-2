package creational.abstractfactory;

public class VictorianSofa implements ISofa{
    @Override
    public void lieOn() {
        System.out.println("Relaxing on a grand Victorian Sofa.");
    }

    @Override
    public String getStyle() {
        return "Victorian";
    }
}
