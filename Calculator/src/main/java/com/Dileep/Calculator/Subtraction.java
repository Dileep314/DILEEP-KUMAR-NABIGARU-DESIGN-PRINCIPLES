package com.Dileep.Calculator;

class Subtraction{
    float a;
    float b;
    Subtraction(float a,float b){
        this.a = a;
        this.b = b;
    }
    public String sub(){
        return Float.toString(this.a+this.b);
    }
}
