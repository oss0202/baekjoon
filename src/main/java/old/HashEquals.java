import java.util.ArrayList;
import java.util.List;

public class HashEquals {
    public static void main(String[] args){
        Employee employee1 = new Employee("1","이투스1",180);
        Employee employee2 = new Employee("2","이투스1",180);

        System.out.println(employee1.getName().equals(employee2.getName()));
        System.out.println(employee1.getName()==employee2.getName());
        System.out.println(employee1.getName().hashCode()==employee2.getName().hashCode());

        List<String> arrayList = new ArrayList();
        arrayList.size();

        employee1.getName().length();
        String[] strings ={"1","2","3","4","5"};
        int s=strings.length;




    }
}
