package ua.prog.java.lesson1;

public class Cat {
	
	private String catName;
	private String catColor;
	private double catWeight;
	private String catGender;
	private int catAge;
	
	public Cat(String catName, String catColor, double catWeight, String catGender, int catAge) {
		this.catName = catName;
		this.catColor = catColor;
		this.catWeight = catWeight;
		this.catGender = catGender;
		this.catAge = catAge;
	}
	
	public Cat() {
		
	}

	public String getCatColor() {
		return catColor;
	}
	
	public void setCatColor(String catColor) {
		this.catColor = catColor;
	}
	
	public double getCatWeight() {
		return catWeight;
	}
	
	public void setCatWeight(double catWeight) {
		this.catWeight = catWeight;
	}
	
	public String getCatGender() {
		return catGender;
	}
	
	public void setCatGender(String catGender) {
		this.catGender = catGender;
	}
	
	public int getCatAge() {
		return catAge;
	}
	
	public void setCatAge(int catAge) {
		this.catAge = catAge;
	}
		
	public String getCatName() {
		return catName;
	}
	
	public void setCatName(String catName) {
		this.catName = catName;
	}
	
	public void stop() {
		System.out.println(catName + " has stopped.");
	}
	
	public void run() {
		System.out.println(catName + " starts running..");		
	}
	
	public void voice(String voice) {
		System.out.println(catName + " says: " + voice + "...");
	}
	
	public void eatPlease() {
		System.out.println(catName + "starts eating.");
	}

}
