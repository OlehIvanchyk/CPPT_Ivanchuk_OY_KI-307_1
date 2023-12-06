package KI307.Ivanchuk.Lab4;

import java.io.*;
import java.util.*;

/**
 * ���� ������ �������� ����������� ����� �5
 * @author Ivanchuk
 *@version 1.0
 */
public class Lab5_Class {
	/**��� ����� ��� ���������*/
	String fname;
	/** ���� ����������*/
	double result;
	
	public Lab5_Class() {
		}

	/** ����������� ����� �� ������������ ����� �����*/
	public Lab5_Class(String fname)
	{
		this.fname = "Lab5_" + fname;
		
	}

	/**
	 *  ����� ������������ ���� fname
	 * @param fname - ��� �����
	 */
	
	public void set_fname(String fname){
		this.fname = "Lab5_" + fname;
		
	}
	
	/**
	 * ����� ������ � ���� txt ��������� result
	 * @param result
	 */
	public void writeRes_txt( double result) {
		try {
			PrintWriter fout = new PrintWriter(fname + ".txt");
			fout.printf("%f ",result);
			fout.flush();
			fout.close();
		}
		catch(FileNotFoundException ex) {
			System.out.print("Exception: File Not Found\n");
		}
	}
	
	/**
	 * ����� ���� � ����� txt � ������ �������� result
	 * @return result 
	 * @throws IOException
	 */
	public double readRes_txt() throws IOException {
		
		try {
			Scanner in = new Scanner(new File(fname + ".txt"));
			result = in.nextDouble();
			in.close();
		}
		catch(FileNotFoundException ex) {
			System.out.print("Exception: File Not Found\n");
		}
		return result;
	}
	
	/**
	 * ����� ������ � ���� dat ��������� result
	 * @param result
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public void writeRes_bin (double result) throws FileNotFoundException, IOException {
		DataOutputStream fout = new DataOutputStream(new FileOutputStream(fname + ".dat"));
		fout.writeDouble(result);
		fout.close();
	}
	
	/**
	 *  ����� ���� � ����� dat � ������ �������� result
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public double readRes_bin() throws FileNotFoundException, IOException
	{
		DataInputStream f = new DataInputStream(new FileInputStream(fname  + ".dat"));
		result = f.readDouble();
		f.close();
		return result;
	}




}
