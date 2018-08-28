//package Java第三次上机;
//package Java第二次上级;
/**
*
*author:liuxv
*student_number:15130120185
*email:liuxver444@gmail.com
*email1:1369058574@qq.com
*/
public abstract class PIMEntity {
    String Priority; // every kind of item has a priority

    // default constructor sets priority to "normal"
    PIMEntity() {
        Priority = "normal";
    }

    // priority can be established via this constructor.
    PIMEntity(String priority) {
        Priority =  priority;
    }

    // accessor method for getting the priority string
    public String getPriority() {
        return Priority;
    }
    // method that changes the priority string
    public void setPriority(String p) {
        Priority = p;
    }

    // Each PIMEntity needs to be able to set all state information
    // (fields) from a single text string.
    abstract public void fromString(String s);

    // This is actually already defined by the super class
    // Object, but redefined here as abstract to make sure
    // that derived classes actually implement it
    abstract public String toString();
}

