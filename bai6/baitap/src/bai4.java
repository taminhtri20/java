public class bai4 {
    public static void main(String[] args) {
        Human adam = new Human("Adam", "nam", 70);
        Human eva = new Human("Eva", "nu", 43);

        Apple apple = new Apple();
        while (apple.getWeight()>0){
            adam.eat(apple);
            System.out.println("Qua tao con: "+apple.getWeight());
            System.out.println("Can nang cua Adam: "+adam.getWeight());
            eva.eat(apple);
            System.out.println("Qua tao con: "+apple.getWeight());
            System.out.println("Can nang cua Adam: "+eva.getWeight());
        }
    }
}
class Apple {
    public int getWeight() {
        return weight;
    }

    public int weight = 10;
}

class Human {
    public String name;
    public String gender;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int weight;

    public Human() {
    }

    public void say(String word) {
        System.out.println(word);
    }

    public void eat(Apple apple) {
        if (apple.getWeight() > 0) {
            System.out.println(name +" đã ăn 1 miếng táo");
            weight++;
            apple.weight--;
        } else {
            System.out.println("Táo hết mất rùi ạ!");
        }
    }

    public Human(String name, String gender, int weight) {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
