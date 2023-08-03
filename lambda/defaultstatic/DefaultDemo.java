package lambda.defaultstatic;


interface Vehicle{
    String getBrand();
    String speedUp();
    String slowDown();
    default String turnAlarmOn(){
        return "Turning Vehicle Alarm On";
    }
    default String turnAlarmOff(){
        return "Turning Vehicle Alarm Off";
    }
}

class Car implements Vehicle{

    @Override
    public String getBrand() {
        return "BMW";
    }

    @Override
    public String speedUp() {
        return "Car is Speeding Up";
    }

    @Override
    public String slowDown() {
        return "Car is slowing down";
    }
}
public class DefaultDemo {
    public static void main(String[] args) {
        Car vehicle = new Car();
        System.out.println(vehicle.getBrand());
        System.out.println(vehicle.speedUp());
        System.out.println(vehicle.slowDown());

        //Default Method Call
        System.out.println(vehicle.turnAlarmOff());
        System.out.println(vehicle.turnAlarmOn());
    }
}
