package great_learning_Java_Course;

// Functions in Java
public class Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sparta();
		add(2, 3);
		
		Functions obj =new Functions();
		int x = 2;
		int y = 69;
		int get_result = obj.sum(x, y);
		
		System.out.println(get_result);
		
		swapFunction(x, y);
		
		// area circle
		int r = 5;
		float circle = obj.area(r);
		
		// area rectangle
		int rec = obj.area(x, y);
		System.out.println("Area of the circle is " + circle + "cm2 and area of rectangle is " + rec + "cm2");
	}
	
	// static function
	public static void sparta() {
		System.out.println("This is sparta! ...");
	}
	
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void swapFunction(int a, int b) {
		System.out.println("Before swapping, a = " + a + " and b = " + b);
		
		int c = a;
		a = b;
		b = c;
		System.out.println("After swapping, a = " + a + " and b = " + b);;
	}
	
	// non-static
	public int sum(int num1, int num2) {
		int result = num1+num2;
		return result;
	}
	
	  //Method Over-Loading
	public float area(int n) {
		float result = 3.14f*n*n;
		return result;
	}
	public int area(int n1, int n2) {
		int result = n1*n2;
		return result;
	}
	
}
