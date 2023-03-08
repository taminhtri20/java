public class bai1 {
    public static void main(String[] args) {
        Battery battery = new Battery(10);
        FlashLamp flashLamp = new FlashLamp(true,battery);
        flashLamp.getStatus();
    }
}
class Battery{
    public int energy;
    public Battery(){};
    public Battery(int energy){
        this.energy=energy;
    }
}
class FlashLamp{
    public boolean status;
    Battery battery = new Battery();
    public FlashLamp(){}
    public FlashLamp(boolean status, Battery battery){
        this.status=status;
        this.battery=battery;
    }
    public void getStatus(){
        if (battery.energy>0){
            status=true;
            System.out.println("den dang bat");
            battery.energy--;
        }else {
            System.out.println("den het pin");
        }
    }
}
