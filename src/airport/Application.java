package airport;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {

        PeoplePlane peoplePlane1 =new PeoplePlane("123ABC",true,50,300,250);
        PeoplePlane peoplePlane2 =new PeoplePlane("987XYZ",false,3,400,300);
        CargoPlane cargoPlane1 =new CargoPlane("Car987XYZ",true,400,12);
        CargoPlane cargoPlane =new CargoPlane("Car123ABC",false,400,14);

        peoplePlane1.land(12);
        peoplePlane1.takeOff(40);
        peoplePlane2.land(11);
        peoplePlane1.land(20);
        peoplePlane2.takeOff(40);
        peoplePlane1.takeOff(10);

        Airport airport1=new Airport("Schiphol",new ArrayList<>());
        airport1.getAirplanes().add(peoplePlane1);
        airport1.getAirplanes().add(cargoPlane);

        airport1.allAircraft();
        airport1.notFlyAndHasRoom();

        Airport airport2=new Airport("Eindhoven",new ArrayList<>());
        airport2.allAircraft();
        airport2.notFlyAndHasRoom();


    }
}
