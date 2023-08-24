package exercise;

import java.lang.reflect.Field;
// BEGIN
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

public class Validator {
    public static List<String> validate(Object obj) {
        List<String> notValidFields = new ArrayList<>();
        Field[] fields = obj.getClass().getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(NotNull.class)) {
                field.setAccessible(true);
                try {
                    if (field.get(obj) == null) {
                        notValidFields.add(field.getName());
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        return notValidFields;
    }
}
// END
