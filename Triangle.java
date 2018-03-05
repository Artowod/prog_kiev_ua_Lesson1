package ua.prog.java.lesson1;

public class Triangle {
	private int firstTriangleSide;
	private int secondTriangleSide;
	private int thirdTriangleSide;
		
	public Triangle(int firstTriangleSide, int secondTriangleSide, int thirdTriangleSide) {
		super();
		this.firstTriangleSide = firstTriangleSide;
		this.secondTriangleSide = secondTriangleSide;
		this.thirdTriangleSide = thirdTriangleSide;
	}
	
	public Triangle() {
		
	}

	public int getFirstTriangleSide() {
		return firstTriangleSide;
	}

	public void setFirstTriangleSide(int firstTriangleSide) {
		this.firstTriangleSide = firstTriangleSide;
	}

	public int getSecondTriangleSide() {
		return secondTriangleSide;
	}

	public void setSecondTriangleSide(int secondTriangleSide) {
		this.secondTriangleSide = secondTriangleSide;
	}

	public int getThirdTriangleSide() {
		return thirdTriangleSide;
	}

	public void setThirdTriangleSide(int thirdTriangleSide) {
		this.thirdTriangleSide = thirdTriangleSide;
	}
	
	public double triangleArea () {
		double result = 0;
		double perimeter;
		double halfPerimeter;
		perimeter = firstTriangleSide + secondTriangleSide + thirdTriangleSide;
		halfPerimeter = perimeter / 2;
		result = Math.sqrt((double) (halfPerimeter * (halfPerimeter - firstTriangleSide) * (halfPerimeter - secondTriangleSide) * (halfPerimeter - thirdTriangleSide)));
		return result;
	}
	
	
	
	
	

}
