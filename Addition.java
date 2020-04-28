package com.sit.ObjectClass;

public class Addition {

	public static void main(String[] args) {
		Addition addition = new Addition();
		int sum = addition.calculateSum(2, 5);
		System.out.println("Sum from same class calculateSum method = " + sum);
		
		ArithmeticOperation ao = new ArithmeticOperation();
		int sum1 = ao.calculateSum(4, 10);
		System.out.println("Sum from ArithmeticOperation class calculateSum method = " + sum1);
		
		int sub = ao.calculateSubtraction(5, 2);
		System.out.println("Substraction from ArithmeticOperation class calculateSubtraction method = " + sub);
	}
	
	private int calculateSum(int i, int j) {
		int sum = i + j;
		return sum;
	}

}
