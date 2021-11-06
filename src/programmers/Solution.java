package programmers;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};

        int result = solution(board, moves);
        System.out.println(result);
    }
    public static int solution(int[][] board, int[] moves) {
        List<Integer> integers = new ArrayList<>();

        int cnt = 0;
        int nowNum;
        // 크레인 위치 반복
        for (int i = 0; i < moves.length; i++) {
            nowNum = 0;
            int move = moves[i];
            move--;//인덱스 이므로 -1
            // 인형뽑기에서 뽑기
            for (int j = 0; j < board.length; j++) {
                nowNum = board[j][move];

                // 비어있지 않다면 뽑기 진행
                if(nowNum !=0){
                    // 이전에 뽑은 인형과
                    // 1. 같다면 이전배열 삭제 및 리스트 추가 X, cnt+=2
                    if(!integers.isEmpty() && integers.get(integers.size()-1).equals(nowNum)){
                        integers.remove(integers.size()-1);
                        cnt +=2;
                        // 2. 다르다면 배열 추가
                    }else{
                        integers.add(nowNum);
                    }
                    // 뽑은 인형의 빈자리는 0으로 변경
                    board[j][move] = 0;
                    break;
                }
            }
        }
        return cnt;
    }
}
