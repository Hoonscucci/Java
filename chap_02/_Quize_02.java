package chap_02;

public class _Quize_02 {
    public static void main(String[] args) {
        int 제한_키 = 120;
        int 키 = 125;
        String 탑승 = 키 < 제한_키 ? ("키가" + 키 + "이므로 탑승 불가능합니다.") : ("키가" + 키 + "이므로 탑승 가능합니다.");
        System.out.println((탑승));

        키 = 115;
        탑승 = 키 < 제한_키 ? ("키가" + 키 + "이므로 탑승 불가능합니다.") : ("키가" + 키 + "이므로 탑승 가능합니다.");
        System.out.println((탑승));
    }
}
