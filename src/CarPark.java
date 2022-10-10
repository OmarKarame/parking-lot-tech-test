import java.util.ArrayList;

public class CarPark {

    private int numOfMotorbikeSpaces;

    private ArrayList<Motorbike> motorbikes = new ArrayList<>();
    private int numOfCarSpaces;

    private ArrayList<Car> cars = new ArrayList<>();
    private int numOfVanSpaces;

    private ArrayList<Van> vans = new ArrayList<>();
    public CarPark(int numOfMotorbikeSpaces, int numOfCarSpaces, int numOfVanSpaces){
        this.numOfMotorbikeSpaces = numOfMotorbikeSpaces;
        this.numOfCarSpaces = numOfCarSpaces;
        this.numOfVanSpaces = numOfVanSpaces;
    }

    public int getTotalNumOfSpaces(){
        return numOfCarSpaces + numOfVanSpaces + numOfMotorbikeSpaces;
    }

    public int getNumOfMotorbikeSpaces() {
        return numOfMotorbikeSpaces;
    }

    public int getNumOfCarSpaces() {
        return numOfCarSpaces;
    }

    public int getNumOfVanSpaces() {
        return numOfVanSpaces;
    }

    public void addMotorbike(Motorbike m){
        if (motorbikes.size() < numOfMotorbikeSpaces){
            motorbikes.add(m);
        }
        else {
//            call the no space exception
        }
    }

    public void addCar(Car c){
        if (cars.size() < numOfCarSpaces){
            cars.add(c);
        }
        else {
//            call the no space exception
        }
    }

    public void addVan(Van v){
        if(vans.size() < numOfVanSpaces){
            vans.add(v);
        }
        else if (cars.size() - 2 < numOfCarSpaces){
            numOfCarSpaces -= 3;
            vans.add(v);
        }
        else {
//            call the no space exception
        }
    }
}
