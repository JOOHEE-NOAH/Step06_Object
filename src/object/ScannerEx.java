package object;

import java.util.Scanner;

//�Է�ó�� ��ü
public class ScannerEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("���ڿ� : "); String str=sc.nextLine();
		System.out.print("���� : "); int a=sc.nextInt();
		System.out.print("�Ǽ� : "); double b=sc.nextDouble();
		System.out.print("���� : "); char c=sc.next().charAt(0);
		
		System.out.println(str);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		sc.close(); //�Է��� �ݺ��ؼ� �޾ƾ��ϴ� ��쿡�� ������� �ʵ��� �Ѵ�.
		
	}

}
