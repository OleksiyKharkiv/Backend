package DZ_27_10_2022;

public class Motorcycles {
    private String name;
    int power;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(int engineVolume) {
        this.engineVolume = engineVolume;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public static <mot1> void main(String[] args) {
        String Ural = new String();
        String green = new String();
        mot1 Motorcycles = new Motorcycles(Ural, 36, green, 650, 105);
    }

    public static <mot2>void main(String[] args) {
        String Jawa = new String();
        String red = new String();
        mot2 Motorcycles = new Motorcycles(Jawa, 18, red, 350, 150);

    }


}
