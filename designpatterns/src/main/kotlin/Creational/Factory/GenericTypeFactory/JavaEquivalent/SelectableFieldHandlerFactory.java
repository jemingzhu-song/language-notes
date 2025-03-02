package Creational.Factory.GenericTypeFactory.JavaEquivalent;

import java.util.Map;

public class SelectableFieldHandlerFactory {
    FieldHandler<?> getHandler(String fieldId) {
        return switch (fieldId) {
            case "field_10000" -> new FieldHandler<String>() {
                @Override
                public SelectableField<String> getField() {
                    return new StringField();
                }

                @Override
                public Map<String, String> getFieldValueMap() {
                    return null;
                }
            };
            case "field_10001" -> new FieldHandler<Integer>() {

                @Override
                public SelectableField<Integer> getField() {
                    return new IntegerField();
                }

                @Override
                public Map<Integer, String> getFieldValueMap() {
                    return null;
                }
            };
            case "field_10002" -> new FieldHandler<Boolean>() {

                @Override
                public SelectableField<Boolean> getField() {
                    return new BooleanField();
                }

                @Override
                public Map<Boolean, String> getFieldValueMap() {
                    return null;
                }
            };
            default -> throw new IllegalArgumentException("Field Not Supported");
        };
    }
}

interface FieldHandler<T> {
    SelectableField<T> getField();

    Map<T, String> getFieldValueMap();
}