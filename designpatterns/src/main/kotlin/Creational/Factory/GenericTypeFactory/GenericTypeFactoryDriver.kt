package Creational.Factory.GenericTypeFactory

fun main() {
    // Suppose you are given (e.g. from a request/function call) a field "id", and the field this "id" represents can have different types
    val field: String = "field_10001"

    // You call a function to retrieve the underlying field
    val selectableField: SelectableField<Any> = SelectableFieldRegistry.getSelectableField(field);

    // You need to handle this field based on the type
    val selectableFieldHandlerFactory = SelectableFieldHandlerFactory()
    val handler: FieldHandler<*> = selectableFieldHandlerFactory.getHandler(field)

    // Use the handler to handle the field
    handler.getField()
    handler.getFieldValueMap()
}

class SelectableFieldRegistry {
    companion object {
        fun <T> getSelectableField(fieldId: String): SelectableField<T> {
            TODO("This would be a database call to get the selectable field")
        }
    }
}

class StringField<String>() : SelectableField<String> {}
class IntegerField<Int>() : SelectableField<Int> {}
class DoubleField<Double>() : SelectableField<Double> {}
class BooleanField<Boolean>() : SelectableField<Boolean> {}
class AnyField<Any>() : SelectableField<Any> {}


interface SelectableField<T> {
}