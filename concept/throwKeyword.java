/*

@Throw Keyword : We use throw keyword when you want to create our own exception or if
we want to occur some exception.

*/




import java.lang.*;

class throwKeyword{

	public static void main(String[] args) {
		
		int a = 10;
		int b = 10;
		int c;

		try{

			c = a * b;

			if(c > 10){

				throw new ArithmeticException();
			}

			System.out.println(c);
		}catch(ArithmeticException e){

			System.out.println(e);

		}
		System.out.println("Hello Muhammad Tofik");
	}
}