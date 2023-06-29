public class Cat extends Animal{

    private String catFood;

    public Cat(String name, int age, String breed, String catFood) {
        super(name, age, breed);
        this.catFood = catFood;
    }

    public String getCatFood() {
        return catFood;
    }

    public void setCatFood(String catFood) {
        this.catFood = catFood;
    }

    public void meow(){
        System.out.println(this.getName() + " is meowing");
    }

// not really overriding
//    @Override
//    public void walk() {
//        super.walk();
//    }

//  keep the original and add something
//    @Override
//    public void walk() {
//        super.walk();
//        System.out.println("btw he's a cat");
//    }
//
// complete override
    @Override
    public void walk() {
        System.out.println(this.getName() + " is a cat and he is walking");
    }

    @Override
    public String toString() {
        return String.format("This cat has name %s, it is %s years old and it's a %s",this.getName(),this.getAge(),this.getBreed());
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Cat){
            Cat other = (Cat)obj;
            if(this.getName().equals(other.getName()) && this.getAge() == other.getAge() && this.getBreed().equals(other.getBreed()) && this.getCatFood().equals(other.getCatFood())){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}
