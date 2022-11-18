package org.tnsindia.operatorsdemo;

public class IncrementDecrementDemo {

	public static void main(String[] args) {
		//increment
		int a=13, b=5;
		a++;//13
		int y=a;//14
		++b;//6
		System.out.println(b);
		System.out.println(y);

		//decrement
		int x=4, z=11;
		--x;
		z--;
		int p=++z;
		System.out.println(x);
		System.out.println(p);
	}

}
