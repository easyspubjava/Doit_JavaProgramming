package bitop;

public class OperationEx5 {

	public static void main(String[] args) {
		int num = 0B00000101;  //5
		 
		System.out.println(num << 2); //20
		System.out.println(num >> 2); //1
		System.out.println(num >>> 2); //1
		System.out.println(num);
		
		num <<= 2;
		System.out.println(num);
	}
}
