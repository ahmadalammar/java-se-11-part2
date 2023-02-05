package locale;

import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.ResourceBundle;

// this must be public
public class SpecialResource_fr extends ListResourceBundle {
    public SpecialResource_fr() {
        // Constructor
    }
    protected Object[][] getContents() {
        return new Object[][]{{"Manager", new Person("Jane", 40)}};
    }
}

class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "{" + name + " is " + age + " years old}";
    }
}

class Test {
    public static void main(String[] args) {
        Locale locale = Locale.CANADA_FRENCH;
        ResourceBundle bundle = ResourceBundle.getBundle("SpecialResource", locale);
        Person person = (Person) bundle.getObject("Manager");
        System.out.println(person);
    }
}