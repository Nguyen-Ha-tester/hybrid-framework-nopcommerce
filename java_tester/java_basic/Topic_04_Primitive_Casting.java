package java_basic;

public class Topic_04_Primitive_Casting {

	public static void main (String[] arg) {
		
		//Ép kiểu ngầm định: k cần chỉ rõ ép kiểu qua đâu=> k mất dữ liệu vì đi từ bé ra to
	//		byte bNumber = 127;
	//		System.out.println(bNumber);
	//		
	//		short sNumber = bNumber;
	//		System.out.println(sNumber);
	//		
	//		int iNumber = sNumber;
	//		System.out.println(iNumber);
	//		
	//		long lNumber = iNumber;
	//		System.out.println(lNumber);
	//		
	//		float fNumber = lNumber; //float chiếm 32bit, nhỏ hơn long, long chiếm 64bit
	//		System.out.println(fNumber);
	//		
	//		double dNumber = fNumber;
	//		System.out.println(dNumber);
		
		//Kiểu tường minh (cast): chỉ rõ nó qua kiểu gì luôn
		
		double dNumber = 9876543218999999999d;
		System.out.println(dNumber);
		
		float fNumber = (float) dNumber; // từ lớn ra nhỏ thì nó yêu cầu cần cast qua (ép kiểu)
		System.out.println(fNumber);
		
		long lNumber = (long) fNumber;
		System.out.println(lNumber);

		int iNumber = (int) lNumber;
		System.out.println(iNumber);
	}
}
