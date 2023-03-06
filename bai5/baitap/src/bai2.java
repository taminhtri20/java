public class bai2 {
    double celsius,fahrenheit,kenvin;
    public bai2(){}
    public bai2(double celsius, double fahrenheit, double kenvin){
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
        this.kenvin = kenvin;
    }
    public double getCelsius() {
        return celsius;
    }
    public double getFahrenheit() {
        return (celsius*9/5)+32;
    }
    public double getKenvin() {
        return celsius+273.15;
    }
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }
    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }
    public void setKenvin(double kenvin) {
        this.kenvin = kenvin;
    }
}
