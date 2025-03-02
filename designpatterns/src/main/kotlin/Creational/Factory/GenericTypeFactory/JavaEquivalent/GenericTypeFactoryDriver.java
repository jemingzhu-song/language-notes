package Creational.Factory.GenericTypeFactory.JavaEquivalent;

public class GenericTypeFactoryDriver {
    public static void main(String [] args) {
        // Suppose you are given (e.g. from a request/function call) a field "id", and the field this "id" represents can have different types
        String field = "field_10001";

        // You call a function to retrieve the underlying field
        SelectableField<?> selectableField = SelectableFieldRegistry.getSelectableField(field);

        // You need to handle this field based on the type
        SelectableFieldHandlerFactory factory = new SelectableFieldHandlerFactory();
        FieldHandler<?> handler = factory.getHandler(field);

        // Use the handler to handle the field
        handler.getField();
        handler.getFieldValueMap();
    }
}

class SelectableFieldRegistry {
    static <T> SelectableField<T> getSelectableField(String fieldId) {
        // This would be a database call to get the selectable field
        return null;
    }
}

class StringField<String> implements SelectableField<String> {}
class IntegerField<Integer> implements SelectableField<Integer> {}
class BooleanField<Boolean> implements SelectableField<Boolean> {}

interface SelectableField<T> {}
