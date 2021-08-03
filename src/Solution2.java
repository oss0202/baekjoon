class Solution2 {
    public long solution(int price, int money, int count) {
//        long answer = -1;
        long needPrice = 0;
        for (int i = 1;i<count+1;i++){
            needPrice += getNeedPrice(price, i);
        }
//        return answer;
        return money>needPrice?0:needPrice-money;
    }
    public long getNeedPrice(int price, int count){
        return price * count;
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.solution(3,20,4));
    }
}