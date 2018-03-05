package ua.prog.java.lesson1;

public class MainForCat {
	
	/*
	 * описать класс Cat. Наделить его свойствами и методами. Создать несколько
	 * экземпляров этого класса. Использовать эти объекты.
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat smallCat = new Cat();
		smallCat.setCatAge(1);
		smallCat.setCatColor("white");
		smallCat.setCatGender("Female");
		smallCat.setCatName("Kitti");
		smallCat.setCatWeight(3);

		Cat bigCat = new Cat("Star", "blue", 5, "Female", 3 );
		
		Cat fatCat = new Cat();
		fatCat.setCatAge(3);
		fatCat.setCatColor("gray");
		fatCat.setCatGender("Male");
		fatCat.setCatName("Terminator");
		fatCat.setCatWeight(15);
		
		fatCat.run();
		bigCat.run();
		smallCat.run();
		
		fatCat.stop();
		smallCat.voice("Meuuuuu Meuu");
		
	}

}
