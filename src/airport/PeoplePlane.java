package airport;

public class PeoplePlane extends AirPlane {

    private int maxNumberOfPassenger;
    private int currentNumberOfPassengers;



    public void load(int numberOfPassenger){
        if((this.currentNumberOfPassengers+numberOfPassenger) > this.maxNumberOfPassenger ){
            System.out.println("PeoplePlane "+this.getPlaneId()+" upload "+(this.maxNumberOfPassenger-this.currentNumberOfPassengers) + " passengers, "+ (numberOfPassenger-this.maxNumberOfPassenger)+" do not fit.");
            this.currentNumberOfPassengers=this.maxNumberOfPassenger;
        }
        else{
            this.currentNumberOfPassengers+=numberOfPassenger;
        }
    }


    public void unload(int numberOfPassenger){
        if(this.currentNumberOfPassengers<numberOfPassenger){
            System.out.println("PeoplePlane "+ this.getPlaneId() +" current number of passenger is less than order("+numberOfPassenger+")"); }
        else{
            this.currentNumberOfPassengers-=numberOfPassenger;}
    }


    public void land(int passanger){
        if(this.isCurrentlyFlying()==false){
            System.out.println("Airplain "+this.getPlaneId()+" can not land,because we are still on the ground");
        }
        else {
            System.out.println("PeoplePlane " + this.getPlaneId() + " lands.");
            this.setCurrentlyFlying(false);
            System.out.println("PeoplePlane " + this.getPlaneId() + " unloads " + passanger + " passengers.");
            unload(passanger);
        }

    }



    public void takeOff(int passanger){
        if(this.isCurrentlyFlying()==true){
            System.out.println("PeoplePlane "+this.getPlaneId()+" can not take off, because we are already flying.");
        }
        else{
            System.out.println("PeoplePlane "+ this.getPlaneId()+" takes off.");
            this.setCurrentlyFlying(true);
            System.out.println("PeoplePlane "+this.getPlaneId()+" loads "+passanger+ " passengers.");
            load(passanger);
        }
    }

    public boolean notFlyAndHasRoom(){
        if(this.isCurrentlyFlying()==false && (this.currentNumberOfPassengers < this.maxNumberOfPassenger)){
            System.out.println(this.getPlaneId()+ " requested. Is not flying, still room for "+ (this.getMaxNumberOfPassenger()- this.getCurrentNumberOfPassengers())+" passenger.");
        }
        return true;
    }


    //getter setter cons.
    public PeoplePlane(String planeId, boolean isCurrentlyFlying, double speed) {
        super(planeId, isCurrentlyFlying, speed);
        this.setAirplaneType("PeoplePlane");
    }

    public PeoplePlane(String planeId, boolean isCurrentlyFlying, double speed, int maxNumberOfPassenger, int currentNumberOfPassengers) {
        super(planeId, isCurrentlyFlying, speed);
        this.maxNumberOfPassenger = maxNumberOfPassenger;
        this.currentNumberOfPassengers = currentNumberOfPassengers;
        this.setAirplaneType("PeoplePlane");
    }

    public int getMaxNumberOfPassenger() {
        return maxNumberOfPassenger;
    }

    public void setMaxNumberOfPassenger(int maxNumberOfPassenger) {
        this.maxNumberOfPassenger = maxNumberOfPassenger;
    }

    public int getCurrentNumberOfPassengers() {
        return currentNumberOfPassengers;
    }

    public void setCurrentNumberOfPassengers(int currentNumberOfPassengers) {
        this.currentNumberOfPassengers = currentNumberOfPassengers;
    }

    @Override
    public String toString() {
        return "PeoplePlane " +this.getPlaneId();
    }
}