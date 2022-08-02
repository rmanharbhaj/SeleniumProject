package tests;

import selenium.Test4;//different package

public class Test1 {
	//whenever we have to call non-static method in static method ,we have to create obj
	//Classname obj=new Classname();
	static Test1 t1=new Test1();
	static Test2 t2=new Test2();
	static Test3 t3=new Test3();
	static Test4 t4=new Test4();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method");
		scan();
		//Test1.scan();
		print();
		System.out.println("quit");
		t1.test();
		t1.paint();
		Test2.blue();//static method from different class
		t2.red();//non-static method from different class
		Test3.circle();
		t3.square();
		Test4.bmw();
		t4.audi();
		ArgumentsTest.sum();
		ArgumentsTest.sum(100,200);
		ArgumentsTest.sum(5,7,9);

	}
	public static void print() {
		System.out.println("Print Method");
		
	}
	public static void scan() {
		System.out.println("Scan Method");
	}
	public void test() {
		System.out.println("Test Mathod");
	}
	public void paint() {
		System.out.println("Print Method");
	}
}
