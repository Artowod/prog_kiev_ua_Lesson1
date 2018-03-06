package ua.prog.java.lesson1;

public class MainForPhone {

	/*
	 * Описать класс Phone. Одним из свойств должен быть его номер. Также описать
	 * класс Network (Сеть мобильного оператора). Телефон должен иметь метод
	 * регистрации в сети мобильного оператора. Также у телефона должен быть метод
	 * call (номер другого телефона), который переберёт все телефоны,
	 * зарегистрированные в сети. Если такой номер найден, то осуществить вызов,
	 * если нет - вывест сообщение о неправильности набранного номера.
	 * 
	 * 
	 */

	public static void main(String[] args) {
		Network mobileNetworkInstance = new Network();
		Phone firstPhone = new Phone(mobileNetworkInstance);
		firstPhone.setPhoneNumber("0671111115");
		firstPhone.registerNumberInNetwork(mobileNetworkInstance);
		firstPhone.call("0671111115");
		
		Phone secondPhone = new Phone(mobileNetworkInstance);
		secondPhone.setPhoneNumber("0671111115");
		secondPhone.registerNumberInNetwork(mobileNetworkInstance);
		secondPhone.call("0671111515");
	}
}
