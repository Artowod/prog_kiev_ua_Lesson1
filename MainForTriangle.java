package ua.prog.java.lesson1;

public class MainForTriangle {
	
	/*
	 * Описать класс Triangle. в качестве свойств взять длины сторон треугольника. 
	 * реализовать метод, который возвращает площадь. создать несколько объектов данного 
	 * класса и протестировать их.
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangle firstTriangle = new Triangle(5, 6, 8);
		System.out.println("The Area of the first Triangle is: " + firstTriangle.triangleArea());
		
		Triangle secondTriangle = new Triangle(2, 4, 4);
		System.out.println("The Area of the second Triangle is: " + secondTriangle.triangleArea());
		
		Triangle thirdTriangle = new Triangle(12, 15, 18);
		System.out.println("The Area of the third Triangle is: " + thirdTriangle.triangleArea());
		
		Triangle lastTriangle = new Triangle();
		lastTriangle.setFirstTriangleSide(12);
		lastTriangle.setSecondTriangleSide(11);
		lastTriangle.setThirdTriangleSide(10);
		System.out.println("The Area of the Last Triangle is: " + lastTriangle.triangleArea());
		
		
	}

}
