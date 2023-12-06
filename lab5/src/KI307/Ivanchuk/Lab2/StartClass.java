package KI307.Ivanchuk.Lab2;
import KI307.Ivanchuk.Lab3.*;

import java.io.FileNotFoundException;



/**
 * ���� ���� ������ ��������� ����� ���� ����� ����� ����� ����� � ��������
 * @author Ivanchuk
 *
 */
public class StartClass {

		public static void main (String[] args) throws FileNotFoundException {
			
	
			System.out.print("---------------------------lab 2-----------------------------\n");

			
			
			
					House MyHouse = new House("Shevchenka", 5 , 100);
					
					System.out.print("������: " + MyHouse.get_Street() + "\nʳ������ ����: " + MyHouse.get_Num_Windows()+ "\nʳ������ ��������: " + MyHouse.get_Num_Floors() + "\n\n");
					
					
					
					
					
					
					
//   ---------------------------lab 3-----------------------------
					
					
					
			System.out.print("---------------------------lab 3-----------------------------\n");
					
			Office MyOffice= new Office(20);
			
			
			MyOffice.set_Office(25);

		}
	}


