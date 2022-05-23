package OOP;
/* 
    Notes
    1.  With the fields/values in an object, it is best practice to set their visibility as "private"
        rather than "public". 
    1.  If fields are "private", you will need "getters" to retrieve/get a value from an object,
        and a "setter" to modify/set a value from an object.
*/

public class ObjectFields {
    private int id;
    private String name;
    private boolean valid;

    public ObjectFields(int id, String name, boolean valid) {
        this.id = id;
        this.name = name;
        this.valid = valid;
    }

    /* -------------------- GETTERS & SETTERS -------------------- */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    @Override
    public String toString() {
        return "id: " + this.id + ", name: " + this.name + ", valid: " + this.valid;
    }
}

class OutsideMain {
    public static void main(String[] args) {
        ObjectFields gettersSetters = new ObjectFields(1, "Getter & Setter", true);
        System.out.println(gettersSetters.toString());
        
        /* You have to use a "getter" to access the value in an object (since it is PRIVATE) */
        System.out.println("id (with getter) " + gettersSetters.getId());
        // Trying to access it via: gettersSetters.id - will produce a "Field is not visible" error
        
        /* You have to use a "setter" to modify the value in an object (since it is PRIVATE) */
        gettersSetters.setName("New Name (set with setter)");
        System.out.println(gettersSetters.getName());
        // Trying to access it via: gettersSetters.name - will produce a "Field is not visible" error

    }
}