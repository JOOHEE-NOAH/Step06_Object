package object;
//�̸��� �Ƿη��̰� ���ߺο� �ٹ��ϸ� �޿��� 1500000��, �Ի缺����85.75���Դϴ�.
/*
 * 
 * 
 * 
 * setEmployee()�� �̿��Ͽ� ���� �����ϰ� ����ϼ���
 * ����̸� : ���޷�
 * �ٹ��μ� : �ѹ���
 * �޴±޿� : 1500000��
 * �Ի缺�� : 85.75��

*/
public class ObjectEx4 {

	public static void main(String[] args) {
		
		int a; // ���� ����
		a=100; // �ʱ�ȭ, ���� ���� 
		// ���
		System.out.println(a); //��� ���
		
		Employee em=new Employee();	//��������
		em.setName("�Ƿη�"); //�ʱ�ȭ, ���� ����
		em.setDept("���ߺ�");
		em.setPay(1500000);
		em.setScore(85.75);
		
		System.out.println(em.toString());
	
		System.out.println();
		
		
		em=new Employee();//��ü�� ������� �ʱ�ȭ
		em.setEmployee( "���޷�", "�ѹ���", 1500000, 85.75);// �ʰ�ȭ, ���� ����
		System.out.println("����̸� : "+em.getName());
		System.out.println("�ٹ��μ� : "+em.getDept());
		System.out.println("�޴±޿� : "+em.getPay()+"��");
		System.out.println("�Ի缺�� : "+em.getScore()+"��");
		
		Employee ob=new Employee();//���ο� ���� �������� �տ� Employee ���;���
		ob.setEmployee( "���޷�", "�ѹ���", 1500000, 85.75); //ob �ʱ�ȭ�� ����
		
		System.out.println("����̸� : "+ob.getName());
		System.out.println("�ٹ��μ� : "+ob.getDept());
		System.out.println("�޴±޿� : "+ob.getPay()+"��");
		System.out.println("�Ի缺�� : "+ob.getScore()+"��");
		}
	}	
	
		
	

