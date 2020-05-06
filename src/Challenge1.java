//The compiler will give chance to child class, if we have two Overloaded method with parent child relationship.
//Here Object is parent and String is child so compiler will give chance to String parameterised method.

public class Challenge1 {
    public static void whoAmI(String s) {
        System.out.println("String");
    }

    public static void whoAmI(Object o) {
        System.out.println("Object");
    }

    public static void main(String args[]) {
        whoAmI(null);
    }
}
