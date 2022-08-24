/*
finally keyword : The finally keyword are used to create a block of code
that allows a try block.A finally bloxk of code always get execute whether or not an exception has
occured.using a finally block allow you to run any cleanup-type statement that you just
wish to execute, despite what happens within the protected code.

*/




class finallyKeyword{
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		int c = 200;

		try{

			int d = c / ( a - b );
			System.out.println(d);
		}catch(ArithmeticException e){
			System.out.println(e);
		}finally{

			System.out.println("I always executes whether an exception has ocuured or not");
		}
	}
}