package KI307.Ivanchuk.Lab3;

import java.io.FileNotFoundException;

import KI307.Ivanchuk.Lab2.*;

/**
 * �������� ���� ����� ������� get_Office() i get_Office(), �� ����� number
 * @author Ivanchuk
 *
 */
interface Num_Office{
	
	int number_Office = 0;
	void set_Office(int number);
	int get_Office();
	
	
}

/**
 * ���� Office ����� �������� ��� ������ � ����������� ����� �3
 * @author Ivanchuk
 *@version 1.0
 */

public class Office extends House implements Num_Office{

	/**
	* ʳ������ �����
	*/
	private int number_Office;
	
	public Office(int number) throws FileNotFoundException{
		this.number_Office = number;
	}

	/**
	 * ����� ���������� ������� �����
	 * @param number - ������� �����
	 */
	public void set_Office(int number) {
		System.out.print("ʳ������ ����� :" + this.number_Office + " ������ �� " + number + "\n");
		this.number_Office = number;
	}
	
	/**
	 * ����� ������� ������� �����
	 * @return ������� �����
	 */
	public int get_Office() {
		System.out.print("ʳ������ �����" + number_Office + "\n");
		return number_Office;
	}


}


