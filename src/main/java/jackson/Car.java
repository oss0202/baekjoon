package jackson;

import lombok.*;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
@EqualsAndHashCode(of = {"color", "type"})
@ToString
public class Car {
    private String color;
    private String type;
}
