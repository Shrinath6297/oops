package com.karvenagar;

public class B {
A a=new A();

public void m1()
{
a.x=100;
System.out.println(a.x);
a.m2();
}
public static void main(String[] args) {
	B b=new B();
	b.m1();
}
}
