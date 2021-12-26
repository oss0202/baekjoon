package nhn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class SecondDy {
    public static Integer solution(Integer A, String B){
        Integer result = 0;
        ArrayList<String> BList = new ArrayList<>(Arrays.asList(B.split(" ")));
        BList.sort(Comparator.naturalOrder());
        Integer[] arr = new Integer[A];
        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(BList.get(i));
        }
        System.out.println(arr);
        test(arr);
        System.out.println(arr);
        return result;
    }
    public static void test(Integer[] arr){
        for(int i = 0; i < (arr.length-1); i++){
            if(arr[i+1] == arr[i]){
                Integer[] copyed = Arrays.copyOf(arr, arr.length);
                for(int j = i+1; j < arr.length; j++){
                    if(arr[j] > arr[i]){
                        arr[i+1] = copyed[j];
                        arr[j] = copyed[i+1];
                        break;
                    }
                }
                test(arr);
            }
        }
    }
}
