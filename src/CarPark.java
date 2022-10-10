import java.io.IOException;
import java.util.ArrayList;

public class CarPark {

    private int numOfMotorbikeSpaces;
    private ArrayList<Motorbike> motorbikesInCarPark = new ArrayList<>();
    private int numOfCarSpaces;
    private ArrayList<Car> carsInCarPark = new ArrayList<>();
    private int numOfVanSpaces;
    private ArrayList<Van> vansInCarPark = new ArrayList<>();
    private int numOVansTakingCarSpaces = 0;

    private boolean isEmpty = true;
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

    public boolean getIsEmpty(){
        return isEmpty;
    }

    public void addMotorbike(Motorbike m){
        if (numOfMotorbikeSpaces > 0 ){
            isEmpty = false;
            motorbikesInCarPark.add(m);
            numOfMotorbikeSpaces--;
        }
        else if (numOfMotorbikeSpaces == 0 && numOfCarSpaces == 0 && numOfVanSpaces == 0){
            System.out.println("The car park is full!!!");
        }
        else {
            System.out.println("There is no space for a motorbike!");
        }
    }

    public void addCar(Car c){
        if (numOfCarSpaces > 0){
            carsInCarPark.add(c);
            numOfCarSpaces --;
            isEmpty = false;
        }
        else if (numOfMotorbikeSpaces == 0 && numOfCarSpaces == 0 && numOfVanSpaces == 0){
            System.out.println("The car park is full!!!");
        }
        else {
            System.out.println("There is no space for a car!");
        }
    }

    public void addVan(Van v){
        if(numOfVanSpaces > 0){
            vansInCarPark.add(v);
            numOfVanSpaces --;
            isEmpty = false;
        }
        else if (numOfCarSpaces > 3){
            System.out.println("Added van in car spaces");
            numOfCarSpaces -= 3;
            numOVansTakingCarSpaces++;
            vansInCarPark.add(v);
        }
        else if (numOfMotorbikeSpaces == 0 && numOfCarSpaces == 0 && numOfVanSpaces == 0){
            System.out.println("The car park is full for a van to fit, but a car or two might fit!");
        }
        else {
            System.out.println("There is no space for a van!");
        }
    }
}
