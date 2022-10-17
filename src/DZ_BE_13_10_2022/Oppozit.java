package DZ_BE_13_10_2022;

public class Oppozit extends Moto {


    public Oppozit(String model, int cylinders, int maxSpeed) {
        this.model=model;
        this.cylinders=cylinders;
        this.maxSpeed=maxSpeed;
    }

    @Override
        public void start() {
            System.out.println("Kick-Start!");
        }

        @Override
        public void brake() {
            System.out.println("Drum brake");
        }

    @Override
    public String toString() {
        return "Oppozit{" +
                "model='" + model + '\'' +
                ", cylinders=" + cylinders +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

}


