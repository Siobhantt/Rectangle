package exercise5part2;

import java.util.Scanner;

public class Exercise5part2 {

	public static void main(String[] args) {
		
		//Design a program that asks the user to enter values for the length and height of a rectangle
		//and then displays the area and perimeter of that rectangle.

		//we're goin to save the variables
		
		double length; 
		double height;
		double area;
		double perimeter;
		
		//now we start the Scanner
		
		Scanner white = new Scanner(System.in);
		
		//now we're going to request the user the values we need to do the operation
		
		System.out.println("Please introduce the length: ");
		length = white.nextDouble();
		
		//now we're going to ask for the height
		
		System.out.println("Please introduce the heigth: ");
		height = white.nextDouble();
		
		//now we write the operation
		area = length * height;
		perimeter = length *2 + height *2;
		
		System.out.print("The area of the rectangle is " + area + " The perimeter of the rectangle is: " + perimeter);
		
		white.close();
		
		
		// TODO Auto-generated method stub

	}

}
