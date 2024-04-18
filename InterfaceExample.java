package com.mycompany.interfaceexample;

public class InterfaceExample {

    public static void main(String[] args) {

        Bank b = new SBI();
        System.out.println("ROI: " + b.rateOfInterest());
        Bank c = new PNB();
        System.out.println("ROI: " + c.rateOfInterest());
    }
}
