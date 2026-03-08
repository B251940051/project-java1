package lab5;
import java.util.Scanner;
public class Statistics {
	static double mean(double a, double b) {
        return (a + b) / 2;
        }
	static double mean(double a, double b, double c) {
        return (a + b + c) / 3;
        }
	static double mean(double a, double b, double c, double d) {
        return (a + b + c + d) / 4;
        }
	static double mean(double a, double b, double c, double d, double e) {
        return (a + b + c + d + e) / 5;
        }
	static double sd(double a, double b) {
        double m = mean(a, b);
        return Math.sqrt(((a - m)*(a - m) + (b - m)*(b - m)) / 2);
        }
	static double sd(double a, double b, double c) {
        double m = mean(a, b, c);
        return Math.sqrt(((a-m)*(a-m)+(b-m)*(b-m)+(c-m)*(c-m))/3);
        }
	static double sd(double a, double b, double c, double d) {
        double m = mean(a, b, c, d);
        return Math.sqrt(((a-m)*(a-m)+(b-m)*(b-m)+(c-m)*(c-m)+(d-m)*(d-m))/4);
        }
	public static double sd(double a, double b, double c, double d, double e) {
        double m = mean(a, b, c, d, e);
        return Math.sqrt(((a-m)*(a-m)+(b-m)*(b-m)+(c-m)*(c-m)+(d-m)*(d-m)+(e-m)*(e-m))/5);
        } 
	static double meanVar(double... a) {
	 
 }	 
       
}
