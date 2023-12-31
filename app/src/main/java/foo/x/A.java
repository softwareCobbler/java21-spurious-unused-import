package foo.x;

// these imports are warned against as unused,
// but the permits clause doesn't compile without them
import foo.x.A.B;
import foo.x.A.C;

public sealed interface A permits B, C {
    record B(int data) implements A {}
    record C(String data) implements A {}
}
