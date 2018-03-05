package ua.prog.java.lesson1;

import java.util.ArrayList;
import java.util.List;

public class Network {
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

	protected ArrayList<String> registeredNumbersList = new ArrayList<String>();

	public Network() {
		registeredNumbersList.add("0671111111");
		registeredNumbersList.add("0672222222");
		registeredNumbersList.add("0973333333");
	}

	public void registerNumber(String newNumber) {
		Boolean isAlreadyRegisteredNumber = registeredNumbersList.contains(newNumber);
		if (isAlreadyRegisteredNumber) {
			System.out.println(newNumber + " number is already in the Network.");
		} else {
			registeredNumbersList.add(newNumber);
			System.out.println(newNumber + " number has been successfully registered in the Network.");
		}
	}

	public Boolean checkOutboundCallNumber(String outboundCallNumber) {
		Boolean isRegisteredNumber = registeredNumbersList.contains(outboundCallNumber);
		if (isRegisteredNumber) {
			return true;
		} else {
			return false;
		}
	}

}
