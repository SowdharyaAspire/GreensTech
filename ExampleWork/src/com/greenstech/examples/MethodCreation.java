package com.greenstech.examples;

public class MethodCreation {
	public void typeSentence() {
		System.out.println("Sentence is typed inside the method");
	}
	public static void main(String[] args) {									//main method
		MethodCreation methodCreation = new MethodCreation();					//object creation or memory allocation
		methodCreation.typeSentence();											//method calling
	}

}
