package airport;

public class CargoPlane extends AirPlane {
    private int capacity;  //max capacity is 20 ton


    @Override
    public void load(int ton){
        if((this.capacity+ton) > 20){           
            System.out.println("CargoPlane "+this.getPlaneId()+" upload "+(20-this.capacity) + " ton, "+ (ton-20)+" do not fit.");
            this.capacity=20;
        }
        else{
            this.capacity+=ton;
        }
    }
    
    @Override
    public void unload(int ton){
        if(this.capacity<ton){
            System.out.println("CargoPlane "+ this.getPlaneId() +" current ton is less than order("+ton+")"); }
        else{
            this.capacity-=ton;}
    }



    public void land(int ton){
        if(this.isCurrentlyFlying()==false){
            System.out.println("CargoPlain"+this.getPlaneId()+" can not land,because it is still on the ground");
        }
        else {
            System.out.println("CargoPlane " + this.getPlaneId() + " lands.");
            this.setCurrentlyFlying(false);
            System.out.println("CargoPlane " + this.getPlaneId() + " unloads " + ton + " ton.");
            unload(ton);
        }

    }

    public void takeOff(int ton){
        if(this.isCurrentlyFlying()==true){
            System.out.println("CargoPlane "+this.getPlaneId()+" can not take off, because we are already flying.");
        }
        else{
            System.out.println("CargoPlane "+ this.getPlaneId()+" takes off.");
            this.setCurrentlyFlying(true);
            System.out.println("CargoPlane "+this.getPlaneId()+" loads "+ton+ " tons.");
            load(ton);
        }
    }

    public boolean notFlyAndHasRoom(){
        if(this.isCurrentlyFlying()==false && (this.capacity < 20)){
            System.out.println(this.getPlaneId()+ " requested. Is not flying, still room for "+ (20- this.capacity)+" ton.");
        }
        return true;
    }


    //getter setter cons.

    public CargoPlane(String planeId, boolean isCurrentlyFlying, int speed) {
        super(planeId,isCurrentlyFlying, speed);
        this.setAirplaneType("CargoPlane");
    }

    

    public CargoPlane(String planeId, boolean isCurrentlyFlying, int speed, int capacity) {
        super(planeId,isCurrentlyFlying, speed);
        this.capacity = capacity;
        this.setAirplaneType("CargoPlane");
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "CargoPlane " +this.getPlaneId()
               ;
    }
}
