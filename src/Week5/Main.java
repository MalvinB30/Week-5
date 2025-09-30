package Week5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s = new Scanner(System.in);
			
			System.out.println("Masukan jari-jari lingkaran: ");
			double radius = s.nextDouble();
			System.out.println("Masukan warna: ");
			String color = s.next();
			
			Circle circle = new Circle(radius, color);
			System.out.println("-----------Lingkaran----------");
			System.out.println("Warna: " +circle.getColor());
			System.out.println("Jari-jari: " +circle.getRadius());
			System.out.println("Keliling Lingkaran: " +circle.getPerimeter());
			System.out.println("Luas Lingkaran: " +circle.getArea());
			s.close();
	}

}