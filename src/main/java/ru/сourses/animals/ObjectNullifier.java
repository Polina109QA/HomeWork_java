package ru.сourses.animals;

import java.lang.reflect.Field;

public class ObjectNullifier {

    public static void nullifyObject(Object obj) throws IllegalAccessException {
        if (obj == null) {
            return;
        }

        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            if (java.lang.reflect.Modifier.isStatic(field.getModifiers())) {
                continue;
            }
            if (!field.getType().isPrimitive()) {
                field.setAccessible(true);
                field.set(obj, null);
            }
        }
    }
}