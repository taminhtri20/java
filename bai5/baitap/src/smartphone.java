import java.util.Scanner;

public class smartphone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mobile mobile = new Mobile();
        Mobile iphone = new Mobile();
        System.out.println("What would you like to do: ");
        System.out.println("1.Battery");
        System.out.println("2.Check status");
        System.out.println("3.On");
        System.out.println("4.Off");
        System.out.println("5.Charge");
        System.out.println("6.Typing Message");
        System.out.println("7.Receive Message");
        System.out.println("8.Send Message");
        System.out.println("9.Check MessageReceive");
        System.out.println("10.Check MessageSend");
        int choice = -1;
        while (choice != 0) {
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Battery Mobile: " + mobile.getBattery());
//                    System.out.println("Battery Iphone: " + iphone.getBattery());
                    break;
                case 2:
                    if (mobile.isStatus() == true) {
                        System.out.println("Status: On");
                    } else {
                        System.out.println("Status: Off");
                    }
//                    if (iphone.isStatus() == true) {
//                        System.out.println("Status: On");
//                    } else {
//                        System.out.println("Status: Off");
//                    }
                    break;
                case 3:
                    mobile.setStatus(true);
//                    iphone.setStatus(true);
                    break;
                case 4:
                    mobile.setStatus(false);
//                    iphone.setStatus(false);
                    break;
                case 5:
                    mobile.setBattery(100);
//                    iphone.setBattery(100);
                    break;
                case 6:
                    if (mobile.getBattery()>0||mobile.getBattery()<101){
                        System.out.print("Typing: ");
                        scanner.nextLine();
                        String typing = scanner.nextLine();
                        mobile.soanTinNhan(typing);
//                    iphone.sendMessage(iphone);
                        mobile.battery--;
                    }else {
                        System.out.println("het pin");
                    }
                    break;
                case 7:
                    mobile.receiveMessage(mobile.typing);
                    mobile.battery--;
                    break;
                case 8:
                    mobile.sendMessage(mobile);
                    mobile.battery--;
                    break;
                case 9:
                    mobile.checkMessage();
                    mobile.battery--;
                    break;
                case 10:
                    mobile.checkSendMessage();
                    mobile.battery--;
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice");
                    break;
            }
        }
    }
}
    class Mobile{
        public int battery=100, truBattery;
        public boolean status;
        public String[] sendMessage;
        public int countSendMessage=0;
        public String[] receiveMessage;
        public int countReceiveMessage=0;
        String typing;

        public int getBattery() {
            return battery;
        }

        public void setBattery(int battery) {
            this.battery = battery;
        }

        public Mobile(){
            this.sendMessage=new String[100];
            this.receiveMessage=new String[100];
        }
        public Mobile(int battery,boolean status,String[] sendMessage,String[] receiveMessage){
            this();
            this.battery=battery;
            this.status=status;

        }

        public boolean isStatus() {
            return status;
        }

        public void setStatus(boolean status) {
            this.status = status;
        }
        public void soanTinNhan(String typing){
            this.typing=typing;
        }
        public void sendMessage(Mobile receiver){
            if (battery>0||battery<101){
                if (!typing.equals("")){
                    this.sendMessage[countSendMessage++]=this.typing;
                    receiver.receiveMessage(this.typing);
                    this.typing="";
                }
            }else {
                System.out.println("het pin");
            }
        }
        public void checkSendMessage(){
            if (battery>0||battery<101){
                for (int i=0; i<countSendMessage;i++){
                    System.out.println("tin nhan "+(i+1)+" la: "+sendMessage[i]);
                }
            }else {
                System.out.println("het pin");
            }
        }
        public void receiveMessage(String typing){
            if (battery>0||battery<101){
                this.receiveMessage[countReceiveMessage++]=typing;
            }else {
                System.out.println("het pin");
            }
        }
        public void checkMessage(){
            if (battery>0||battery<101){
                for (int i=0;i<countReceiveMessage;i++){
                    System.out.println("tin nhan nhan "+(i+1)+" la: "+receiveMessage[i]);
                }
            }else {
                System.out.println("het pin");
            }
        }
    }


