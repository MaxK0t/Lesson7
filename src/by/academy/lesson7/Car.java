package by.academy.lesson7;

import java.util.Objects;

public abstract class Car {

    String mark;
    String kpp;
    String model;
    int years;
    int weight;

    @Override
    public String toString() {
        return "Car " + "mark= " + mark + ", kpp= " + kpp + ", model= " + model + ", years= " + years + ", weight= " + weight + ", quantity";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return years == car.years && weight == car.weight && Objects.equals(mark, car.mark) && Objects.equals(kpp, car.kpp) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mark, kpp, model, years, weight);
    }
}
