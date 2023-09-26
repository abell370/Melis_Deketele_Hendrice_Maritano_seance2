package builder;

import model.Car;

/**
 * Interface where we can add similar question to create the car event if it's a sport or familiar car
 */
public interface Builder {
    Car create(String brand);
    String setColor();
}
