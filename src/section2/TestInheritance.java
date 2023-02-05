package section2;

public class TestInheritance extends OuterMost {
    public static void main(String[] args) {
        new TestInheritance().testInnerClassMembers();
    }

    private void testInnerClassMembers() {
        // non-static method - instance of current class exists so inner
        // classes (with the right access modifiers) are available...
        new ProtectedInner(); //  notice here we can call  new ProtectedInner() directly since we already extends OuterMost
        // First Level
        new PublicInner(); //  notice here we can call  new PublicInner() directly since we already extends OuterMost

        this.new ProtectedInner(); // we can also do this to call ProtectedInner
        // First Level
        this.new PublicInner(); // we can also do this to call PublicInner

        this.new PackageInner(); // we can also do this to call PublicInner
        // Second Level
        new PublicInner().new NestedInnerSecondLevel();

        // Customized Second Level
        new KeepExtending();
    }

    // This inner class extends the inner class that was inherited
    // from the OuterMost class
    class KeepExtending extends OuterMost.PublicInner {
        KeepExtending() {
            System.out.println("Extend the inner class as an " +
                    "inherited member");
        }

        class ExtendingFurther extends
                OuterMost.PublicInner.NestedInnerSecondLevel {
            ExtendingFurther() {
                System.out.println("Extending a deeper level of " +
                        "an inherited member");
            }
        }
    }
}