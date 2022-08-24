/*

Throws Keyword : We sue throws keyword after function to handle the exception.


*/




import java.io.*;

class throwsKeyword{
	public static void main(String[] args) throws ArithmeticException, IOException {
		int a = 100;
		int b = 100;
		int c =10;

		try{

			int d = c / (a - b);
			System.out.println(d);

		}catch(ArithmeticException e){
			System.out.println(e);
		}
	}
}