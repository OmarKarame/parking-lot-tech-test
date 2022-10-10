import java.util.ArrayList;

public class Controller {

    private ArrayList<Motorbike> motorbikes = new ArrayList<>();

    private ArrayList<Car> cars = new ArrayList<>();

    private ArrayList<Van> vans = new ArrayList<>();

    public void run(){
        CarPark carPark = new CarPark(15, 20, 5);

        createMotorbikes();
        for (Motorbike motorbike : motorbikes) {
             carPark.addMotorbike(motorbike);
        }

        createCars();
        for (Car car: cars) {
            carPark.addCar(car);
        }

        createVans();
        for (Van van: vans) {
            carPark.addVan(van);
        }

        Van v6 = new Van("N0Q228");
        carPark.addVan(v6);

        System.out.println("There are " + carPark.getTotalNumOfSpaces() + " total spaces left in the car park!");

        System.out.println("There are " + carPark.getNumOfMotorbikeSpaces() + " spaces for motorbikes left!");
        System.out.println("There are " + carPark.getNumOfCarSpaces() + " spaces for cars left!");
        System.out.println("There are " + carPark.getNumOfVanSpaces() + " spaces for vans left!");

        if (carPark.getIsEmpty()){
            System.out.println("The car park is empty!");
        }

    }

    public void createMotorbikes(){
        Motorbike m1 = new Motorbike("T081Y1");
        Motorbike m2 = new Motorbike("A031Y5");
        Motorbike m3 = new Motorbike("U43A");
        Motorbike m4 = new Motorbike("TO123");
        motorbikes.add(m1);
        motorbikes.add(m2);
        motorbikes.add(m3);
        motorbikes.add(m4);
    }

    public void createCars(){
        Car c1 = new Car("X07W12");
        Car c2 = new Car("D0G");
        Car c3 = new Car("U75VS");
        cars.add(c1);
        cars.add(c2);
        cars.add(c3);
    }

    public void createVans(){
        Van v1 = new Van("I08W28");
        Van v2 = new Van("W964NQ");
        Van v3 = new Van("PR5123");
        Van v4 = new Van("QI1U34");
        Van v5 = new Van("U6163O");
        vans.add(v1);
        vans.add(v2);
        vans.add(v3);
        vans.add(v4);
        vans.add(v5);
    }

}
