package incdec1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean flag = true;
		int numReps;
		int c, x, n;
		c=1; x=1; n=1;
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter number of repetitions");
		numReps = s.nextInt();
		System.out.println("enter c value");
		c = s.nextInt();
		System.out.println("enter x value");
		x = s.nextInt();
		System.out.println("enter n value");
		n = s.nextInt();
		System.out.println("Initial Values: c="+c+", x="+x+", n="+n);
		run(c,n,x,numReps);
	}
	
	public static void run(int c, int n, int x, int r) {
		int cnew, xnew, nnew;
		cnew=c;
		xnew=x;
		nnew=n;
		for(int i = 0; i<r; i++) {
			cnew=inc(c,n);
			xnew=dec(x,c);
			nnew=dec(n,x);
			System.out.println("c="+cnew+"    x="+xnew+"    n="+nnew);
			c=cnew;
			x=xnew;
			n=nnew;
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

