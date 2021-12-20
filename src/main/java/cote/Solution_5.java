package cote;

public class Solution_5 {

    public static void main(String[] args) {
//        int[] arr = {2, 1, 3, 1, 4, 2, 1, 3};
        String str= ""; // 입력받는 콤마 포함 문자열
        int cnt = 0; // 중복 값 배열 인덱스
        int checknum = 0; // 존재 여부 체크
        String[] arr = {"2", "1", "3", "1", "4", "2", "1", "3"};

        String[] same = new String[arr.length];
        // 중복 검사
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<i; j++) {
                // 중복일 때
                if(arr[i].equals(arr[j])) {
                    // 중복 배열에 존재 여부 확인
                    for(int k=0; k<same.length; k++) {
                        if(arr[i].equals(same[k])) {
                            checknum = 1;
                        }
                    }
                    if(checknum != 1) {
                        same[cnt] = arr[i];
                        cnt++;
                    }
                }
            }
            checknum = 0;
        }

        System.out.println("입력값 중 중복된 수는 아래와 같습니다.");
        // 중복값 출력
        for(int i=0; i<same.length; i++) {
            if(same[i] != null) {
                if(checknum != 0) {
                    System.out.print(", ");
                }
                System.out.print(same[i]);
                checknum++;
            }
        }
    }
    public int solution(int[] arr) {
        int answer = -2;
        return answer;
    }
}
