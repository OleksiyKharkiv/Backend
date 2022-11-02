package DZ_27_10_2022;

public class Motorcycles {
    private String name;
    private int power;
    private String color;
    private int engineVolume;
    private int speed;

    public Motorcycles(String name, int power, String color, int engineVolume, int speed) {
        this.name = name;
        this.power = power;
        this.color = color;
        this.engineVolume = engineVolume;
        this.speed = speed;

    }

    @Override
    public String toString() {
        return "Motorcycles{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", color='" + color + '\'' +
                ", engineVolume=" + engineVolume +
                ", speed=" + speed +
                '}';
    }
}
