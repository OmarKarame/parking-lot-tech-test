public abstract class Vehicle {

    protected int spaceNeeded;

    protected String numberPlate;

    public Vehicle(int spaceNeeded, String numberPlate){
        this.spaceNeeded = spaceNeeded;
        this.numberPlate = numberPlate;
    }
    public int getSpaceNeeded() {
        return spaceNeeded;
    }
    public String getNumberPlate() {
        return numberPlate;
    }
}
