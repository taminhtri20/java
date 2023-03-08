public class bai3 {
    public static void main(String[] args) {
        Tivi tv = new Tivi(2,10);
        Remote remote = new Remote(123,tv);
        tv.turnOn();
        tv.getStatus();
        tv.turnOff();
        tv.getStatus();
        tv.turnOn();
        System.out.println("Channel: "+tv.getChannel());
        System.out.println("Volume: "+tv.getVolume());
        remote.setChanel(3);
        System.out.println("Channel: "+tv.getChannel());
        remote.setVolume(3);
        System.out.println("Volume: "+tv.getVolume());
    }
}
class Remote{
    public int id;
    public Remote(){}
    Tivi tv = new Tivi();
    public Remote(int id,Tivi tv){
        this.id=id;
        this.tv=tv;
    }
    public void setChanel(int chanel){
        this.tv.channel=chanel;
        System.out.println("da chuyen sang kenh:"+chanel);
    }
    public void setVolume(int volume){
        this.tv.volume=volume;
        System.out.println("da doi am luong: "+volume);
    }
}
class Tivi{
    public boolean status=false;
    public int volume,channel;
    public Tivi(){}
    public Tivi(int volume,int channel){
        this.channel=channel;
        this.volume=volume;
    }
    public void turnOn(){
        this.status=true;
        System.out.println("da bat tv");
    }
    public void turnOff(){
        this.status=false;
        System.out.println("da tat tv");
    }
    public void getStatus(){
        if (this.status==true){
            System.out.println("Tv dang bat");
        }else {
            System.out.println("Tv dang tat");
        }
    }

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
