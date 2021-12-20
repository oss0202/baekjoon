package algorithm;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        // 선택 정렬 구현
        // 1. 요소값 순회
        // 2. 최솟값의 위치를 리턴
        // 3. 현재위치와 최솟값과 값 위치 변경
        int[] ints = { 6,5,4,3,2,1 };
        System.out.println("선택정렬 전");
        System.out.println(Arrays.toString(ints));
        selectionSort(ints);
        System.out.println("선택정렬 후");
        System.out.println(Arrays.toString(ints));
    }

    /**
     * 선택 정렬을 사용하여 요소를 정렬합니다.
     * @param array
     */
    public static void selectionSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            int j = indexLowest(array, i);
            swapElements(array, i, j);
        }
    }

    /**
     * i와 j의 위치에 있는 값을 바꿉니다.
     * @param array
     * @param i
     * @param j
     */
    private static void swapElements(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /**
     * start 로부터 시작하는 최솟값의 위치를 찾고(start 포함)
     * 배열의 마지막 위치로 갑니다.
     * @param array
     * @param start
     * @return
     */
    private static int indexLowest(int[] array, int start) {
        int lowIndex = start;
        for (int i = lowIndex; i < array.length; i++) {
            if(array[lowIndex] > array[i]){
                lowIndex = i;
            }
        }
        return lowIndex;
    }
}
