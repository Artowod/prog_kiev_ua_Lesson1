package ua.prog.java.lesson1;

public class Phone {
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

	private static String phoneNumber;
	
	public Phone(String phoneNumber) {
		this.phoneNumber = phoneNumber;		
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void registerNumberInNetwork(Network mobileNetworkInstance) {
		mobileNetworkInstance.registerNumber(phoneNumber);
	}

	public void call(Network mobileNetworkInstance, String outboundCallNumber) {
		Boolean isNumberRegistered = mobileNetworkInstance.checkOutboundCallNumber(outboundCallNumber);
		if (isNumberRegistered) {
			System.out.println("Target mobile number " + outboundCallNumber + " is valid. Initiate the dialing...");
		} else {
			System.out.println("Sorry. " + outboundCallNumber + " number is not registered in the network. ");
		}
	}
}
