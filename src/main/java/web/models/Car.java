package web.models;

public class Car {
    Long id;

    public Long getId() {
        return id;
    }


    String name;

    public String getName() {
        return name;
    }


    int speed;

    public int getSpeed() {
        return speed;
    }


    public Car(Long id, String name, int speed) {
        this.id = id;
        this.name = name;
        this.speed = speed;
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
