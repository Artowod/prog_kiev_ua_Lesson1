package ua.prog.java.lesson1;

public class MainForPhone {

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

	public static void main(String[] args) {
		Phone newPhone = new Phone("0671111115");
		Network mobileNetworkInstance = new Network();
		newPhone.registerNumberInNetwork(mobileNetworkInstance);
		newPhone.call(mobileNetworkInstance, "0671111115");
	}

}
