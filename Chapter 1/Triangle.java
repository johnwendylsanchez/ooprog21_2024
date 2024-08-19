//Triangle.java
//Chapter 1
import java.util.*; 
class pattern { 
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the number of rows to be printed"); 
		int rows = sc.nextInt(); 
      
		for (int a = 1; a <= rows; a++) { 
      
			for (int b = rows; b >= a; b--) { 
				System.out.print(" "); 
			} 

			for (int b = 1; b <= a; b++) { 
				System.out.print("* "); 
			} 

			System.out.println(); 
		} 
	} 
} 
