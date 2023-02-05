import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class A {}
class B extends A {}
class B1 extends B {}

class C  <T extends B> {

}

public class Test {
    public static void main (String[] args) {

        List<? super B> l1 = new ArrayList<>();
        List<? extends B> l2 = new ArrayList<>();
        l2.add(new C());

        List<?> l = new ArrayList<>();

        C<B1> dd = new C<B1>();

    }
}

// it will show 10/10/2020 10:10 AM
// The pattern incorrectly uses mm instead of MM in the first part of the pattern. mm is for minutes.
// In addition, uuu pattern prints out 4 digit year.

