package Lab1IvanchukKI307;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


/**
 *
 * ���� Lab1IvanchukKI307 ������ �������� ������� � �������� ��� ����������� ������ �1
 *
 * @author
 * @version 1.0
 * @since version 1.0
 */

public class Lab1IvanchukKI307 {

	
	/**
	 * �������� ����� ����� Lab1IvanchukKI307 ���� ������ ����� ��������
	 * @param args
	 * @throws FileNotFoundException

	 */
	public static void main (String[] args) throws FileNotFoundException
	{
	
	int size;
	char mas[][];
	String sumbol;
	
	Scanner in = new Scanner (System.in);
	File dataFile =  new File("Myfile.txt");
	PrintWriter fout = new PrintWriter (dataFile);
	
	System.out.print("������ ����� ������: ");
	size = in.nextInt();
	in.nextLine();
	
	
	
	
	mas = new char [size][];
	for(int i = 0;i < (size); i++){
		
		mas[i] = new char [i+1];
		
		}
		
	
	
	System.out.print("������ ������ ����������: ");
	sumbol = in.nextLine();
	
	if(sumbol.length() == 0)
		System.out.print("�� �� ����� ������!!!");
	
	else if(sumbol.length() > 1 )
		System.out.print("�� ����� ����� ������ �������!!!");
	else if(sumbol.length() == 1) {
		
		for(int i = 0;i < size ; i++) {
			
				for(int k = 0; k < size - mas[i].length; k++) {
					System.out.print(" ");
					fout.print(" ");
					
				}
				
				for(int j = 0; j < mas[i].length; j++) {
					mas[i][j] = (char) sumbol.codePointAt(0);
					System.out.print(mas[i][j]);
					fout.print(mas[i][j]);
			}
		System.out.print("\n");
		fout.print("\n");
		
	}
		}
	
	
	fout.flush();
	fout.close();
	}
}

