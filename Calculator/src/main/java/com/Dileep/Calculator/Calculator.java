package com.Dileep.Calculator;

import java.util.*;
public class Calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();

        System.out.print("Enter an option\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n");
		int op=sc.nextInt();
		while(op<1 || op>4){
			System.out.println("Enter a valid option.....\n");
			op=sc.nextInt();
		}
		if(op==1) {
			Addition obj=new Addition(num1,num2);
			System.out.println("Addition of given Numbers is : "+obj.add());
		}
		else if(op==2) {
			Subtraction obj=new Subtraction(num1,num2);
			System.out.println("Subtraction of given Numbers is : "+obj.sub());
		}
		else if(op==3) {
			Multiplication obj=new Multiplication(num1,num2);
			System.out.println("Multiplication of given Numbers is : "+obj.mul());
		}
		else{
            Division obj=new Division(num1,num2);
            if(num2 == 0)
            System.out.println("Divisor cannto be ZERO....\n");
			System.out.println("Division of given Numbers is : "+obj.div());
		}
		sc.close();
    }
}

