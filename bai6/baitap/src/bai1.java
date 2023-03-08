public class bai1 {
    public static void main(String[] args) {
        mouse Rat = new mouse("Rat","chit chit",3,true,5);
        cat Tom = new cat("Tom","meo meo",5,8);
        Tom.cactchTheMouse();
        Tom.eatTheMouse();
        System.out.println(Tom.getWeight());
    }

}
class cat{
    public String name,talk;
    public double weight;
    public int maxSpeed;
    public cat(){}
    mouse Rat = new mouse();
    public cat(String name,String talk,double weight,int maxSpeed){
        this.name=name;
        this.talk=talk;
        this.weight=weight;
        this.maxSpeed=maxSpeed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setTalk(String talk) {
        this.talk = talk;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTalk() {
        return talk;
    }

    public String getName() {
        return name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public void cactchTheMouse(){
        if (Rat.speed<this.maxSpeed){
            System.out.println("meo da bat dc chuot");
        }else {
            System.out.println("meo khong bat dc chuot");
        }
    }
    public void eatTheMouse(){
        if (Rat.status){
            this.weight = this.weight+ Rat.weight;
            Rat.status=false;
            System.out.println("chuot da bi an");
        }
    }
}
class mouse{
    public String name,talk;
    public double weight;
    public boolean status = true;
    public int speed;
    public mouse(){}
    public mouse(String name, String talk,double weight, boolean status,int speed){
        this.status=status;
        this.talk=talk;
        this.weight=weight;
        this.name=name;
        this.speed=speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isStatus() {
        if (this.status=false){
            System.out.println("mouse still live");
        }else {
            System.out.println("mouse was die");
        }
        return status;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public String getTalk() {
        return "chit, chit";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTalk(String talk) {
        this.talk = talk;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
