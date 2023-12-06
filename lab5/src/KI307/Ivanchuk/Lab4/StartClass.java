package KI307.Ivanchuk.Lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Ivanchuk
 * @version 1.0
 *
 */
public class StartClass {
	
	/**
	 *
	 * @param args
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		String fname = "default_name";
		
		double result = 0.0;
		
		try {
			System.out.print("������ ����� �����: ");
			try (Scanner in = new Scanner(System.in)) {
				fname = in.nextLine();
				PrintWriter fout = new PrintWriter (new File(fname + ".txt"));
				try {
					
					try {
						Class_Lab4 obj = new Class_Lab4();
						System.out.print("������ �������� �: ");
						result = obj.calculate(in.nextDouble());
						fout.print(result);
					}
					finally {
						fout.flush();
						fout.close();
					}
				
				}
				catch(CalcException ex) {
					
					System.out.print(ex.getMessage());
				}
			}
		}
		catch (FileNotFoundException ex) {
			System.out.print("����������: �� ����� �� �������� ����� �����\n");
		}
		
		/** �������� ����������� ������ �5*/
		System.out.print("----------------LAb5------------\n");
		
		Lab5_Class obj = new Lab5_Class (fname);
		
		obj.writeRes_txt(result);
		System.out.print("txt --- " + obj.readRes_txt() + "\n");

		obj.writeRes_bin(result);
		System.out.print("dat --- " + obj.readRes_bin());
	
		
	
	}

}
