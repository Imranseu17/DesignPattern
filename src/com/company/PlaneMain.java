package com.company;

public class PlaneMain implements Vehicle {

    public static void main(String[] args) {
        // write your code here
    }

    @Override
    public int set_num_of_wheels() {
       Plane p = new Plane();
        p.setNum_of_wheels(8);
        int numberofwheels = p.getNum_of_wheels();
        return numberofwheels;
    }

    @Override
    public int set_num_of_passengers() {
        Plane p = new Plane();
        p.setNum_of_passengers(8);
        int numberofpassengers = p.getNum_of_passengers();
        return numberofpassengers;
    }

    @Override
    public boolean has_gas() {
       Plane p = new Plane();
        p.setHas_gas(true);
        boolean has_gas = p.isHas_gas();
        return has_gas;
    }
}
