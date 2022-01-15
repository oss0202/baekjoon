package old.gs;

//https://www.youtube.com/watch?v=gCfkpJhNQVon
public class Third {
    public static void main(String[] args) {
        System.out.println(solution("abababab"));
        System.out.println(solution("abcabcabd"));
    }
    // abababab
    public static int solution(String s){// 입력값
        int sLen = s.length(); //전체 길이
        char[] chrArray = s.toCharArray(); // 입력값의 요소
        int halfLen = sLen/2 + 1; // 연산되어야 할 범위

        StringBuffer sb = new StringBuffer(halfLen); // 문자열을 담을 기본 크기

        int result = sLen;

        for (int i = 1; i < halfLen; i++) {
            sb.append(chrArray[i-1]);
            if(sLen%i == 0){
                String subStr = sb.toString();
                StringBuffer sb2 = new StringBuffer(sLen);

                int Cnt = sLen/i;
                for (int j = 0; j < Cnt; j++) {
                    sb2.append(subStr);
                }

                if(sb2.toString().equals(s)){
                    result = subStr.length();
                    break;
                }
            }
        }
        return result;
    }
}
