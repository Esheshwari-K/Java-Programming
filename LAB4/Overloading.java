//Write a java program write a class A inside of class A there shld be add function to add integer value and double values derive this class B that shld have another function that concat 2 strings
class A{
    int add (int a, int b){
        return a+b;
    }
   double add (double a, double b){
        return a+b;
   }
}

class B extends A{
    String concat (String Str1, String Str2){
        return Str1+Str2;
    }
}

public class Overloading {
    public static void main(String[] args) {
        B obj = new B();
        int intSum=obj.add(10,20);
        double doubleSum=obj.add(10.5,20.5);
        String result=obj.concat( "Hello!", " Esha");
        System.out.println("Sum of two integers: "+intSum);
        System.out.println("Sum of two doubles: "+doubleSum);
        System.out.println("Concatenated String: "+result);
    }
}
