package creational.abstractfactory;

public class Demo {

    public static void main(String[] args) {
        Demo demo =  new Demo();

        IFurnitureFactory furnitureFactory = new ModernFurnitureFactory();
        demo.furnishRoom(furnitureFactory); //pass any furniture factory here
    }

    private void furnishRoom(IFurnitureFactory furnitureFactory) {
        IChair chair = furnitureFactory.createChair();
        ISofa sofa = furnitureFactory.createSofa();

        System.out.println("Furnishing room with " + chair.getStyle() + " style furniture");
        chair.sitOn();
        sofa.lieOn();
    }
}
