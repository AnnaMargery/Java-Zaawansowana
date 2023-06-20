package Zajecia1;

public class MobileDevice {

    private String rozmiarWyswietlacza;
    private double pamiecRam; //int
    private String cpu; // double
    private String systemOperacyjny;
    private String typUrzadzenia;

    public MobileDevice(String rozmiarWyswietlacza, double pamiecRam, String cpu, String systemOperacyjny, String typUrzadzenia) {
        this.rozmiarWyswietlacza = rozmiarWyswietlacza;
        this.pamiecRam = pamiecRam;
        this.cpu = cpu;
        this.systemOperacyjny = systemOperacyjny;
        this.typUrzadzenia = typUrzadzenia;
    }


public void showDeviceInfo (){

    System.out.println("Rozmiar wyswietlacza :" + getRozmiarWyswietlacza() + " " + "Pamiec ram: " + getPamiecRam() + " " + " CPU" + getCpu() + " " + " system"+ getSystemOperacyjny() + " " + " typ urządzenia" + getTypUrzadzenia() );
    System.out.printf("%s %s %s %s %s", rozmiarWyswietlacza,pamiecRam,cpu,systemOperacyjny,typUrzadzenia);
}


    public String getRozmiarWyswietlacza() {
        return rozmiarWyswietlacza;
    }

    public void setRozmiarWyswietlacza(String rozmiarWyswietlacza) {
        this.rozmiarWyswietlacza = rozmiarWyswietlacza;
    }

    public double getPamiecRam() {
        return pamiecRam;
    }

    public void setPamiecRam(double pamiecRam) {
        this.pamiecRam = pamiecRam;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getSystemOperacyjny() {
        return systemOperacyjny;
    }

    public void setSystemOperacyjny(String systemOperacyjny) {
        this.systemOperacyjny = systemOperacyjny;
    }

    public String getTypUrzadzenia() {
        return typUrzadzenia;
    }

    public void setTypUrzadzenia(String typUrzadzenia) {
        this.typUrzadzenia = typUrzadzenia;
    }
}
