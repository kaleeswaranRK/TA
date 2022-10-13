package ashwin;

import java.util.Scanner;

public class Gears extends Bike {
	public static void main(String args[]) {
		System.out.println("Enter gear number");
		Gears z = new Gears();
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		int temp = 0;
		
			switch (a) {
			case 1:
				z.gear1();
				break;
			case 2:
				z.gear2();
				break;
			case 3:
				z.gear3();
				break;
			case 4:
				z.gear4();
				break;
			default:
				System.out.println("Invalid gear level");
				break;
			}
			System.out.println("Enter break:");
			String bre=sc.next();
			if (bre.equalsIgnoreCase("yes") ) {
				z.Bbreak(a);
			} else {
				temp = a;
			}
			

			
		
		

	}

}
