public class hierarchial {
    public static void main(String[] args) {
        Bird crow = new Bird();
        crow.eat();
    }
}
class Animal{
    void eat(){
        System.out.println("Eats...");
    }
    void breathe(){
        System.out.println("Breathes...");
    }
}
class Mammal extends Animal{
    void walk(){
        System.out.println("Walks..");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("Swims..");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("Flys..");
    }
}
