package OOPs.String.Immutability;

public class InternMethod {
    public static void main(String[] args) {
        String s = new String("Hello");
        String SCP = "Hello";
//        System.out.println(s.intern());
//        System.out.println(s.hashCode());
        String referenceFromSCP = s.intern();
        System.out.println(s==referenceFromSCP);
        System.out.println(SCP==referenceFromSCP);


        System.out.println("---------------------------------------------------------------------------------------------");
//
//        String a = "Hi";
//        String b = "Hi";
//        String c = new String("Hi");
//
//        System.out.println(a == b); // true
//        System.out.println(a == c.intern()); // false

    }
}
