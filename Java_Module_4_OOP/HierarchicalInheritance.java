public class HierarchicalInheritance { //Inheritance concept hierarchical Inheritance
    public static void main(String[] args) {
        Bus b=new Bus();
        b.carrypassengers();
        b.move();
        Truck t=new Truck();
        t.carrygoods();
        t.move();
    }
}
class Transport{
    void move(){
        System.out.println("Transport can travel ");
    }
}
class Bus extends Transport{
    void carrypassengers(){
        System.out.println("Bus can carry passengers");
    }
}
class Truck extends Transport{
    void carrygoods(){
        System.out.println("Truck can carry goods");
    }
}
