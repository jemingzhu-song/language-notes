package Creational.Factory.GenericTypeFactory

import java.lang.IllegalArgumentException

class SelectableFieldHandlerFactory() {
    fun getHandler(fieldId: String): FieldHandler<*> {
        return when(fieldId) {
            "field_10000" -> object : FieldHandler<String> {
                override fun getField(): SelectableField<String> {
                    return StringField();
                }

                override fun getFieldValueMap(): Map<String, String> {
                    TODO("Not yet implemented")
                }
            }
            "field_10001" -> object : FieldHandler<Int> {
                override fun getField(): SelectableField<Int> {
                    return IntegerField();
                }

                override fun getFieldValueMap(): Map<Int, String> {
                    TODO("Not yet implemented")
                }
            }
            "field_10002" -> object : FieldHandler<Double> {
                override fun getField(): SelectableField<Double> {
                    return DoubleField();
                }

                override fun getFieldValueMap(): Map<Double, String> {
                    TODO("Not yet implemented")
                }
            }
            "field_10003" -> object : FieldHandler<Boolean> {
                override fun getField(): SelectableField<Boolean> {
                    return BooleanField()
                }

                override fun getFieldValueMap(): Map<Boolean, String> {
                    TODO("Not yet implemented")
                }
            }
            else -> throw IllegalArgumentException("Field Not Supported")
        }
    }
}

interface FieldHandler<T> {
    fun getField(): SelectableField<T>;

    fun getFieldValueMap(): Map<T, String>;
}