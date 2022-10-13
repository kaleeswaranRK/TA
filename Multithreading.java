package ashwin;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Multithreading extends Thread{
	static Map<String, Integer> a = new HashMap<>();
	static String products[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		a.put("Tea", 10);
		a.put("Coffee", 50);
		a.put("Biscuit", 20);
		a.put("boost", 30);
		a.put("horlicks", 30);
		a.put("lemon tea", 10);
		System.out.println("Enter the number of products you want:");
		int n = sc.nextInt();
		products = new String[n];
		for (int i = 0; i < n; i++) {
			products[i] = sc.next();
		}
		RunClass r= new RunClass();
		Thread t1 = new Thread(r);
		RunClass2 t2=new RunClass2();
		t1.start();
		t2.start();

	}
}
