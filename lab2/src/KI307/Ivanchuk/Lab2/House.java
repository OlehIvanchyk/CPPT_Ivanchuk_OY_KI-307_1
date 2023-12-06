package KI307.Ivanchuk.Lab2;

import java.io.*;

/**
 *
 * ���� House ������ �������� ������� � �������� ��� ����������� ������ �2
 *
 * @author Ivanchuk
 * @version 1.0
 * @since version 1.0
 */

public class House {
	/** ���� ������ ������������*/
	private String Street;
	/** ���� ������� ��������*/
	private int Num_Floors;
	/** ���� ������� ����*/
	private int Num_Windows;
	
	/** ���� ����� ����� ���������*/
	File file_protocol;
	
	PrintWriter fout;
	
	public House(String Street,int Num_Floors, int Num_Windows)throws FileNotFoundException {
	
		this.Street = Street;
		this.Num_Floors = Num_Floors;
		this.Num_Windows = Num_Windows;
		this.name_protocol();
	}
	

	
	public House() throws FileNotFoundException{
		
		Street = "Default Street";
		Num_Windows = 0;
		Num_Floors = 0;
		
		this.name_protocol();
	}
	
	

	
	/**
	 * ����� ���� ������� ��� fout ����� PrintWriter
	 * @throws FileNotFoundException
	 */
	private void name_protocol()  throws FileNotFoundException{
		file_protocol = new File (Street + ".txt");
		fout = new PrintWriter (file_protocol);
	}
	
	/**
	 * ����� ��� ������������ ������� ����
	 * @param Num_Windows - �������� ����
	 */
	public void set_Num_Windows (int Num_Windows) {
		this.Num_Windows = Num_Windows;
		System.out.print("����������� ������� ���� � ������� �� ������ " + Street + " :" + Num_Windows + "\n");
		
		fout.print("Call -> set_Num_Windows (int Num_Windows) :: ����������� ������� ����: " + Num_Windows + "\n");
		fout.flush();
	}
	
	
	/**
	 * ����� ��� �������  �������� ���� Num_Windows
	 * @return  - Num_Windows
	 */
	
	public int get_Num_Windows() {
		fout.print("Call -> get_Num_Windows:: return Num_Windows(" + Num_Windows + ")\n");
		fout.flush();
		return Num_Windows;
		
	}
	
	
	
	/**
	 * ����� ���������� �������� ���� Street
	 * @param Street - ������
	 */
	
	public void set_Street(String Street) {
		fout.print("Call -> set_Street(String Street):: ����������� ������ " + Street + "\n");
		System.out.print("������ ������ " + this.Street + " �� " + Street + "\n");
		this.Street = Street;
		fout.flush();
	}
	
	/**
	 * ����� ������� �������� ���� Street
	 * @return Street - ������
	 */
	
	public String get_Street() {
		fout.print("Call -> get_Street():: return Street (" + Street + ")\n");
		fout.flush();
		return Street;
		
	}
	
	/**
	 * ����� ���������� �������� ���� Num_Floors
	 * @param Num_Floors - ������� ��������
	 */
	public void set_Num_Floors(int  Num_Floors) {
		fout.print("Call -> set_Num_Floors(String Num_Floors):: ������������ ������� ��������: " + Num_Floors + "\n");
		this.Num_Floors = Num_Floors;
		fout.flush();
	}
	
	
	public int get_Num_Floors() {
		fout.print("Call -> get_Num_Floors():: return Num_Floors(" + Num_Floors + ")\n");
		fout.flush();
		return Num_Floors;
		
	}
		
	public void print_info() {
		
		System.out.print("������: " + Street + "\n ʳ������ ����: " + Num_Windows + "\nʳ������ ��������: " + Num_Floors + "\n\n" );
		
		fout.print("Call -> print_info()");
		fout.flush();
		
		
	}
}
