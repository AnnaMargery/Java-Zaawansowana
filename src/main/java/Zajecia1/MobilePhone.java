package Zajecia1;

public class MobilePhone extends MobileDevice{

    private String lteSupport;  // boolean lte support;


    public MobilePhone(String rozmiarWyswietlacza, double pamiecRam, String cpu, String systemOperacyjny, String typUrzadzenia, String lteSupport) {
        super(rozmiarWyswietlacza,pamiecRam,cpu,systemOperacyjny,typUrzadzenia);
        this.lteSupport = lteSupport;
    }


    @Override
    public void showDeviceInfo(){

        super.showDeviceInfo();
        System.out.println(" Lte support: " + lteSupport );
    }









}
