package jackson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.*;

public class JsonAndMap {
    static ObjectMapper objectMapper = new ObjectMapper();

    public static void main(String[] args) throws IOException {
        Map<String, Object> professor = new HashMap<>();
        professor.put("name", "kim");
        professor.put("office", 203);
        // students (List<Map>)
        Map<String, Object> student1 = new HashMap<>();
        student1.put("name", "lee");
        student1.put("grade", "A");
        Map<String, Object> student2 = new HashMap<>();
        student2.put("name", "park");
        student2.put("grade", "B");
        List<Map> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        // Map에 데이터 담기
        Map<String, Object> map = new HashMap<>();
        map.put("major", "CS");
        map.put("professor", professor);
        map.put("students", students);

        // Map -> JSON
        String jsonMap = objectMapper.writeValueAsString(map);

        System.out.println(jsonMap);

        //Car List
        Map<String, Object> car1 = new HashMap<>();
        car1.put("color", "Black");
        car1.put("type", "BMW1");

        Map<String, Object> car2 = new HashMap<>();
        car2.put("color", "Green");
        car2.put("type", "BMW2");

        Map<String, Object> car3 = new HashMap<>();
        car3.put("color", "Red");
        car3.put("type", "BMW3");

        List<Map> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        Map<String, Object> map2 = new HashMap<>();
        map2.put("car", cars);

        String jsonMap2 = objectMapper.writeValueAsString(map2);

        System.out.println(jsonMap2);
    }
}
