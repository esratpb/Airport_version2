package airport;

import java.util.ArrayList;
import java.util.List;

public class Airport {
    private String airportName;
    private List<AirPlane> airPlanes;



    public Airport(String airportName, List<AirPlane> airPlanes) {
        this.airportName = airportName;
        this.airPlanes = airPlanes;
        airPlanes.add(new PeoplePlane("123ABCD",false,50,300,200));
        airPlanes.add(new PeoplePlane("123KLM",true,10,350,100));
        airPlanes.add(new PeoplePlane("123QWT",false,70,200,75));

    }
//
    public List<AirPlane> allAircraft(){
        System.out.println("Aircraft from airport "+ this.airportName);
        for(AirPlane airPlane :airPlanes){
            System.out.println(airPlane.toString());
        }
        return airPlanes;}

    public List<AirPlane> planesByType(String type){
        List<AirPlane> planesByTypeList=new ArrayList<>();
        for(AirPlane airPlane:airPlanes){
            if (airPlane.getAirplaneType()==type){
                planesByTypeList.add(airPlane);
                System.out.print(airPlane.toString()+", ");
            }
        }
        return planesByTypeList;
    }

    public List<AirPlane> notFlyAndHasRoom(){
        List<AirPlane> notFlyHasRoomAirPlane =new ArrayList<>();
        for (AirPlane airPlane :airPlanes){
            if(airPlane.notFlyAndHasRoom()){
                notFlyHasRoomAirPlane.add(airPlane);
            }
        }
        return notFlyHasRoomAirPlane;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public List<AirPlane> getAirplanes() {
        return airPlanes;
    }

    public void setAirplanes(List<AirPlane> airPlanes) {
        this.airPlanes = airPlanes;
    }

}
