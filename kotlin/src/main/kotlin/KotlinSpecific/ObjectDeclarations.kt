package KotlinSpecific

import java.util.*

/* ==================== Object Declarations ==================== */
/*
    Object Declarations in Kotlin allows you to create thread-safe Singletons.
    A Singleton is an object-oriented pattern where a class can ONLY HAVE ONE INSTANCE of an OBJECT.
        For example, you are working an application having SQL database backend.
        You want to create a connection pool to access the database while reusing the same
        connection for all clients. For this, you can create the connection through singleton class
        so that every client get the same connection.

    To create an Object Declaration/Singleton, you use the "object" keyword:

        object SingletonExample {
            ... .. ...
            // body of class
            ... .. ...
        }

    The above code combines a class declaration and a declaration of a single instance SingletonExample of the
    class.
    An object declaration can contain properties, methods and so on. However, they are not allowed to have
    constructors (which makes sense).
    Similar to objects of a normal class, you can call methods and access properties by using the "." notation.

    Object declaration can inherit from classes and interfaces in a similar way like normal classes.
*/

fun main() {
    var e1: Entity = EntityFactory.createEntity(UUID.randomUUID().toString(), EntityType.SMALL)

    /* Object Declarations are SINGLETONS, so even if you create multiple variables of the same Object Declaration,
    they will always be equal since they all reference the same instance/singleton object */
    var factory1: EntityFactory = EntityFactory
    var factory2: EntityFactory = EntityFactory
    println(factory1 === factory2) // true
}

object EntityFactory {
    fun createEntity(id: String, type: EntityType): Entity {
        return Entity(id, type)
    }
}

class Entity(id: String, type: EntityType) {
    var id: String = id
    /*
        Here, we are mapping the EntityType ENUMS to a String
    */
    var type: String = when(type) {
        EntityType.TINY -> type.name // The "name" keyword refers to the ENUM's name itself, in this case, "TINY"
        EntityType.SMALL -> type.getFormattedName()
        EntityType.MEDIUM -> "Medium"
        EntityType.LARGE -> "Large"
        else -> "No EntityType"
    }

    override fun toString(): String {
        return "ID: $id | NAME: $type"
    }
}

enum class EntityType {
    TINY,
    SMALL,
    MEDIUM,
    LARGE;

    fun getFormattedName(): String {
        return name.toString().lowercase()
    }
}