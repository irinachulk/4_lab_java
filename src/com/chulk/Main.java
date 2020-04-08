package com.chulk;

public class Main {

    public static void main(String[] args) {
        /// наследование и инкапсуляция
	Auto lexus=new Auto(4,4,200,16,true);
       lexus.show();
        System.out.println("****************");
       ///
        Bicycle bmx=new Bicycle(15000);
        bmx.show();
        System.out.println(bmx.price);
        System.out.println("****************");
        ///
        MotorBike yamaha=new MotorBike(false);
        yamaha.show();
        System.out.println("****************");
        /// полиморфизм
        Vehicle v=new Vehicle();
        Vehicle []mas={lexus,v};
        for(int i=0;i<mas.length;i++){
            mas[i].show();
        }
        System.out.println("****************");
        ///// абстракция
        Vehicle vv=new Vehicle();
        vv.avgSpeed();
        lexus.avgSpeed();

    }
}
