package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        // 문자열의 길이
        System.out.println(s.length()); // s의 길이 확인 29

        // 대소문자 변환
        System.out.println(s.toUpperCase()); // 대문자로 변경
        System.out.println(s.toLowerCase()); // 소문자로 변경

        //포함 관계
        System.out.println(s.contains("java")); //포함되면 true, 아니면 false(대소문자 구분해야함)
        System.out.println(s.indexOf("Java")); //위치정보 7
        System.out.println(s.indexOf("C#")); // -1 (포함되어 있지 않다)
        System.out.println(s.indexOf("and")); // 처음 만나는 위치정보 12
        System.out.println(s.lastIndexOf("and")); // 마지막 위치정보 23
        System.out.println(s.startsWith("I like")); // 이 문자열로 시작하면 true 아니면 false
        System.out.println(s.endsWith(".")); // 이 문자열로 끝나면 true 아니면 false
    }
}
