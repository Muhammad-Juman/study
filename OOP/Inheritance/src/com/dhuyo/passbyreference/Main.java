package com.dhuyo.passbyreference;

import com.dhuyo.vehicle.Car;
import com.dhuyo.vehicle.Vitz;

public class Main {

    public void setValue(String s){
        System.out.println(s.toUpperCase());
    }

    public void printName(Parent p){
        try {
            p.name();
        }catch (NullPointerException e){
             System.out.println("Reference can not be null!");
        }
    }


    public static void main(String[] args){
        Main ob = new Main();
        Child c = new Child();

        ob.setValue("Juman");
        ob.printName(c);

        System.out.println("Program End");


    }


}
