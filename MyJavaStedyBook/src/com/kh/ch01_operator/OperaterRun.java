package com.kh.ch01_operator;

public class OperaterRun {

	public static void main(String[] args) {

		/*
		 * *논리 부정 연산자(단항 연산자 : 하나의 값을 가지고 연산 수행) -연산자: ! -논리값(true/false)을 반대로 바꿔주는 연산자
		 * 
		 * 
		 */
		System.out.println("true의 값을 부정 :" + !true);
		System.out.println("false의 값을 부정 :" + !false);

		boolean b1 = true;
		System.out.println("b1의 값을 부정 : " + !b1); // false

		boolean b2 = !b1; // false

		boolean b3 = !(10 % 2 == 0); // false

		// --------------------------------
		/*
		 * 증감연산자(단항연산자) -연산자 [1]++: 변수 담긴 값을 1씩 증가시키는 연산자 [2]--: 변수에 담긴 값을 1씩 감소시키는 연산자
		 * 
		 * -다른 연산이 있을 경우- *전위연산:(증감연산자)변수 => 선 증감 후 처리(다른 연산 수행) *후위연산:변수(증감연산자) => 선 처리
		 * 후 증감
		 */

		int i1 = 10;
		System.out.println("1) i1 = " + i1); // 10
		System.out.println("2) ++i1 = " + ++i1); // 11
		System.out.println("3) ++i1 = " + i1++); // 11, 출력 후 i1의 값 증가: 12
		System.out.println("4) i1 = " + i1); // 12

		int i2 = ++i1;
		System.out.println("5) i1 = " + i1 + "i2 =" + i2); // 13, 13

		int i3 = i1++;
		System.out.println("6) i1 = " + i1 + "i3 =" + i3); // 14, 13

		int i4 = i1++ * 5;
		System.out.println("7) i1 = " + i1 + "i4 =" + i4); // 15, 70

		/*
		 * *산술 연산자 (이항연산자 : 두개의 값을 가지고 연산 수행) -연산자 : + - * / % -우선순위 : * / > + -
		 */

		int n1 = 10;
		int n2 = 5;
		System.out.println("n1 + n2 = " + (n1 + n2));
		System.out.println("n1 - n2 = " + (n1 - n2));
		System.out.println("n1 * n2 = " + n1 * n2);
		System.out.println("n1 / n2 = " + n1 / n2);
		System.out.println("n1 % n2 = " + (n1 % n2));

		if (n1 % 2 == 0) {
			System.out.println("짝수");
		}
		if (n2 % 3 == 0) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
//--------------------------------------------
		/*
		 * *비교연산자/관계연산자(이항연산자) -두 값을 비교 =조건을 만족하면 true , 아니면 false
		 * 
		 * 종류 *대소 비교 > < >= <= *동등 비교 == !=
		 */
		int a = 7;
		int b = 4;

		System.out.println("a == b : " + (a == b));
		System.out.println("a !=b : " + (a != b));

		boolean result = a > b;
		System.out.println("result : " + result);
		System.out.println((a * 2) > (b / 3));

		System.out.println("a값이 짝수인가?" + (a % 2 == 0));
		System.out.println("a값이 홀수인가?" + (a % 2 == 1));
		System.out.println("a값이 홀수인가?" + !(a % 2 == 0));
		System.out.println("a값이 홀수인가?" + (a % 2 != 0));
//--------------------------------------

		/*
		 * 논리 연산자 (이항연산자) : 두개의 논리값을 연산해주는 연산자 연산 수행 결과값도 논리값
		 * 
		 * -연산자 *논리값 && 논리값 : 왼쪽 오른쪽 값이 모두 true일때 결과가 true *논리값||논리값 : 왼쪽 오른쪽 둘중 하나만
		 * true일때 결과가 true
		 */

		// num 변수가 1 이상 100이하
		int num = 55;
		boolean r2 = (num >= 1) && (num <= 100);
		System.out.println("num의 값이 1 이상 100이하인가? : " + r2);
// && : ~이고, 그리고, ~하면서

		// y거나 Y
		char yn = 'y';
		boolean r3 = (yn == 'y') || (yn == 'Y');
		System.out.println("yn변수가 y 또는 Y 인가" + r3);
		// || : ~이거나, 또는

		boolean r4 = (num > 55) && (++num > 0);
		System.out.println("r4 : " + r4 + " num :" + num);
		boolean r5 = (num > 0) || (num++ > 1);
		System.out.println("r5 : " + r5 + " num : " + num);
//--------------------------------------------------

		/*
		 * 복합 대입 연산자 :산술 연산자와 대입 연산자가 결합 처리 속도가 좀더 빨라 권장
		 * 
		 * 종류 : += -= /= %=
		 * 
		 * a = a+3; => a+=3 a = a-3; => a-=3 a = a*3 => a*=3 a= a/3 => a/=3 a= a%3 =>
		 * a%=3
		 */
		int num2 = 45;
		// num2 2배 증가
		num2 *= 2;
		// num2 5 증가
		num2 += 5;
		// num2 2배 감소
		num /= 2;

		String str = "Hi";
		str += ", java";
		// -----------------------
		/*
		 * 삼항연산자(3개의 값을 가지고 연산 수행 -연산자 : 조건식? 조건식의 결과가 참일때 사용할 값 : 조건식의 결과가 거짓일때 사용할 값
		 * 
		 */
		// 랜덤값 추출 1~100

		int random = (int) (Math.random() * (100 - 1 + 1) + 1);

		// 랜덤값이 짝수인가 홀수인가

		String result2 = random % 2 == 0 ? "짝수" : "홀수";
		System.out.println(random + ":" + result2);
		String result3 = random >= 'A' && random <= 'Z' ? "대문자" : "대문자 아님";
		System.out.println((char) random + ":" + result3);

	}
}
