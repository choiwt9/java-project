package practice2;

public class Variable02 {
	
	public static void main(String[] args) {
		//1. 대소문자 구분, 길이 무제한
		int num = 10;
		int nuM = 20;
		
		System.out.println(num);
		System.out.println(nuM);
		
		//2. 예약어 사용 불가
		//int className;
		
		//3. 숫자 시작 불가
		//int 1age;
		int age1;
		
		//4. 특수문자 '_', '$' 만 가능
		//String sh@rp;
		String sh$rp;
		
		//5. 카멜케이스 : 소문자로 시직하여 다음단어의 첫글자가 대문자로 작성
		//회원이름
		String userName;
		String username; //문법상 오류 아님, 그러나 어떤 환경에서는 오류 가능성
		//제품(product)의 번호(id) => 정수형
		int productId;
		//책(book) 제목(title) =>문자열
		String bookTitle;

}
}
