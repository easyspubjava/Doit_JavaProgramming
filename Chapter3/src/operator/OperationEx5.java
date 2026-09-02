package operator;

public class OperationEx5 {

	public static void main(String[] args) {
		int num = 0B00000101;  //5 �� �������� ��Ÿ�� (8��Ʈ)
		 
		System.out.println(num << 2);   //�������� 2��Ʈ �̵� 00010100 (20)
		System.out.println(num >> 2);   //���������� 2��Ʈ �̵� 00000001 (1)
		System.out.println(num >>> 2);  //���������� 2��Ʈ �̵� 00000001 (1)
		System.out.println(num);
		
		num = num << 2;  //�������� 2��Ʈ �̵��� ���� �ٽ� num�� ����
		System.out.println(num);
	}
}
