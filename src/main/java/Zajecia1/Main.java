package Zajecia1;

public class Main {

    public static void main2(String[] args) {

        MobilePhone testPhone = new MobilePhone("10", 256d, "Samsung 1234", "android", "mobile", "4g");
        Tablet testTablet = new Tablet("12", 512d, "Samsung 3456", "Android 345", " tablet", " 2 generacja");

        MobileDevice testPhoneAsaDevice = testPhone;
        MobileDevice tabletAsaDevice = testTablet;

        testPhoneAsaDevice.showDeviceInfo();

        // POPRAWIC UTWORZYC NAJPIERW MOBILE DEVICES A NASTEPNIE MOBILE PHONE I MOMBILE TABLET

    }


    public static void main(String[] args) {

        Student adamNiemickiewicz = new Student("Adam Niemickiewicz","ul. Piękna 21, Warszawa","Literatura","2023",20000d);
        Student annaKowalska = new Student("Anna Kowalska","ul. Radosna 4/12, Radom","Inzyniera Srodowiska","2021",15000d);

        adamNiemickiewicz.showDetails();
        annaKowalska.showDetails();

        Lecturer annaKumaniecka =  new Lecturer("Anna Kumaniecka", "ul. Podchorązych 6, Krakow", "matematyka", 8000d);
        annaKumaniecka.showDetails();

        Person ankum = annaKumaniecka;
        System.out.println(ankum.getName() + " " + ankum.getAdress());



    }
}






