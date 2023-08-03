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
public class DefaultDemo {
}
