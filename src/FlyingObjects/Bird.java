/**Class: Bird
 * @author D Browner
 * @version 1.6
 * Course: ITEC 2140 Spring 2023
 * Written: March 12, 2024
 */
package FlyingObjects;

public class Bird implements Flight {
    private String type;

    public Bird(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void fly() {
        System.out.println("I'm a bird who flaps my wings to fly.");
    }

    @Override
    public String toString() {
        return String.format("Bird [type=%s]", type);
    }
}
