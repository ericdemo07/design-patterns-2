package creational.abstractfactory;

public class VictorianChair implements IChair{
    @Override
    public void sitOn() {
        System.out.println("Sitting on a sleek Victorin Chair.");
    }

    @Override
    public String getStyle() {
        return "Victorian";
    }
}
