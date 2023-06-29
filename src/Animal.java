public class Animal {
    private String name;
    private int age;
    private String breed;

    public Animal(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void walk(){
        System.out.println(this.name + " is walking");
    }

    @Override
    public String toString() {
        return String.format("This animal has name %s, it is %s years old and it's a %s",this.name,this.age,this.breed);
    }


}
