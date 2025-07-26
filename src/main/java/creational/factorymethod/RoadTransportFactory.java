package creational.factorymethod;

import creational.factorymethod.enums.CargoType;
import creational.factorymethod.enums.DeliveryUrgency;

public class RoadTransportFactory extends TransportFactory {
    private DeliveryUrgency deliveryUrgency;
    private CargoType cargoType;

    public RoadTransportFactory(DeliveryUrgency deliveryUrgency, CargoType cargoType) {
        this.deliveryUrgency = deliveryUrgency;
        this.cargoType = cargoType;
    }

    @Override
    public RoadTransport createTransport() {
       if (deliveryUrgency == DeliveryUrgency.STANDARD) {
           return new Truck();
       }
       if(cargoType == CargoType.PERISHABLES){
           return new Tempo();
       }
       return new Car();
    }
}
