package programmers;

public class Solution2 {
    public static void main(String[] args) {
        int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        String hand = "left";

        System.out.println(solution(numbers, hand));
    }
    public static String solution(int[] numbers, String hand) {
        // 각 번호판을 좌표로 생각하고 풀어야 한다.
        int leftIndex = 10; // '*' => 10으로 치환
        int rightIndex = 12; // '#' => 12로 치환
        StringBuilder sb = new StringBuilder();

        for (int number : numbers) {
            if(number == 1 || number == 4 || number == 7) {//Left
                sb.append("L");
                leftIndex = number;
            } else if(number == 3 || number == 6 || number == 9) {//Right
                sb.append("R");
                rightIndex = number;
            } else{// Center
                int leftLength = getLength(leftIndex, number);
                int rightLength = getLength(rightIndex, number);

                if(leftLength > rightLength){
                    sb.append("R");
                    rightIndex = number;
                }else if(leftLength < rightLength){
                    sb.append("L");
                    leftIndex = number;
                }else{
                    if(hand.equals("right")){
                        sb.append("R");
                        rightIndex = number;
                    }else{
                        sb.append("L");
                        leftIndex = number;
                    }
                }
            }
        }
        return sb.toString();
    }
    /*
    index : 현재 숫자
    number : 중앙에 있는 숫자
     */
    public static int getLength(int index, int number){

        // 숫자가 0인 경우 11로 치환
        index = (index == 0) ? 11 : index;
        number = (number == 0) ? 11 : number;

        int x = (index - 1) / 3;
        int y = (index - 1) % 3;
        int numberX = number / 3;
        int numberY = 1;//가운데라서 1로 고정

        return Math.abs(x-numberX) + Math.abs(y - numberY);
    }
}
