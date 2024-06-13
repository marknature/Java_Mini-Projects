package great_learning_Java_Course;

public class FirstProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!"); //first java program
		
		// Variables and Data Types
		int a = 20;
		float b = 3.14f;
		boolean log = true;
		String word = "Nature";
		System.out.println();
		
		
		// Flow Control Statements in Java
		
		
		// if else
		int x = 20;
		int y = 15;
		
		if(20>18) {
			System.out.println("20 is greater then 18");
		}
		if(x>y) {
			System.out.println("x is greater then y");
		}else {
			System.out.println("y is greater then x");
		}
		
		int mark = 68;
		
		if(mark<50) {
			System.out.println("Fail");
		}
		else if(mark>=50 && mark<60) {
			System.out.println("D Grade");
		}
		else if(mark>=60 && mark<75) {
			System.out.println("C Grade");
		}
		else if(mark>=75 && mark<85) {
			System.out.println("B Grade");
		}
		else if(mark>=85 && mark<=100) {
			System.out.println("A Grade");
		}
		else {
			System.out.println("Invalid Score");
		}
		
		
		// Looping statements
		
		// while loop
		int num = 0;
		
		while(num<=5) {
				System.out.print(num);
				num++;
		}
		System.out.println();
		
		
		// For Loop
		for (int i = 0; i < 5; i++) {
			System.out.print(i);
		}
		System.out.println();
		for (int i = 0; i <= 10; i = i +2) {
			System.out.print(i);
		}
		System.out.println();
		
		
		// Pattern Problem
		int n=6;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		// Operators in Java
		// https://www.geeksforgeeks.org/java-relational-operators-with-examples/
		
		// Arrays in Java
		char[] names = new char[5];
		
		names[0] = 'a';
		names[1] = 'b';
		names[2] = 'c';
		names[3] = 'd';
		names[4] = 'e';
		
		for (int i = 0; i<5; i++) {
			System.out.println(names[i]);
		}
		
		int[] nm = new int[10];
		for(int i = 0; i<10; i++) {
			nm[i] = i;
		}
		for (int i = 0; i<10; i++) {
			System.out.println(nm[i]);
		}
		// https://www.geeksforgeeks.org/arrays-in-java/?ref=shm
		//MultiDimensional Array
		
		int z[][] = new int[3][3];
		int numb =0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++)
			{
				z[i][j] = numb;
				numb++;
			}
		}
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++)
			{
				System.out.println(z[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
