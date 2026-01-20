public class multilevelinheritance {
    public static void main(String[] args) {
        Dog kalu = new Dog();
        kalu.eat();
        kalu.legs =4;
        System.out.println(kalu.legs);
    }
}
class Animal{
    void eat(){
        System.out.println("Eats...");
    }
}
class Mammal extends Animal{
    int legs;
}
class Dog extends Mammal{
    String breed;
}
