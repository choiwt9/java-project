package com.kh;

public class VariablPractice0 {
	
	public static void main(String[] args) {
		
		/*예제 1) 변수를 사용하여 아래 코드를 이해하기 쉽도록 변경해보기
		 * 연도에 해당하는 값을 정수형int타입의 year이름의 변수로 선언
		 * 현 연도를 year 변수에 대입
		 * 나이에 해당하는 값을 int타입의 age이름의 변ㅅ수로 선언 대입
		 */
		//변수를 사용하지 않은 경우
		System.out.println("[1] 현재 2024년이고 올해 30살입니다.");
		//변수 선언 및 대입
		
		int year; //정수형 변수 year이라는 이름으로 선언
		year = 2024; //year라는 변수에 2024 라는 값을 대입
		
		int age = 30; // 정수형 변수 age라는 이름으로 선언 및 2-이라는 값을 대입
		
		System.out.println("[2] 현재" + year + "년이고 " + age + "살입니다");
		System.out.printf("[3] 현재 %d년이고, 올해 %d살입니다\n",year,age);
		//----------------------------
/*변수명 명명 규칙
 -카멜케이스: 소문자로 시작하고, 다음 단어의 첫글지를 대문자로 작성하는 방범
 -숫지 시작 불가
 -특수문자'_', '$'만 사용 가능
 -예약어 사용 불가
 -대소문자를 구분한다 */
		//
/* 상수: 변하지 않는 값을 저장하는 공간
    -final 예약어를 사용*/	
//"몸무게가 80kg 이상인 경우 탑승을 못합니다." -> 상수명 light weight
//상수선언
		final int LIGHT_WEIGHT = 80;
	
//상수를 사용하여 메시지 출력
		System.out.println("몸무게가 " + LIGHT_WEIGHT +"kg 이상인 경우 탑승을 못합니다.");
//-------------------------------------------------------------------------------
		/*형변환 : 연산을 할 때 자료의 종류가 다른 경우 형변환이 발생한다.
		   - 자동형변환 규칙
		     [1]값의 범위가 작은 범위에서 큰 범위로 형변환 발생
		     [2]정수형과 실수형의 연산시에는 정수형에서 실수형으로 형변환 발생  
		  */
		int num1 = 10;
		double dnum1 = 5.5;
		//num1변수가 지동 형변환 빌생 (int->double)
		System.out.println(num1 + dnum1); // 결과 =>15.5
		System.out.println(num1 + (int)dnum1); // 결과 =>15
		
		//char <->int
		char ch = 'A';
				System.out.println(ch); // 결과 => 'A'
				
				System.out.println((int)ch);// 결과 => 65
				// char (2B) int (4B)
				System.out.println(ch+3); // 결과 =>'A'=65
				                          //       65 + 3 => 68
				System.out.println((char)(ch+3)); //결과=>'D'
		
	}

}
