package object;

/*���� ������
+(public) Ŭ������ �ݵ�� public ���. �ܺο����� ������ ����Ѵٴ� �ǹ�.
-(private),#(protected), (defalut)��ø� �����ʴ°��
UML �������� �𵨸� ���
Unit       //Ŭ������
-------
+          // public,����
+
-------
+		   // �Լ�
+


����

Ŭ������: Person
+name: String
+age: Int
+score:float


+setPerson(name:String,a:int,s:float):void
+viewPerson():void
*/
class Person { //�����̸��� ���ؼ� �տ� public�� ���� �ȱ׷� ������.
	public String name;   //��������, �������(Ŭ������ ������ �ִ� ���� )---��ü���⿡���� �ʵ��� ��. 
	public int age;
	public float score;
	public void setPerson(String name, int age, float s) { //����Լ�---->�޼���(method)
				//set���� �����ϴ� ������ �ϴ� ������ ���� �̸��տ� set�ٿ���
		//����-���-��� ��
		this.name=name; //this. : �ڱ� �ڽ��� ��ü�� �ǹ�.
		this.age=age;
		score=s;
	}
	public void viewPerson() {
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
		System.out.println("���� : "+score);
	}
}
public class ObjectEx1 {

	public static void main(String[] args) {
		int a=0; // ���� ���� //�������� ��������� ������ ����������� ��.
		Person ps=new Person(); //��ü ����
		//��ü , ������Ʈ, �ν��Ͻ�, Ŭ���� ----> ������ �Լ��� ����.
		//Ŭ������ ������Ʈ�� �ν��Ͻ�---> ��ü
		//Ŭ���� ���̾�׷�--->Ŭ������ ���� ����
		
		ps.setPerson("�Ƿη�", 23, 73.5f); //ps. : ps�� �������ִ� �̶�� ��.
		ps.viewPerson();
		System.out.println("�Ƿη� �ؽ�: "+ps.hashCode());
		// hashCode() �ؽ��ڵ�: ��ü ������ ���� ������ �������� ������ִ� �޼���
		
//		a=0;
//		a=100; //�������� ����. ps���� �ٽ� �ʱ�ȭ ���־����.
		ps=new Person();  //�޸� �� �Ƿη� �����Ͱ� ���������� ps������ ������ ������ �Ұ�.
		ps.setPerson("ũ��", 20, 85.5f);
		ps.viewPerson();
		System.out.println("ũ�� �ؽ�: "+ps.hashCode());
		System.out.println(ps.toString());
		System.out.println(ps); //��ü���� ���: ��ü �����ּ� ����
		
	}

}
