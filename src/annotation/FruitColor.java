package annotation;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitColor {
    enum Color{BLUE, RED, GREED}

    Color fruitColor() default Color.GREED;
}
