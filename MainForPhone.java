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
		Phone newPhone = new Phone("0671111115");
		Network mobileNetworkInstance = new Network();
		newPhone.registerNumberInNetwork(mobileNetworkInstance);
		newPhone.call(mobileNetworkInstance, "0671111115");
	}

}
