package KI307.Ivanchuk.Lab6;

import java.util.*;
import java.io.*;



/**
 *
 * �� ���� ���� ������ ��������� ����� main ���� ��������� ������ ����� � ��������
 * @author Ivanchuk
 */
public class C�ase
{

	
	
	
/**
 * ����� main � ������ ����� � ��������
 * @param args
 */
public static void main(String[] args)
    {
	�ase <? super Items> MyConveyor = new �ase <Items>();
	
    MyConveyor.AddData(new PP�ase("Andry", 6 , 2));
	MyConveyor.AddData(new Pencil�ase("Taras"	,12));
	MyConveyor.AddData(new Pencil�ase("Anton"	, 4));
	MyConveyor.AddData(new PP�ase("Roman", 7 , 22));

	Items res = MyConveyor.findMax();
	System.out.print("The minimum number of handles is: \n");
	res.print();
	}
}



/**
 * ���� ������ �����
 * @author Ivanchuk
 * @param <T>
 */
class �ase <T extends Items>{
	private ArrayList<T> arr;

	public �ase(){
		arr = new ArrayList<T>();
	}

	
	
	public T findMax(){
		if (!arr.isEmpty())
		{
			T max = arr.get(0);
			for (int i=1; i< arr.size(); i++)
			{
				if ( arr.get(i).compareTo(max) < 0 )
					max = arr.get(i);
			}
			return max;
		}
		return null;
	}

	
	public void AddData(T data){
		arr.add(data);
		System.out.print("Element added: ");
		data.print();
	}
	public void DeleteData(int i){
		arr.remove(i);
	}
}

	

/**
 * �� ���������� ���� ����� 2 ������
 * @author Ivanchuk
 *
 */
interface Items extends Comparable<Items>{
		public int getNumPencils();
		public void print();
	}





/**
 * ��� ���� ������� ����� ��� ������ � �����
 * @author Ivanchuk
 *
 */
class PP�ase implements Items
{
	private String Owner;
	private int NumPen;
	private int NumPencils;

	
	
	public PP�ase(String Owner, int NumPen, int NumPencils){
		this.Owner = Owner;
		this.NumPen = NumPen;
		this.NumPencils = NumPencils;
	}
	
	/**
* ����� ������� ��� ��������
* @return Owner
*/
	public String get_�ollecting(){
		return Owner;
	}

	
	/**
	 * ����� ���������� �������� ���� Owner
	 * @param Owner
	 */
	
	public void set_Owner(String name){
		Owner = name;
	}

	public int getNumPen(){
		return NumPen;
	}

	
	
	public void setNumPen(int n){
		NumPen = n;
	}

	
	public void  getNumPencils(int positions) {
		this.NumPencils = positions;
	}
	
	
	public int getNumPencils(){
		return NumPencils;
	}

	
	
	public int compareTo(Items p){
		Integer s = NumPencils;
		return s.compareTo(p.getNumPencils());
	}

	
	/**
	 * ���� ���������� ��� �����
	 *
	 */
	public void print(){
			System.out.print("Owner: " + Owner + ", Number pen: " + NumPen + ", Number pencils: " + NumPencils + ";\n");
	}
}






/**
 *���� ������� ����� ��� ������
 * @author Ivanchuk
 *
 */


class Pencil�ase implements Items {
	private String Owner;
	private int NumPencils;

	public Pencil�ase(String Owner, int NumPencils){
		this.Owner = Owner;
		this.NumPencils = NumPencils;
	}

	public String getOwner(){
		return Owner;
		}

	public void set_Owner(String name){
		Owner = name;
	}

	public void Set_NumPencils(int n){
		NumPencils = n;
	}

	public int getNumPencils(){
		return NumPencils;
	}

	public int compareTo(Items p){
		Integer s = NumPencils;
		return s.compareTo(p.getNumPencils());
	}
	
	public void print(){
		System.out.print("Owner: " + Owner + ",  Number pencils: " + NumPencils + ";\n");
	}
}
