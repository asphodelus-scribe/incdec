package incdec1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a, b, c, r;	
		a=1; b=1; c=1;
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter number of repetitions");
		r = s.nextInt();
		System.out.println("enter a value");
		a = s.nextInt();
		System.out.println("enter b value");
		b = s.nextInt();
		System.out.println("enter c value");
		c = s.nextInt();
		System.out.println("Initial Values: a="+a+", b="+b+", c="+c);
		run(a,b,c,r);
		s.close();
	}
	
	public static void run(int a, int b, int c, int r) {
		int anew, bnew, cnew;
		for(int i = 0; i<r; i++) {
			anew=inc(a,c);
			bnew=dec(b,a);
			cnew=dec(c,b);
			System.out.println("a="+anew+"    b="+bnew+"    c="+cnew);
			a=anew;
			b=bnew;
			c=cnew;
		}
	}
	
	public static int inc(int x, int n) {
		if(n==0) return x;
		if(x+n<10) return (x+n);
		else return (x+n)-9;
	}

	public static int dec(int x, int n) {
		if(n==0) return x;
		if(x-n<1) return 9-(Math.abs(x-n));
		else return x-n;
	}
	
}

