package Zajecia1;

public class Tablet extends MobileDevice {


    private String pencilSupport; // boolean pencilSupport


    public Tablet(String rozmiarWyswietlacza, double pamiecRam, String cpu, String systemOperacyjny, String typUrzadzenia, String pencilSupport ) {
        super(rozmiarWyswietlacza,pamiecRam,cpu,systemOperacyjny,typUrzadzenia);
        this.pencilSupport = pencilSupport;
    }

    @Override
    public void showDeviceInfo(){

        super.showDeviceInfo();
        System.out.println(" Pencil support: " + pencilSupport );
    }

}
