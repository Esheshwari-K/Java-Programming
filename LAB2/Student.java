// To understand class with object
class Student{
    String name;
    int age;
    void displayInfo(){
        System.out.println("Name: "+ name + ", Age: "+ age);
    }
    public static void main(String[] args){
        Student s1= new Student();
        s1.name ="Esha";
        s1.age=18;
        s1.displayInfo();
    }
