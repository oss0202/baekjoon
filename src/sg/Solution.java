package sg;

public class Solution {
//    public static void main(String[] args) {
////        String[] strings = {"...","...","..."};
//        // Stirng[][] 배열로 변경
//        // 왼쪽, 오른쪽
////        int x = 3;
////        int y = 3;
//        String[] strings = {"....","....","#...","...."};
//        int x = 3;
//        int y = 2;
//
//        System.out.println(solution(strings, x, y));
//        /**
//         * x, y
//         * x좌표로 #확인
//         * y좌표로 #확인
//         *
//         */
//    }
    public static void main(String[] args) {
//        String[] cell = {"....", "....", "#...", "...."};
//        int x = 3;
//        int y = 2;
        String[] cell = {"...","...","..."};
        int x = 3;
        int y = 3;

        int solution = solution(cell, x, y);
        System.out.println("solution = " + solution);
    }

    public static int solution(String[] cell, int x, int y) {
        int count = 0;
        int count1Y = 0;
        int countYX = 0;

        int count1X = 0;
        int countXY = 0;
        //YY/YX
        for (int index = 0; index < cell.length; index++) {

            String[] stringXY = cell[index].split("");

            int shopY = 0;

            if (index == 0 || index == x - 1) {

                for (int i = 0; i < y; i++) {
                    if (stringXY[i].equals("#")) {
                        shopY++;
                    }
                }

                if (stringXY.length == y && shopY == 0) {
                    if (index == 0) {
                        count1Y = 1;
                    } else {
                        countXY = 1;
                    }
                } else if (shopY != 0 && shopY < y - 1) {
                    if (index == 0) {
                        count1Y = shopY;
                    } else {
                        countXY = shopY;
                    }
                } else {
                    if (index == 0) {
                        count1Y = y - 1;
                    } else {
                        countXY = y - 1;
                    }
                }
            }

            if (stringXY[0].equals("#")) {
                count1X++;
            } else if (stringXY[y].equals("#")) {
                countYX++;
            }

        }

        if (count1X == 0) {
            if (cell.length == x - 1) {
                count1X = 1;
            } else {
                count1X = x - 1;
            }
        }

        if (countYX == 0) {
            if (cell.length == x - 1) {
                countYX = 1;
            } else {
                countYX = x - 1;
            }
        }
//        System.out.println("count1X = " + count1X);
//        System.out.println("countXY = " + countXY);
//
//        System.out.println("count1Y = " + count1Y);
//        System.out.println("countYX = " + countYX);


        return count1X + countXY >= countYX + count1Y ? countYX + count1Y : count1X + countXY;

    }
    public static int solution2(String[] cell, int x, int y) {
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

    public int solution3(String[] cell, int x, int y) {

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
