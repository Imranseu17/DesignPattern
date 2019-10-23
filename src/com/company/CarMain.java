package com.company;

public class CarMain implements Vehicle {

    public static void main(String[] args) {



	// write your code here
    }

    @Override
    public int set_num_of_wheels() {
        Car c = new Car();
        c.setNum_of_wheels(8);
        int numberofwheels = c.getNum_of_wheels();
        return numberofwheels;
    }

    @Override
    public int set_num_of_passengers() {
        Car c = new Car();
        c.setNum_of_passengers(8);
        int numberofpassengers = c.getNum_of_passengers();
        return numberofpassengers;
    }

    @Override
    public boolean has_gas() {
        Car c = new Car();
        c.setHas_gas(true);
        boolean has_gas = c.isHas_gas();
        return has_gas;
    }
}
