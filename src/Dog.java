public class Dog extends Animal {

    private String dogFood;

    public Dog(String name, int age, String breed, String dogFood) {
        super(name, age, breed);
        this.dogFood = dogFood;
    }

    public String getDogFood() {
        return dogFood;
    }

    public void setDogFood(String dogFood) {
        this.dogFood = dogFood;
    }

    public void bark(){
        System.out.println(this.getName() + " is barking");
    }
}
