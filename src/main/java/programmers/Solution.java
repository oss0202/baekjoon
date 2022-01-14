package programmers;

public class Solution {
    public static void main(String[] args) {

    }
    public int solution(String s) {
        // 1. 최소 문자열을 찾기 위한 비교 변수.
        int answer =Integer.MAX_VALUE;

        // 2. 문자열 길이가 1인 경우는 압축 불가로 1 반환. 안하면 테스트 케이스 1개에 걸린다.
        if(s.length() == 1) return 1;

        // 3. 1~s.length()/2 만큼 압축가능.
        for(int i =1;i<=s.length()/2;i++){
            // 압축 길이 별 문자열 변수.
            String str = "";
            // 자른 문자열을 비교 할 변수.
            String temp="";
            // 자른 문자열의 개수를 카운팅 할 변수.
            int count = 1;

            // substring()의 범위만큼 반복.
            for(int j =0;j<s.length()/i;j++){
                // 4. 이전에 자른 문자열과 현재 자른 문자열이 같다면 카운팅.
                if(temp.equals(s.substring(j*i,(j*i)+i))){
                    count++;
                    continue;
                }
                // 5. 카운팅 > 1인 경우는 count+temp 후 count 초기화.
                if(count >1){
                    str+=count+temp;
                    count = 1;
                    // 6. 나머지의 경우는 자른 문자열인 temp만 붙여준다.
                }else{
                    str+=temp;
                }

                // 7. 현재 자른 문자열로 비교대상 변경.
                temp=s.substring(j*i,(j*i)+i);
            }

            // 8. 마지막에 붙이지 못한 문자열을 붙인다.
            if(count >1){
                str+=count+temp;
                count = 1;
            }else{
                str+=temp;
            }

            // 9. s의 길이가 압축하는 길이로 나누어 떨어지지 않는 경우, 나머지 부분부터 마지막까지 substring을 이용해 붙인다.
            if(s.length()%i !=0){
                str+=s.substring(s.length()-s.length()%i,s.length());
            }

            // 10. 가장 짧은 길이를 찾음.
            answer = answer > str.length() ? str.length() : answer;
        }


        return answer;
    }
}
