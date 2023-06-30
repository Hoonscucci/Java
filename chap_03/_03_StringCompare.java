package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2)); // 문자열 내용이 같으면 true 다르면 false
        System.out.println(s1.equals("java")); // 대소문자 구분 fale
        System.out.println(s1.equalsIgnoreCase("java")); // 대소문자 구분없이 true

        //문자열 비교 심화
        s1 = "1234"; // 벽에 붙은 메모지(비밀번호 정보)
        s2 = "1234"; // s1과 s2가 1234를 참조한다.
        System.out.println(s1.equals(s2)); // true 내용을 비교
        System.out.println(s1 == s2); // true 참조가 같은지 비교

        s1 = new String("1234"); // 각각 손님한테 메모지를 주는것
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); //true 내용은 같고
        System.out.println(s1 == s2); //false 참조는 다르다
        
    }
}
