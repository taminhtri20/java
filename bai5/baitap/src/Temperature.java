public class Temperature {
    public static void main(String[] args) {
        bai2 temperature = new bai2();
        temperature.setCelsius(25);
        System.out.println("Celsius: "+temperature.getCelsius());
        System.out.println("Fahrenheit: "+temperature.getFahrenheit());
        System.out.println("Kenvin: "+temperature.getKenvin());
    }
}
