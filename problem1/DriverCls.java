package problem1;

import java.util.Scanner;

public class DriverCls {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the total number of floors in the building");
		int floors = sc.nextInt();
		FloorConstruction fc = new FloorConstruction();
		fc.getFloorSize(floors);
		fc.constructionOrder();		
		sc.close();

	}
	
}
