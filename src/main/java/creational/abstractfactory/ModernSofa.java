package creational.abstractfactory;

public class ModernSofa implements ISofa{
    @Override
    public void lieOn() {
        System.out.println("Relaxing on a grand Modern Sofa.");
    }

    @Override
    public String getStyle() {
        return "Modern";
    }
}
