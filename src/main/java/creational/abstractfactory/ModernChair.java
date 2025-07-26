package creational.abstractfactory;

public class ModernChair implements IChair{
    @Override
    public void sitOn() {
        System.out.println("Sitting on an ornate Modern Chair.");
    }

    @Override
    public String getStyle() {
        return "Modern";
    }
}
