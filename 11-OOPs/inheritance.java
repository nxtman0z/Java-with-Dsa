public class inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
        shark.breathe();
        shark.swim();
    }
}
//parent class/base class
class Animal{
    //String color;
    void eat(){
        System.out.println("Eats...");
    }
    void breathe(){
        System.out.println("Breathes...");
    }
}
//child class /derived class
class Fish extends Animal{
    //int fins;
    void swim(){
        System.out.println("Swims...");
    }
}
