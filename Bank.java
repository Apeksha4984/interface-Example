package com.mycompany.interfaceexample;
// Interface
public interface Bank {

    float rateOfInterest();
}
//  normal class 
class SBI implements Bank {

    public float rateOfInterest() {
        return 9.15f;
    }
}
// Normal class
class PNB implements Bank {

    public float rateOfInterest() {
        return 9.7f;
    }
}
