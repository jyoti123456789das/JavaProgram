package parameteriseConstructor;

import java.util.Scanner;

public class Methods {

	
		
	 	void add(int a , int b) {
			int c = a+b;
			System.out.println(c);
		}
		void sub (int d,int e) {
			int f =d-e;
			System.out.println(f);
		}
		void mul(int g , int h) {
			int i = g*h;
			System.out.println(i);
	}
		void div(int j , int k) {
			int l = j/k;
			System.out.println(l);
}
		public static void main(String[] args) {
			Scanner s= new Scanner(System.in);
			System.out.println("enter the first number");
			int a=  s.nextInt();
			System.out.println("enter second number");
			int b=s.nextInt();
			Methods m=new Methods();
			m.add(a, b);
			m.sub(a, b);
			m.mul(a, b);
			m.div(a, b);
			
		}
}