package coypangPay;

public class First {
    public static void main(String[] args) {
//        String p = "82195";
//        String s = "64723";

        String p = "00000000000000000000";
        String s = "91919191919191919191";

        int pNum = 0;
        int sNum = 0;

        int forNum = 0;
        int revNum = 0;

        int forDiff = 0;
        int revDiff = 0;

        int reuslt = 0;
        for (int i = 0; i < p.length(); i++) {
            //한글자씩 뺴오기
            pNum = Character.getNumericValue(p.charAt(i));
            sNum = Character.getNumericValue(s.charAt(i));

            //정, 역방향 길이 계산
            // 큰값 : 정방향
            forNum = Math.min(pNum, sNum);
            // 작은값 : 역방향
            revNum = Math.max(pNum, sNum);

            // 정방향일 경우 뺄셈
            forDiff = Math.abs(revNum-forNum);
            // 역방향일 경우 10을 더해서 계산
            revDiff = Math.abs(revNum-(forNum+10));

            //적은값 더해주기
            reuslt +=Math.min(forDiff, revDiff);
        }
        System.out.println(reuslt);

        // p > s 인덱스차이
//        System.out.println(Math.abs(pNum-sNum));
//        System.out.println(pNum-(sNum+10));
//        System.out.println(Math.abs(pNum-(sNum+10)));
    }

    public static int solution(String p, String s) {
        int pNum = 0;
        int sNum = 0;

        int forNum = 0;
        int revNum = 0;

        int forDiff = 0;
        int revDiff = 0;

        int reuslt = 0;
        for (int i = 0; i < p.length(); i++) {
            //한글자씩 뺴오기
            pNum = Character.getNumericValue(p.charAt(i));
            sNum = Character.getNumericValue(s.charAt(i));

            //정, 역방향 길이 계산
            // 큰값 : 정방향
            forNum = Math.min(pNum, sNum);
            // 작은값 : 역방향
            revNum = Math.max(pNum, sNum);

            // 정방향일 경우 뺄셈
            forDiff = Math.abs(revNum-forNum);
            // 역방향일 경우 10을 더해서 계산
            revDiff = Math.abs(revNum-(forNum+10));

            //적은값 더해주기
            reuslt +=Math.min(forDiff, revDiff);
        }
        return reuslt;
    }
}
