package programmers;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2,4};
        int[] reserve = {1,3,5};
        System.out.println(solution(n, lost, reserve));

    }

    public static int solution(int n, int[] lost, int[] reserve) {
        /*
        1. 전체 학생 수와 동일한 int 배열을 만든다.
        2. 0 / 1 / -1 로 체육복 상태를 나타낸다.
        0 : 기본 상태(체육복이 있고, 도난 당하지 않은 상태)
        1 : 여부의 체육복이 있는 상태
        -1 : 체육복을 도난 당한 상태
        전체 학생 배열 all에서 lost에 해당하는 학생의 인덱스는 -1 처리 reserve에 해당하는 학생은 +1로 처리한다.
        3. 상태를 다 나타낸 후에 0번부터 체육복 여부를 확인하고 체육복이 없다면 앞 번호나 뒷 번호에게 체육복을 빌리는 처리를 한다.
        단, 1번은 앞 번호가 존재하지 않으므로 뒷 번호에게만 빌릴 수 있고, 마지막 번호는 앞 번호만 빌릴 수 있다.
         */
        Arrays.sort(lost);
        Arrays.sort(reserve);
        // 1. 전체 학생 배열 생성
        int[] users = new int[n];

        // 2. 전체 학생 기본세팅
        // 1) 여분 있는 학생
        for (int i : reserve) {
            users[i-1]++;
        }
        // 2) 잃어버린 학생
        for (int i : lost) {
            users[i-1]--;
        }

        //3. 상태 확인 후 빌리는 처리
        for (int i = 0; i < users.length; i++) {
            if(users[i]<0){
                //첫번째가 아니면 앞에서 빌릴 수 있다.
                if(i!=0 && users[i-1]>0){
                    users[i]++;
                    users[i-1]--;
                    //마지막이 아니면 뒤에서 빌릴 수 있다.
                }else if(i!=users.length-1 && users[i+1]>0){
                    users[i]++;
                    users[i+1]--;
                }
            }
        }

        int maxUserCnt = 0;
        for (int i = 0; i < users.length; i++) {
            if(users[i]>=0){
                maxUserCnt++;
            }
        }
        return maxUserCnt;
    }
}
