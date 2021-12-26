package jackson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JsonAndJavaObject {
    static ObjectMapper objectMapper = new ObjectMapper();
    public static void main(String[] args) throws IOException {
        Car car = Car.builder()
                .color("BLUE")
                .type("SPORT")
                .build();
        System.out.println("-------- Car Object --------");
        System.out.println(car.toString());
        System.out.println();

        System.out.println("-------- Java Object to JSON --------");
        String carJsonResult = objectMapper.writeValueAsString(car);
        System.out.println("JSON >>>>> " + carJsonResult);
        System.out.println();

        System.out.println("-------- JSON to Java Object --------");
        Car returnCar = objectMapper.readValue(carJsonResult, Car.class);
        System.out.println("Car >>>>> " + returnCar.toString());
    }
}
