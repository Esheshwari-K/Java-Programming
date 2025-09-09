/*write a java program with class A, derive class b from class a and class c from class b now each class should have contructor and constructor shld  display for class a it shld display hello I m in class a, b or c (for every class-Java Multilevel Inheritance */
class A{
    A(){
        System.out.println("Hello, I'm in class A");
    }
} 
class B extends A{
    B(){
        System.out.println("Hello, I'm in class B");
    }
    }
class C extends B{
    C(){
        System.out.println("Hello, I'm in class C");
    }
}



public class Main {
    public static void main(String[] args) {
        C obj = new C();
    }
}
