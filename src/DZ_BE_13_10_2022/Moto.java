package DZ_BE_13_10_2022;

public abstract class Moto {

    String model;
    int cylinders;
    int maxSpeed;

    public Moto() {
        this.model = model;
        this.cylinders = cylinders;
        this.maxSpeed = maxSpeed;
    }

    public abstract void start();

    public abstract void brake();



    public Moto(String model, int cylinders, int maxSpeed) {
        this.model = model;
        this.cylinders = cylinders;
        this.maxSpeed = maxSpeed;
    }


}
