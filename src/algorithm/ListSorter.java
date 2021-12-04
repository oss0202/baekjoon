package algorithm;

import java.util.Comparator;
import java.util.List;

public class ListSorter<T> {
    public void insertionSort(List<T> list, Comparator<T> comparator){
        for (int i = 0; i < list.size(); i++) {
            T elt_i = list.get(i);
            int j = i;
            while (j > 0){
                T elt_j = list.get(j-1);
                if(comparator.compare(elt_i, elt_j) >= 0){
                    break;
                }
                list.set(j, elt_j);
                j--;
            }
            list.set(j, elt_i);
        }
    }
}
