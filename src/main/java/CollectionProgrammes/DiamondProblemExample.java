// diamond problem example.
package CollectionProgrammes;
interface A {
    default void greet() {
        System.out.println("Hello from A");
    }
}

interface B {
    default void greet() {
        System.out.println("Hello from B");
    }
}

class C implements A, B {
    // Resolving the conflict
    @Override
    public void greet() {
        B.super.greet(); // Explicitly choosing A's implementation.
    }
}
public class DiamondProblemExample {
	
    public static void main(String[] args) {
        C c = new C();
        c.greet(); // Output: Hello from A
    }
}
