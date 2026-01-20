public class constructor {
    public static void main(String[] args) {
        Student s = new Student("manoj");
        System.out.println(s.name);
    }
}

class Student {
    String name ;
    int roll;

    Student(String name ){
        this.name = name;
    }
}
