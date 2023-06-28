package chap_02;

public class _01_Operator1 {
	public static void main(String[] args) {
		//산술 연산자
		
		//일반연사
		System.out.println(4 + 2);
		System.out.println(4 - 2);
		System.out.println(4 * 2);
		System.out.println(4 / 2);
		System.out.println(5 / 2);
		System.out.println(2 / 4);
		System.out.println(4 % 2);
		System.out.println(5 % 2);
		
	/*	 증감 연산
		val++;  다른연산 먼저 
		++val;  val+1 먼저 */
		int val;
		val = 10;
		System.out.println(val); //10
		System.out.println(val++); //10
		System.out.println(val); //11
		
		val = 10;
		System.out.println(val); //10
		System.out.println(++val); //11
		System.out.println(val); //11
		
		val = 10;
		System.out.println(val); //10
		System.out.println(--val); //9
		System.out.println(val); //9
		
		val = 10;
		System.out.println(val); //10
		System.out.println(val--); //10
		System.out.println(val); //9

		// 은행 대기번호 표
		int waiting = 0;
		System.out.println("대기 인원 :" + waiting++); //대기인원 : 0
		System.out.println("대기 인원 :" + waiting++); //대기인원 : 1
		System.out.println("대기 인원 :" + waiting++); //대기인원 : 2
		System.out.println("총 대기 인원: " + waiting); // 총대기인원 : 3

	}

}
