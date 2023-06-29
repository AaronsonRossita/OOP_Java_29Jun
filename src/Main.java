public class Main {


    public static void main(String[] args) {

        Animal animal = new Animal("aa",1,"bb");
        Cat cat = new Cat("Hatool",10,"street","Whiskas");
        Cat cat2 = new Cat("Hatool",10,"street","Whiskas");
        Kitten kitten = new Kitten("Mizi",1,"street","Friskies");
        Dog dog = new Dog("Spike",3,"Pitbull","Pedigree");

//        animal.walk();
//        cat.walk();
//        kitten.walk();
//        dog.walk();
//
//        printAnimalName(cat);
//        printAnimalName(dog);
//        printAnimalName(animal);
//        cat.meow();
//        kitten.meow();
//        dog.bark();
//       makeNoise(kitten);
//        System.out.println(animal);
//        System.out.println(cat);
//        System.out.println(kitten);
//        System.out.println(dog);
//        Cat catCopy = cat;
//        System.out.println(cat.equals(catCopy));
//        System.out.println(cat.equals(cat2));
//
//        Book b1 = new Book("A","CC");
//        Book b2 = new Book("A","CC");
//        Book b3 = new Book("A","CC");
//        Book b4 = b2;
//
//
//        System.out.println("b1 == b2 " +  b1 + " ==  " + b2 + " | " + b1.equals(b2)); // true
//        System.out.println("b1 == b3 " +  b1 + " ==  " + b3 + " | " + b1.equals(b3)); // true
//        System.out.println("b1 == b4 " +  b1 + " ==  " + b4 + " | " + b1.equals(b4)); // true
//        System.out.println("b2 == b4 " +  b2 + " ==  " + b4 + " | " + b2.equals(b4)); // true

        Chair c1 = new Chair("Office",1,350.0);
        Chair c2 = new Chair("Stool",4,152.4);
        Chair c3 = new Chair("Stool",4,152.4);
        System.out.println(c2.equals(c3));
        System.out.println(c3.equals(c1));
    }

    public static void printAnimalName(Animal a){
        System.out.println(a.getName());
    }

    public static void makeNoise(Animal a){
        if(a instanceof Cat){
            ((Cat)a).meow();
        }else if(a instanceof Dog){
            ((Dog) a).bark();
        }else{
            System.out.println("this animal can't talk");
        }

    }


}