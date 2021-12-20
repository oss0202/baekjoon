package jackson;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class JavaList {
    static final String[] COLORS = {"Black", "Red"};
    static final String[] TYPES = {"BMW", "FIAT"};

    static ObjectMapper objectMapper = new ObjectMapper();

    public static void main(String[] args) throws IOException {
        // Creating a JSON Array

        //1. JSON Objects 만들기
        ObjectNode objectNode1 = objectMapper.createObjectNode();
        objectNode1.put("color", "Black");
        objectNode1.put("type", "BMW");

        ObjectNode objectNode2 = objectMapper.createObjectNode();
        objectNode2.put("color", "Red");
        objectNode2.put("type", "Benz");

        ObjectNode objectNode3 = objectMapper.createObjectNode();
        objectNode3.put("color", "White");
        objectNode3.put("type", "audi");

        // ArrayNode Object 만들기
        ArrayNode arrayNode = objectMapper.createArrayNode();

        // JSON users를 array에 추가
        arrayNode.addAll(Arrays.asList(objectNode1, objectNode2, objectNode3));

        //
        String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(arrayNode);

        System.out.println(json);

        System.out.println();
        // Creating a Java List from a JSON Array String
        List<Car> cars = objectMapper.readValue(json, new TypeReference<List<Car>>(){});

        cars.stream().forEach(System.out::println);
    }
}
