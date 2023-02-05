package annotations.annotations;


// Annotating a class
@TypeAnnotation
public class AnnotateEverythingExample {

    // Annotating a field
    @AttributeAnnotation
    private String aField;

    // Annotating a constructor
    @ConstructorAnnotation
    AnnotateEverythingExample() {

    }

    // Annotating a method
    @MethodAnnotation
    // Annotating a method parameter
    void doSomething(@MethodParameterAnnotation String s) {

        // Annotating a local variable
        @LocalVariableAnnotation
        var localVariable = 1;

        System.out.println(s);

    }

//    // Annotating a type parameter
//    // notice here we did not specify the target, it will show compiler error
//    <@TypeParameterAnnotation T> T getSomething(T t) {
//        return t;
//    }
//
//    public static void main(String[] args) {
//
//        // Annotating a use of a type (TYPE_USE) in a new object
//        // notice here we did not specify the target, it will show compiler error
//        AnnotateEverythingExample e = new @TypeUseAnnotation AnnotateEverythingExample();
//        Object o = e;
//
//        // Annotating a use of a type (TYPE_USE) while casting
//        AnnotateEverythingExample e2 = (@TypeUseAnnotation AnnotateEverythingExample) o;
//        e.doSomething("Hello");
//
//    }
}