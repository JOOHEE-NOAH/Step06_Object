package object;

/*Ŭ������: Sales
-item:String
-qty:int
-cost:int
+setter
+getter

+toString():String <--- ��¹���
+getPrice():int    <---- ����*�ܰ��� ����



ǰ�� : apple	<-----toString()�� �̿��Ͽ� ���
���� : 5
�ܰ� : 1200��
�ݾ� : 6000��



apple 1200�� ¥�� 5�� �����Ϸ��� 6000���� �ʿ���    <---getter�� �̿��Ͽ� main���� ���



*/
class Sales{
	private String item;
	private int qty;
	private int cost;
	
	public int getPrice() {  //�� setPrice()�� �ʿ��Ѱ� �ƴ�
		return cost*qty;
	}
	
	public String getItem() {
		return item;
	}
	public int getQty() {
		return qty;
	}
	public int getCost() {
		return cost;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
	
	
	
	public String toString() { //����� �����ְ� ���� ���ڿ��� ����� �Լ�
		return "ǰ�� : "+item+"\n���� : "+qty+"\n�ܰ� : "+cost+"��\n�ݾ� : "+ getPrice() +"��";              //
	}
	
}


public class ObjectEx5 {

	public static void main(String[] args) {
		Sales em=new Sales();	//��������
		em.setItem("apple"); //�ʱ�ȭ, ���� ����
		em.setQty(5);
		em.setCost(1200);
		
		
		System.out.println(em.toString());//.toString()��������.
	
		System.out.println();
		
		
		System.out.println(em.getItem()+em.getCost()+"�� ¥�� "+em.getQty()+"�� �����Ϸ��� "+em.getPrice()+"���� �ʿ���");
		

		
		
	
	}

}
