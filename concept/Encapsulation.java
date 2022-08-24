/*Encapsulation : It is a technique that are used to hide the complexity of the program or hide the private
data from out side of the class.Variable accessed via method is called binding in java*/

import java.util.Scanner;

class Encap{

	int a;
	int b;

	public void setA(int a){

		this.a = a;
	}

	public int getA(){

		return a;
	}

	public void setB(int b){

		this.b = b;
	}

	public int getB(){
		return b;
	}
}


class Encapsulation{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);


		Encap enOb = new Encap();
		enOb.setA(5);
		enOb.setB(6);

		
		System.out.print("The second number is = " + enOb.getA());
		System.out.print("The second number is = " + enOb.getB());
		System.out.println();
	}
}
