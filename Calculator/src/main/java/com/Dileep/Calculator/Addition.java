package com.Dileep.Calculator;

class Addition{
    float a;
    float b;
    Addition(float a,float b){
        this.a = a;
        this.b = b;
    }
    public String add(){
        return Float.toString(this.a+this.b);
    }
}
