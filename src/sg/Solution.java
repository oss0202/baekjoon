package sg;

public class Solution {
    public static void main(String[] args) {
//        String[] strings = {"...","...","..."};
        // Stirng[][] 배열로 변경
        // 왼쪽, 오른쪽
//        int x = 3;
//        int y = 3;
        String[] strings = {"....","....","#...","...."};
        int x = 3;
        int y = 2;

        System.out.println(solution(strings, x, y));
        /**
         * x, y
         * x좌표로 #확인
         * y좌표로 #확인
         *
         */
    }
    public static int solution(String[] cell, int x, int y) {
        int count =0;
        int countY = 1;
        int countX = 1;
        int countYY = 0;
        int countYX = 0;
        int countXX = 0;
        int countXY = 0;

        for (int index = 0; index < cell.length; index++) {

            String[] stringXY = cell[index].split("");

            int shopX = 0;
            int shopY = 0;

            if (index == 0 || index == x - 1) {

                for (int i = 0; i < y; i++) {
                    if (stringXY[i].equals("#")) {
                        shopY++;
                    }
                }

                if (shopY == 0 && stringXY.length == y) {
                    if (index == 0) {
                        countYY = 1;
                    } else {
                        countXY = 1;
                    }
                } else if (shopY < y - 1) {
                    if (index == 0) {
                        countYY = shopY;
                    } else {
                        countXY = shopY;
                    }
                } else {
                    if (index == 0) {
                        countYY = y - 1;
                    } else {
                        countXY = y - 1;
                    }
                }

                for (int i = 0; i < x; i++) {
                    if (stringXY[i].equals("#")) {
                        shopX++;
                    }
                }

                if (shopX == 0 && stringXY.length == y) {
                    if (index == 0) {
                        countXX = 1;
                    } else {
                        countXY = 1;
                    }
                } else if (shopY < y - 1) {
                    if (index == 0) {
                        countYY = shopX;
                    } else {
                        countXY = shopX;
                    }
                } else {
                    if (index == 0) {
                        countYY = y - 1;
                    } else {
                        countXY = y - 1;
                    }
                }
            }


            if(stringXY[0].equals("#")){
                countXX++;
            }else if(stringXY[x-1].equals("#")){
                countXY++;
            }

        }

        if (countXX == 0){
            countXX =1;
        }else if (countXY == 0 ){
            countXY = 1;
        }



        return countXX+countXY > countYX+countYY ?   countYX+countYY:countXX+countXY;

    }

    public static int solution2(String[] cell, int x, int y) {

        //y ->x
        int countY = 1;
        int countX = 1;
        for (int index = 0; index < cell.length; index++) {
            String[] stringXY = cell[index].split("");

            if (index == 0) {
                for (int i = 0; i < y; i++) {
                    if (stringXY[i].equals("#")) {
                        countY++;
                    }
                }
            }

            if (index <= x - 1) {
                if (stringXY[x - 1].equals("#")) {
                    countX++;
                }
            }
        }


        return countX + countY;

    }
}
