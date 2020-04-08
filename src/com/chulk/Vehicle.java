package com.chulk;
abstract class Avg{
   abstract void avgSpeed();
}
public class Vehicle extends Avg  {
    int passengers;
    private int wheels;
    private int maxSpeed;
    int burnUp;
    void avgSpeed()
    {
        double avg=100/2;
        System.out.println(avg);
    }
    Vehicle()
    {
        passengers=5;
        wheels=4;
        maxSpeed=160;
        burnUp=10;
    }
    Vehicle(int passengers,int wheels,int maxSpeed,int burnUp)
    {
        this.passengers=passengers;
        this.wheels=wheels;
        this.maxSpeed=maxSpeed;
        this.burnUp=burnUp;
    }
    double distance(double interval)
    {
        double val=this.maxSpeed*interval;
        return val;
    }

    public int getWheels() {
        return wheels;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setWheels(int wheels) {
        if((wheels<1)||(wheels>24))
            System.out.println("Uncorrected");
        else
        this.wheels = wheels;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public void show()
    {
        System.out.println("passengers:"+passengers);
        System.out.println("wheels:"+wheels);
        System.out.println("maxSpeed:"+maxSpeed);
        System.out.println("burnUp:"+burnUp);
    }
}
 class Auto extends Vehicle{
    boolean sunroof;
    Auto(boolean sunroof){
        super(4,4,200,12);
    this.sunroof=sunroof;
    }
     Auto(int passengers,int wheels,int maxSpeed,int burnUp,boolean sunroof)
     {
         super(passengers,wheels,maxSpeed,burnUp);
         this.sunroof=sunroof;
     }
     public void show()
     {
         System.out.println("Vehicle: Auto");
         super.show();
         System.out.println("sunroof:"+sunroof);
     }
 }
 class Bicycle extends Vehicle{
    float price;
    Bicycle(float price){
        super(1,2,30,0);
        this.price=price;
    }
    Bicycle(int passengers,int wheels,int maxSpeed,int burnUp,float price)
    {
        super(passengers,wheels,maxSpeed,burnUp);
        this.price=price;
    }
 }
 class MotorBike extends Vehicle{
    boolean stroller;
     MotorBike(boolean stroller){
         super(1,2,30,0);
         this.stroller=stroller;
     }
     MotorBike(int passengers,int wheels,int maxSpeed,int burnUp,boolean stroller)
     {
         super(passengers,wheels,maxSpeed,burnUp);
         this.stroller=stroller;
     }
 }