package CompanyPreparation.Mastercard.WaysToCreateObject;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class WaysToCreateObjectMain {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        // Using new keyword
        Car car = new Car("Lambo");

        Car newCarWithClone = car.clone();

        // Using reflection older way
        Car objectWithOlderReflection = Car.class.newInstance();
        objectWithOlderReflection.run();

        // Using reflection new way
        Constructor<Car> constructorOfCar = Car.class.getConstructor(String.class);
        Car objectWithNewReflection = constructorOfCar.newInstance("Lambo");

        System.out.println(car + " -> " + objectWithOlderReflection + " -> " + objectWithNewReflection);
    }
}
