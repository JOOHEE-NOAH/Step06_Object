package object;

import java.util.Scanner;

class MemberPhone{
	 // ���� �Ҷ� �ܺο��� �����ؾ���. �׷��� �ٸ� �������� ��밡��
	private String name;
	private String phone;
	
	public void input() { // �ް����ϸ� �ݵ�� public�Լ� ������. �׷��� ���ٰ���.
		//��ĳ��  ���� ��ü�� ���� ����ؾ���.
		Scanner sc=new Scanner(System.in); //��ĳ�� ��ü ������ �Է� �ҽ� ���(System.in:Ű���忡�� �Է¹ްڴٴ� �ǹ�)
		System.out.print("�̸��� �Է��ϼ��� : ");  name=sc.nextLine(); //�ٴ��� �Է�.
		System.out.print("��ȭ�� �Է��ϼ��� : ");  phone=sc.nextLine();
		}
	public void output() {
//		System.out.println("�̸� : "+name);
//		System.out.println("��ȭ : "+phone);
		System.out.println(name+"������ ��ȭ��ȣ�� "+phone+"�Դϴ�.");
	}
}
public class ObjectEx6 {

	public static void main(String[] args) {
		MemberPhone mp=new MemberPhone();
		mp.input();
		mp.output();
		
		
			
	}

}
