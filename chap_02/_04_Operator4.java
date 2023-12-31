package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        // 논리 연산자
        boolean 김치찌개 = true;
        boolean 계란말이 = true;
        boolean 제육볶음 = true;

        System.out.println(김치찌개 || 계란말이 || 제육볶음); // 하나라도 true이면 결과는 true || = or
        System.out.println(김치찌개 && 계란말이 && 제육볶음); // 모두 true 이면 true && = and

        System.out.println((5 > 3) && (3 > 1)); //true
        System.out.println((5 > 3) && (3 < 1)); //false
        System.out.println((5 > 3) || (3 < 1)); //true
        System.out.println((5 < 3) || (3 < 1)); //false
        //()없어도 연산 결과는 동일하나 가독성을 위해 ()로 감싸 주었음
        // System.out.println(1 < 3 < 5); 는 불가능한 코드

        //논리 부정 연산자
        System.out.println(!true); // false
        System.out.println(!false); // true
        System.out.println((!(5 == 5))); //false
        System.out.println(!(5 == 3)); //true
    }
}
