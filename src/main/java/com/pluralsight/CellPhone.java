package com.pluralsight;

public class CellPhone {
 private int sNumber;
 private String model;
 private String  carrier ;
 private String pNumber ;
 private String owner;

 public CellPhone() {
     this.sNumber = 0;
     this.model =" ";
     this.carrier =" ";
     this.pNumber =" ";
     this.owner =" ";

 }

    public int getsNumber() {
        return sNumber;
    }

    public void setsNumber(int sNumber) {
        this.sNumber = sNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getpNumber() {
        return pNumber;
    }

    public void setpNumber(String pNumber) {
        this.pNumber = pNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void dial(String pNumber){
        System.out.println( owner + "'s phone is calling" + pNumber
                );
    }

    @Override
    public String toString() {
        return "CellPhone{" +
                "owner='" + owner + '\'' +
                ", pNumber='" + pNumber + '\'' +
                ", carrier='" + carrier + '\'' +
                ", model='" + model + '\'' +
                ", sNumber=" + sNumber +
                '}';
    }
}

