package lab2;
import java.util.Scanner;
public class Lab2b {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a, b;
		double aripmetic, geometr;
		System.out.print("a toog oruulna uu: ");
		a = input.nextDouble();
		System.out.print("b toog oruulna uu: ");
		b = input.nextDouble();
		aripmetic = (a + b) / 2;
		geometr = Math.sqrt(a * b);
		System.out.println("aripmetic dundaj = " + aripmetic);
        System.out.println("geometr dundaj = " + geometr);
        input.close();
        }	
}

