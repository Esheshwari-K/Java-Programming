public class WrapperDemo {
    public static void main(String[] args) {
        // ✅ Manual Boxing (explicit conversion)
        Integer boxedInt = Integer.valueOf(100);
        Double boxedDouble = Double.valueOf(55.5);

        // ✅ Autoboxing (implicit conversion)
        Integer autoBoxedInt = 200; // int → Integer
        Boolean autoBoxedBool = true; // boolean → Boolean

        // ✅ Auto-unboxing (implicit conversion)
        int unboxedInt = autoBoxedInt; // Integer → int
        boolean unboxedBool = autoBoxedBool; // Boolean → boolean

        // ✅ Operations using wrapper objects
        int sum = boxedInt + autoBoxedInt; // auto-unboxed during arithmetic

        // ✅ Displaying results
        System.out.println("Manual Boxing: " + boxedInt + ", " + boxedDouble);
        System.out.println("Autoboxed: " + autoBoxedInt + ", " + autoBoxedBool);
        System.out.println("Unboxed: " + unboxedInt + ", " + unboxedBool);
        System.out.println("Sum of boxed values: " + sum);
    }
}
