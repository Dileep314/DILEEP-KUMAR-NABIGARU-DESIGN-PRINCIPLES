package com.Dileep.Calculator;

public class Division {
	float a;
	float b;
	public Division(float a,float b){
		this.a=a;
		this.b=b;
	}
	public String div(){
		if(b==0) return "divisor cannot be a zero";
		return Float.toString(this.a+this.b);
	}
}
