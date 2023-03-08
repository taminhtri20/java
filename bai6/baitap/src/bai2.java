public class bai2 {
    public static void main(String[] args) {
        ElectricLamp electricLamp = new ElectricLamp();
        SwitchButton switchButton = new SwitchButton(false,electricLamp);
        if (electricLamp.isStatus()==true){
            System.out.println("Status: ON");
        }else {
            System.out.println("Status: OFF");
        }
        switchButton.switchOn();
        if (electricLamp.isStatus()==true){
            System.out.println("Status: ON");
        }else {
            System.out.println("Status: OFF");
        }
        switchButton.switchOff();
        if (electricLamp.isStatus()==true){
            System.out.println("Status: ON");
        }else {
            System.out.println("Status: OFF");
        }
    }
}
class SwitchButton{
    public boolean status;
    ElectricLamp lamp = new ElectricLamp();
    public SwitchButton(){}
    public SwitchButton(boolean status, ElectricLamp lamp){
        this.status=status;
        this.lamp=lamp;
    }
    public void connectToLamp(ElectricLamp lamp){
        status = this.lamp.status;
    }
    public void switchOff(){
        this.lamp.status=false;
        this.status=false;
        System.out.println("da tat den");
    }
    public void switchOn(){
        this.lamp.status=true;
        this.status=true;
        System.out.println("da bat den");
    }
}
class ElectricLamp{
    public boolean status;
    public ElectricLamp(){}
    public ElectricLamp(boolean status){
        this.status=status;
    }

    public boolean isStatus() {
        return status;
    }
}
