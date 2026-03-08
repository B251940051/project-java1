package lab2;
import java.util.Scanner;
public class Lab2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double r, busluuriinUrt;
		System.out.print("raduis oruul: ");
		r = input.nextDouble();
		busluuriinUrt = 2 * Math.PI * r;
		System.out.println("niitUrt = " + busluuriinUrt);
		input.close();
	}
}


