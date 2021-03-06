package com.jsfd.week1.day2;
// import java.lang.ref.Cleaner;
// import java.math.*;

public class car{
    private String owner;
    private String name;
    private String model;
    private int year;
    private int speed;
    private int mil;
    private int tank;
    private int ct=0;


    public car(String owner, String name, String model, int year, int speed, int mil, int tank) {
        this.owner = owner;
        this.name = name;
        this.model = model;
        this.year = year;
        this.speed = speed;
        this.mil = mil;
        this.tank = tank;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMil() {
        return mil;
    }

    public void setMil(int mil) {
        this.mil = mil;
    }

    public int getTank() {
        return tank;
    }

    public void setTank(int tank) {
        this.tank = tank;
    }

    public void applyAcceleration(Boolean isAcclApplied) {
        int a=this.speed;
        int b= (a*5)/18;
        b=b/3;
        //System.out.println(this.speed);
        // System.out.println(b);
		if (isAcclApplied) {
            System.out.println("...The car is running...");
            for(int i=0; i<=this.speed;i++){
                if(i%b==0){
                    System.out.println("The car is moving at a speed of "+i+"mps");
                    this.ct=i;
                }
            }
            double x=(this.mil*this.tank)*0.25;
			System.out.println("The car will cover the distance of "+x+"Kmph");
		} 
        else {
            System.out.println("..The car is Idle..");
        }
			
	}


    public void applyBrake(Boolean isBrakeApplied) {
        int a=this.speed;
        int b=(a*5)/18;
        b=b/3;
        int count=0;
        // System.out.println(this.ct);
		if (isBrakeApplied) {
            System.out.println("The car is slowing down!");
            for(int i=this.ct;i>=0;i--){
                if(i%b==0){
                System.out.println("The car is slowing down at a speed of "+i+"mps");
                count+=1;
                }
            }
			System.out.println("The car Stopped with in "+count+"seconds");
		} 
        else {
			System.out.println("..The car is Still Running..");
		}
	} 

    public String disp(){
        return "Owner: "+this.owner+"\nCar Name: "+this.name+" ("+this.model+")\nYear: "+this.year+"\nTop Speed: "+this.speed+"Kmph \nMilleage: "+this.mil+"kmpl \nTank capacity: "+this.tank+"l \n";
    }

}
