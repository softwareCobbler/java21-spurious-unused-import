/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package foo;

import org.junit.jupiter.api.Test;

import foo.x.A;
import foo.x.A.B;
import foo.x.A.C;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void b() {
        var b = new B(42);
        assertEquals("42", get(b));
    }

    @Test void c() {
        var c = new C("42 but string");
        assertEquals("42 but string", get(c));
    }

    String get(A a) {
        return switch (a) {
            case B b -> String.valueOf(b.data());
            case C c -> c.data();
        };
    }
}
