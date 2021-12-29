class Animal {
    int legs = 4;

    public static void eat (){
        System.out.println("animal is eating");
    }

}

class Dog extends Animal{
    public void bark(){
        System.out.println("Dog is barking");
    }
}
class Cat extends Animal {
    public void climbTree(){
        System.out.println("Cat is climbing tree");
    }
}

class SimpleInheritance {
    public static void main(String[] args){
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.bark();
        cat.climbTree();
        dog.eat();
    }
}