package com.Dileep.Calculator;

class Multiplication{
    float a;
    float b;
    Multiplication(float a,float b){
        this.a = a;
        this.b = b;
    }
    public String mul(){
        return Float.toString(this.a+this.b);
    }
}
