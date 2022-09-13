package web.models;

public class Car {
    Long id;
    String name;
    int speed;
    public Car(Long id, String name, int speed) {
        this.id = id;
        this.name = name;
        this.speed = speed;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }

}
