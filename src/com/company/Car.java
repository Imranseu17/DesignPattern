package com.company;

public class Car {

    public  int  id;
    public String name;
    public int num_of_wheels;
    public int num_of_passengers;
    public boolean has_gas;

    public Car(int id, String name, int num_of_wheels, int num_of_passengers, boolean has_gas) {
        this.id = id;
        this.name = name;
        this.num_of_wheels = num_of_wheels;
        this.num_of_passengers = num_of_passengers;
        this.has_gas = has_gas;
    }

    public Car() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum_of_wheels() {
        return num_of_wheels;
    }

    public void setNum_of_wheels(int num_of_wheels) {
        this.num_of_wheels = num_of_wheels;
    }

    public int getNum_of_passengers() {
        return num_of_passengers;
    }

    public void setNum_of_passengers(int num_of_passengers) {
        this.num_of_passengers = num_of_passengers;
    }

    public boolean isHas_gas() {
        return has_gas;
    }

    public void setHas_gas(boolean has_gas) {
        this.has_gas = has_gas;
    }
}
