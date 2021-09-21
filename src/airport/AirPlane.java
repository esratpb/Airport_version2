package airport;

public abstract class AirPlane {
    private String planeId;
    private String airplaneType;
    private boolean isCurrentlyFlying;
    private double speed;

//
    public AirPlane(String planeId,  boolean isCurrentlyFlying, double speed) {
        super();
        this.planeId = planeId;
        this.isCurrentlyFlying = isCurrentlyFlying;
        this.speed = speed;

    }

    public AirPlane(String airPlaneType) {
        super();
        this.airplaneType=airPlaneType;
    }

//
//    public void land(){}
//    public void takeoff(){}
    public void load(int x){ }
    public void unload(int y){}




    public String getPlaneId() {
        return planeId;
    }

    public void setPlaneId(String planeId) {
        this.planeId = planeId;
    }

    public String getAirplaneType() {
        return airplaneType;
    }

    public void setAirplaneType(String airplaneType) {
        this.airplaneType = airplaneType;
    }

    public boolean isCurrentlyFlying() {
        return isCurrentlyFlying;
    }

    public void setCurrentlyFlying(boolean currentlyFlying) {
        isCurrentlyFlying = currentlyFlying;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }


    public abstract boolean notFlyAndHasRoom();
}
