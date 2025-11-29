public class MultipulInheritance { //
    public static void main(String[] args) {
        Dog d = new Dog();
        d.play();
        d.bark();
    }
}
interface animal{
    void eat();
}
interface pet{
    void play();
}
class Dog implements animal, pet{
    public void eat(){
        System.out.println("Dog is eating");
    }
    public void play(){
        System.out.println("Dog is playing");
    }
    public void bark(){
        System.out.println("Dog is barking");
    }
}
