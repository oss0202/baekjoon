import org.junit.Test;

public class Solution2_minju {
    @Test
    void test1() {
        String S1 = "bytdag";
        int[] A1 = {4, 3, 0, 1, 2, 5};
        solution(S1, A1);
        assertThat(solution(S1, A1)).isEqualTo("bat");

        String s2 = "cdeo";
        int[] A2 = {3, 2, 0, 1};
        assertThat(solution(s2, A2)).isEqualTo("code");

        String s3 = "cdeenetpi";
        int[] A3 = {5, 2, 0, 1, 6, 4, 8, 3, 7};
        assertThat(solution(s3, A3)).isEqualTo("centipede");

    }

    public String solution(String s, int[] a) {
        String[] strings = s.split("");
        StringBuilder answer = new StringBuilder();
        answer.append(strings[0]);
        int i = 0;
        while (a[i] != 0) {
            answer.append(strings[a[i]]);
            // 다음값 세팅
            i = a[i];
        }

        return answer.toString();
    }
}
