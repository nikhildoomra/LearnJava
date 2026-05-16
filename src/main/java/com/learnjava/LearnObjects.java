package com.learnjava;

import java.util.Objects;

class LearnObjects {
    public static void main(String[] args) {
        Car car1 = new Car(10, "Toyota","Corolla");
        Car car2 = new Car(10, "Toyota", "Corolla");
        System.out.println("car1==car2 : " + (car1 == car2));
        System.out.println("car1.equals(car2) : " + car1.equals(car2));
        System.out.println("car1: " + car1); 
        System.out.println("car2: " + car2);
    }
}

class Car {
    double maxSpeed;
    String name;
    String model;
    public Car() {
        this(100, "Toyota", "Corolla");
    }

    public Car(double maxSpeed, String name, String model) {
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.model = model;
    }

    @Override
    public String toString() {
        return "[" + this.name + "(" + this.model + ") - Max Speed: " + this.maxSpeed + "mph]";
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Car)) return false;

        Car carObj = (Car) obj;

        return this.maxSpeed == carObj.maxSpeed
        && this.name.equals(carObj.name) 
        && this.model.equals(carObj.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.maxSpeed, this.name, this.model);
    }
    
}