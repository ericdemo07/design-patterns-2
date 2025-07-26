package creational.factorymethod;

import creational.factorymethod.enums.CargoType;
import creational.factorymethod.enums.DeliveryUrgency;

public class Demo {

    public static void main(String[] args) {
        Demo demo = new Demo();

        TransportFactory transportFactory = new RoadTransportFactory(DeliveryUrgency.VIP, CargoType.PERISHABLES);
        demo.transport(transportFactory); //pass any transport factory here
    }

    private void transport(TransportFactory transportFactory) {
        ITransport transport = transportFactory.createTransport();

        transport.deliver();
        transportFactory.planDelivery();

        int price = transport.calculatedPrice();

        System.out.println("price :" + price);

        if (transport instanceof RoadTransport) {
            RoadTransport roadTransport = (RoadTransport) transport;
            int wheelCount = roadTransport.wheelsCount();

            System.out.println("wheel count :" + wheelCount);
        }
    }
}
