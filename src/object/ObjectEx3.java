package object;
//setter: ������� �ϳ��� �ϳ��� ���� �����ϴ� �Լ�
//getter: ������� �ϳ��� �ϳ��� ��(setter�� ������ ��)�� �����ϴ� �Լ�
class Member{
	private String name;
	private int age;
	private double tall;
	
	public void setName(String name){//setter //�ۺ����� �����ؾ� �ܺο��� ���ٰ���
	 this.name=name;
	}
	
	public void setAge(int age){
	this.age=age;
	}
	public void setTall(double tall) {
		this.tall=tall;
	}
	
	public String getName() { //getter
		return name;	
	}
	public int getAge() {
		return age;
	}
	public double getTall() {
		return tall;
	}
	}
public class ObjectEx3 {

	public static void main(String[] args) {
		Member ob=new Member();
		ob.setName("�Ƿη�");
		ob.setAge(23);
		ob.setTall(175.5);
		System.out.println("�̸� : "+ob.getName());
		System.out.println("���� : "+ob.getAge());
		System.out.println("���� : "+ob.getTall());
	}

}
