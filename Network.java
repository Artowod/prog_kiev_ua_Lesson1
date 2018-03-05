package ua.prog.java.lesson1;

import java.util.ArrayList;
import java.util.List;

public class Network {
	/*
	 * ������� ����� Phone. ����� �� ������� ������ ���� ��� �����. ����� �������
	 * ����� Network (���� ���������� ���������). ������� ������ ����� �����
	 * ����������� � ���� ���������� ���������. ����� � �������� ������ ���� �����
	 * call (����� ������� ��������), ������� �������� ��� ��������,
	 * ������������������ � ����. ���� ����� ����� ������, �� ����������� �����,
	 * ���� ��� - ������ ��������� � �������������� ���������� ������.
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
