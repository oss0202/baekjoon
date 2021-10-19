package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseNum = Integer.parseInt(br.readLine());

        for (int i = 0; i < caseNum; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            // 학생 수
            int stuNum = Integer.parseInt(st.nextToken());
            // 그룹별 평균점수
            int stuAvgArr = 0;
            // 학생 점수 배열
            double [] stuScoArr = new double[stuNum];
            // 학생들 점수 합
            int stuSum = 0;
            // 학생 점수
            double  stuSco = 0;
            // 평균보다 높은 학생 수
            double goodStu = 0;

            int k = 0;
            // 학생들 점수 합구하기
            while (st.hasMoreTokens()){
                stuSco = Integer.parseInt(st.nextToken());
                stuSum += stuSco;
                stuScoArr[k] = stuSco;
                k++;
            }
            // 학생들 평균 구하기
            stuAvgArr = stuSum/stuNum;

            // 평균보다 큰 학생 수 구하기
            for (double score : stuScoArr) {
                if(stuAvgArr<score){
                    goodStu++;
                }
            }
            System.out.printf("%.3f%%\n",goodStu/stuNum*100);
        }
   }
}
