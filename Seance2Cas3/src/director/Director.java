package director;

import builder.Builder;
import model.Car;

public class Director {

    private final Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Car init(String brand) {
        return this.builder.create(brand);
    }
}
