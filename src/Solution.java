public class Solution {
    public static void main(String[] args) {
        int[] a = {3,2,0,1};
        int[] b = {4,3,0,1,2,5};
        Solution solution = new Solution();
        System.out.println(solution.solution("cdeo", a));
        System.out.println(solution.solution("bytdag", b));
    }
    public String solution(String s, int[] A){
        int selectManNum = 0;
        int nextManNum = A[selectManNum];
        String sendMsg ="";
        sendMsg += s.charAt(selectManNum);

        do {
            sendMsg +=s.charAt(nextManNum);
            nextManNum = A[nextManNum];
        }while (nextManNum!=0);

        return sendMsg;
    }
}
