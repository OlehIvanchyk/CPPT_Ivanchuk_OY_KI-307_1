package KI307.Ivanchuk.Lab4;

/**
 * ������� ��������� ���� ���� ���� �������� �������� ����������� ��� ���������
 * @author Ivanchuk
 *
 */
class CalcException extends ArithmeticException
{
	/**
	 *
	 */
	private static final long serialVersionUID = 6521671207168138886L;
	public CalcException(){}
	public CalcException(String cause)
	{
		super(cause);
	}
}

/**
 * ���� Class_Lab4 ������ ���������� �������� �������� � ������������ ����� �4
 * @author Ivanchuk
 *
 */
public class Class_Lab4 {

	/** ���� �������� ���� � */
	double x = 0.0;
	/** ���� ����������*/
	double result;
	/** ���������� ���������� */
	public Class_Lab4() {
	
	}
	/**
	 * ����� ���������� �������� ���� �
	 * @param x - �����
	 */
	public void set_x (double x) {
		this.x = x;
	}
	
	/**
	 * ����� �������� result = tg(x) / ctg(x)
	 * @param x - �����
	 * @return - ��������� ���������� (�������� ���� result)
	 */
	public double calculate (double x) {
		
		try {
			result = ((Math.sin(x))*(Math.sin(x))) / ((Math.cos(x)) *(Math.cos(x))) ;

		
			throw new ArithmeticException();
		}
		
		catch (ArithmeticException ex){
			
			if (Math.cos(x) == 0) {
				throw new CalcException ("����������: ������ �� 0");
			}
		}
		
		return result;
		
	}

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }
}
